package weivretni.lintcode;

import weivretni.ListNode;

public class RotateRight {

    public ListNode rotateRight(ListNode head, int k) {
        // write your code here
        if (head == null || k == 0) {
            return head;
        } else {
            int index = 0;
            ListNode p1 = head;
            ListNode p2 = head;
            while (p2.next != null && index < k) {
                p2 = p2.next;
                index++;
            }

            while (p2.next != null && p1.next != null) {
                p1 = p1.next;
                p2 = p2.next;
            }

            // Now start
            if (p1 == p2) {
                return p1;
            } else {
                ListNode newHead = p1.next;
                p1.next = null;
                p2.next = head;
                return newHead;
            }
        }
    }
}
