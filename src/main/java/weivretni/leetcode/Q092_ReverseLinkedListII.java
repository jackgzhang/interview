package weivretni.leetcode;

import weivretni.ListNode;

/**
 * <pre>
 * Reverse a linked list from position m to n. Do it in-place and in one-pass.
 * 
 * For example:
 * Given 1->2->3->4->5->NULL, m = 2 and n = 4,
 * 
 * return 1->4->3->2->5->NULL.
 * 
 * Note:
 * Given m, n satisfy the following condition:
 * 1 ≤ m ≤ n ≤ length of list.
 * </pre>
 * 
 * @author gzhang
 * 
 */
public class Q092_ReverseLinkedListII {

    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode dummy = new ListNode();
        dummy.next = head;

        int i = 1;
        ListNode pre = dummy;
        ListNode curr = head;
        while (curr != null) {
            if (i < m || i > n) {
                pre = curr;
                curr = curr.next;
                i++;
            }else if (i == m) {
                curr = curr.next;
                i++;
            }else { // (i > m && i <= n) {
                ListNode nextCurr = curr.next;


                // reset the curr to the correct position
                curr = nextCurr;
                i++;
            }
        }

        return dummy.next;
    }
}
