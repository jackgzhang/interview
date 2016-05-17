package weivretni.leetcode;

import weivretni.ListNode;

/**
 * <Pre>
 * Given a sorted linked list, delete all duplicates such that each element appear only once.
 * 
 * For example,
 * Given 1->1->2, return 1->2.
 * Given 1->1->2->3->3, return 1->2->3.
 * </pre>
 * 
 * 同样是双指针，但是这里要注意delete不用的节点。
 * 
 * @author gzhang
 * 
 */
public class Q083_RemoveDuplicatesfromSortedList {

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        } else {
            ListNode curr = head;
            ListNode next = head.next;
            while (next != null) {
                while (next != null && next.val == curr.val) {
                    next = next.next;
                }
                curr.next = next;
                curr = curr.next;
            }

            return head;
        }
    }
}
