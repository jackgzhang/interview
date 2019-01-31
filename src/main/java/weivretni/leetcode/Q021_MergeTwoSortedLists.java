package weivretni.leetcode;

import weivretni.ListNode;

/**
 * Assume a has enough length. merge from back;
 * 
 * Merge two sorted linked lists and return it as a new list.
 * 
 * The new list should be made by splicing together the nodes of the first two lists.
 * 
 * @author gzhang
 * 
 * 
 */
public class Q021_MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode p = head;
        while (l1 != null || l2 != null) {
            if (l1 != null && l2 !=null) {
                if (l1.val < l2.val) {
                    p.next = l1;
                    l1 = l1.next;
                    p = p.next;
                }else{
                    p.next = l2;
                    l2 = l2.next;
                    p = p.next;
                }
            }else {
                if (l1 != null) {
                    p.next = l1;
                    break;
                } else {
                    p.next = l2;
                    break;
                }
            }
        }

        return head.next;
    }
}
