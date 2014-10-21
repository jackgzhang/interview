package weivretni.mixpanel;

import weivretni.ListNode;

/**
 * Implement the reversal of a singly linked list iteratively and recursively.
 * 
 * @author gzhang
 * 
 */
public class Reverse {

    /**
     * Iterative
     * <p>
     * Return tail node
     * 
     * @param head
     */
    public void reverse1(ListNode head) {

        if (head == null) {
            return;
        }

        ListNode current = head;
        ListNode next = head.next;
        head.next = null;

        ListNode tmp;
        while (next != null) {
            tmp = next.next;

            next.next = current;
            current = next;
            next = tmp;
        }
    }

    /**
     * Recursive
     * <p>
     * Return tail node.
     * 
     * @param head
     */
    public ListNode reverse2(ListNode head) {

        if (head == null) {
            return null;
        } else if (head.next == null) {
            return head;
        } else {
            ListNode rest = reverse2(head.next);
            rest.next = head;
            head.next = null;
            return head;
        }
    }
}
