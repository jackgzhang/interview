package weivretni.leetcode;

import weivretni.ListNode;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/**
 * Merge k sorted linked lists and return it as one sorted list.
 * 
 * Analyze and describe its complexity.
 * 
 * http://www.lifeincode.net/programming/leetcode-merge-k-sorted-lists-java/
 * 
 * @author gzhang
 * 
 */
public class Q023_MergekSortedLists {

    public ListNode mergeKLists(List<ListNode> lists) {
        PriorityQueue<ListNode> heap = new PriorityQueue<ListNode>(10, new Comparator<ListNode>() {

            public int compare(ListNode o1, ListNode o2) {
                // TODO Auto-generated method stub
                return o1.val - o2.val;
            }

        });

        // Sort first
        for (int i = 0; i < lists.size(); i++) {
            ListNode node = lists.get(i);
            if (node != null) {
                heap.offer(node);
            }
        }
        ListNode head = null;
        ListNode pre = head;
        while (heap.size() > 0) {
            ListNode cur = heap.poll();
            if (head == null) {
                head = cur;
                pre = head;
            } else {
                pre.next = cur;
            }
            pre = cur;
            if (cur.next != null)
                heap.offer(cur.next);
        }
        return head;
    }
}
