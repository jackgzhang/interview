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

        ListNode result = null;
        ListNode resultHead = null;      // <------- Return the head of the result
        
        int carriage = 0;
        while (p1 != null && p2 != null) {

            int value = p1.val + p2.val + carriage;
            if (value >= 10) {
                value = value - 10;
                carriage = 1;
            }else{
                carriage = 0;
            }
            ListNode aNewNode = new ListNode(value);

            if (result == null) {
                result = aNewNode;
                resultHead = result;
            } else {
                result.next = aNewNode;
                result = result.next;
            }

            p1 = p1.next;
            p2 = p2.next;
        }

        ListNode remainngNode = (p1 == null) ? p2 : p1;
        while (remainngNode != null) {
            int value = remainngNode.val + carriage;
            if (value >= 10) {
                value = value - 10;
                carriage = 1;
            }else{
                carriage = 0;
            }
            ListNode aNewNode = new ListNode(value);
            if (result == null) {
                result = aNewNode;
                resultHead = result;
            } else {
                result.next = aNewNode;
                result = result.next;
            }
            
            remainngNode = remainngNode.next;     // <------ forward the remainning
        }

        if (carriage > 0) {
            ListNode aNewNode = new ListNode(carriage);
            result.next = aNewNode;
        }

        return resultHead;
    }
}
