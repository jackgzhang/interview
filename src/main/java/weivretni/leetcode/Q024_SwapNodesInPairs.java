package weivretni.leetcode;

import weivretni.ListNode;

/**
 * <pre>
 * Given a linked list, swap every two adjacent nodes and return its head.
 * 
 * For example,
 * Given 1->2->3->4, you should return the list as 2->1->4->3.
 * 
 * Your algorithm should use only constant space. You may not modify the values in the list, 
 * 
 * only nodes itself can be changed.
 * 
 * 
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 * </pre>
 * 
 * @author gzhang
 *
 */
public class Q024_SwapNodesInPairs {

    public ListNode swapPairs(ListNode head) {

        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;

        ListNode cur = dummyHead;
        ListNode probe = cur.next;
        while (probe != null && probe.next != null) {
            cur.next = probe.next;
            probe.next = probe.next.next;
            cur.next.next = probe;
            cur = probe;
            probe = probe.next;
        }
        return dummyHead.next;
    }
}
