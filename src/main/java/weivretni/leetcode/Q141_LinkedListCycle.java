package weivretni.leetcode;

import weivretni.ListNode;

/**
 * Given a linked list, determine if it has a cycle in it.
 * 
 * Follow up: Can you solve it without using extra space?
 * 
 * <pre>
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * class ListNode {
 * 
 *     int val;
 *     ListNode next;
 * 
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
public class Q141_LinkedListCycle {

    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        } else {
            ListNode p1 = head;
            ListNode p2 = head.next;

            while (p1 != null && p2 != null && p1 != p2) {
                p1 = p1.next;
                p2 = p2.next;
                if (p2 != null) {
                    p2 = p2.next;
                }
            }

            return (p2 == null) ? false : true;

        }
    }
}
