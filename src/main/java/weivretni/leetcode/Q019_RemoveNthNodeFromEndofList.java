package weivretni.leetcode;

import weivretni.ListNode;

/**
 * Given a linked list, remove the nth node
 * 
 * from the end of list and return its head.
 * 
 * For example,
 * 
 * Given linked list: 1->2->3->4->5, and n = 2.
 * 
 * After removing the second node from the end, the linked
 * 
 * list becomes 1->2->3->5.
 * 
 * Note: Given n will always be valid.
 * 
 * Try to do this in one pass.
 * 
 * @author gzhang
 * 
 */
public class Q019_RemoveNthNodeFromEndofList {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return head;
        } else {
            // Move the fast pointer ahead
            ListNode curr = head;
            ListNode next = head;
            while (n > 0 && next.next != null) {
                next = next.next;
                n--;
            }

            // Now start move both
            while (next.next != null) {
                curr = curr.next;
                next = next.next;
            }

            // Now found it
            curr.next = curr.next.next;
            return head;
        }
    }
}
