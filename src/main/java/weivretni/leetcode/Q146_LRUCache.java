package weivretni.leetcode;

import weivretni.ListNode;

import java.util.HashMap;
import java.util.Map;

/**
 * <pre>
 * Design and implement a data structure for Least Recently Used (LRU) cache. It should support the following 
 * 
 * operations: get and set.
 * 
 * get(key) - Get the value (will always be positive) of the key if the key exists in the cache, otherwise return -1.
 * set(key, value) - Set or insert the value if the key is not already present. When the cache reached its capacity, 
 * 
 * it should invalidate the least recently used item before inserting a new item.
 * </pre>
 * 
 * http://www.programcreek.com/2013/03/leetcode-lru-cache-java/
 * 
 * 
 * 用 （1） hashMap 保存 key->Node
 *    (2)  双向链表 保存 node 
 *    
 *    O(1) on insert/get
 * 
 * 
 * @author gzhang
 * 
 */
public class Q146_LRUCache {

    ListNode headNode = new ListNode();
    ListNode tailNode = new ListNode();

    private Map<Integer, ListNode> valueHash = new HashMap<Integer, ListNode>();

    private int maxcapacity = 0;
    private int currcapacity = 0;

    public Q146_LRUCache(int capacity) {
        this.maxcapacity = capacity;

        // init headNode
        headNode.next = tailNode;
        tailNode.pre = headNode;

    }

    public int get(int key) {
        if (valueHash.containsKey(key)) {

            // Get also moves this node to head
            ListNode node = valueHash.get(key);

            removeNode(node);
            addNode(node);

            return valueHash.get(key).val;
        } else {
            return -1;
        }
    }

    public void set(int key, int value) {

        if (valueHash.containsKey(key)) {
            ListNode node = valueHash.get(key);

            removeNode(node);
            addNode(node);
        } else {
            ListNode node = new ListNode();
            node.key = key;
            node.val = value;
            
            addNode(node);
        }
        
        if (currcapacity < maxcapacity) { // <-- Add new node
            currcapacity++;
        } else { // <--- rearrange
            // remove the tail node
            removeNode(tailNode.pre);

        }
    }

    /**
     * Add node to head
     * 
     * @param node
     */
    private void addNode(ListNode node) {
        valueHash.put(node.key, node);

        ListNode firstNode = headNode.next;

        headNode.next = node;
        node.pre = headNode;

        node.next = firstNode;
        firstNode.pre = node;
    }

    private void removeNode(ListNode node) {

        valueHash.remove(node.key);

        ListNode prevNode = node.pre;
        ListNode nextNode = node.next;

        prevNode.next = nextNode;
        nextNode.pre = prevNode;
    }
}
