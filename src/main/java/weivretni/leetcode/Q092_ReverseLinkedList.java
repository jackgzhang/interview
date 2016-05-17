package weivretni.leetcode;

import weivretni.ListNode;

/**
 * Created by gzhang on 5/12/16.
 */
public class Q092_ReverseLinkedList {
    public ListNode reverse(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }else{
            ListNode result = reverse(head.next);
            head.next.next = head;
            head.next = null;
            return result;
        }
    }
}
