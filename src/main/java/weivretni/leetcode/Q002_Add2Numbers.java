package weivretni.leetcode;

import weivretni.ListNode;

/**
 * <pre>
 * You are given two linked lists representing two non-negative numbers. 
 * The digits are stored in reverse order and each of their nodes contain a single digit. 
 * Add the two numbers and return it as a linked list.
 * 
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * </pre>
 * 
 * @author gzhang
 * 
 */

public class Q002_Add2Numbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode p1 = l1;
        ListNode p2 = l2;

        ListNode r = new ListNode();
        ListNode head = r;
        int carry = 0;

        while (p1 != null || p2 != null || carry != 0) {
            int val1 = 0;
            if (p1 != null) {
                val1 = p1.val;
                p1 = p1.next;
            }

            int val2 = 0;
            if (p2 != null) {
                val2 = p2.val;
                p2 = p2.next;
            }

            int result = val1 + val2 + carry;
            carry = result / 10;
            ListNode node = new ListNode(result % 10);
            r.next = node;
            r = r.next;
        }

        return head.next;

    }
}
