package weivretni.leetcode;

import weivretni.RandomListNode;

import java.util.HashMap;
import java.util.Map;

/**
 * A linked list is given such that each node contains an additional random pointer which could point to any node in the
 * list or null.
 * 
 * Return a deep copy of the list.
 * 
 * @author gzhang
 * 
 */
public class Q138_CopyListWithRandomPointer {

    public RandomListNode copyRandomList(RandomListNode head) {
        if (head == null) {
            return null;
        } else {

            Map<RandomListNode, RandomListNode> nodeMap = new HashMap<RandomListNode, RandomListNode>();

            RandomListNode p = head;
            RandomListNode pNew = new RandomListNode(p.label);

            nodeMap.put(p, pNew);

            while (p != null) {
                p = p.next;
                if (p != null) {
                    RandomListNode newNode = new RandomListNode(p.label);
                    pNew.next = newNode;
                    pNew = pNew.next;
                    nodeMap.put(p, newNode);
                }
            }

            // Now duplicate the random node ponter
            p = head;
            while (p != null) {
                RandomListNode newPNode = nodeMap.get(p);
                RandomListNode pBuddy = p.random;
                RandomListNode newBuddy = nodeMap.get(pBuddy);
                newPNode.random = newBuddy;

                p = p.next;
            }

            return nodeMap.get(head);
        }
    }
}
