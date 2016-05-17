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
        ListNode p0 = new ListNode();
        ListNode pCurrent = p0;

        while (l1 != null || l2 != null) {
            if (l1 != null && l2 != null) {
                if (l1.val < l2.val) {
                    pCurrent.next = l1;
                    l1 = l1.next;
                    pCurrent = pCurrent.next;
                } else {
                    pCurrent.next = l2;
                    l2 = l2.next;
                    pCurrent = pCurrent.next;
                }
            } else if (l1 != null) {
                pCurrent.next = l1;
                l1 = l1.next;
                pCurrent = pCurrent.next;
            } else {
                pCurrent.next = l2;
                l2 = l2.next;
                pCurrent = pCurrent.next;
            }
        }

        return p0.next;

    }
}
