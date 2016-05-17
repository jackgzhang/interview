package weivretni.leetcode;

import weivretni.ListNode;

/**
 * 
 * <pre>
 * Sort a linked list in O(n log n) time using constant space complexity.
 * 
 * 
 * Definition for singly-linked list.
 * class ListNode { 
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 * </pre>
 * 
 * @author gzhang
 *
 */
public class Q148_SortList {

    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != null && fast.next != null) {
            fast = fast.next;
            if (fast != null) {
                fast = fast.next;
            }
            slow = slow.next;
        }

        // Now 断开

        fast = slow.next;
        slow.next = null;

        // Sort
        slow = sortList(head);
        fast = sortList(fast);

        // Merge
        return mergeList(slow, fast);
    }

    private ListNode mergeList(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode curr = head;
        while (l1 != null || l2 != null) {
            if (l1 != null && l2 != null) {
                if (l1.val < l2.val) {
                    curr.next = l1;
                    curr = curr.next;
                    l1 = l1.next;
                } else {
                    curr.next = l2;
                    curr = curr.next;
                    l2 = l2.next;
                }
            } else {
                if (l1 != null) {
                    curr.next = l1;
                    curr = curr.next;
                    l1 = l1.next;
                } else if (l2 != null) {
                    curr.next = l2;
                    curr = curr.next;
                    l2 = l2.next;
                }
            }
        }
        return head.next;
    }
}
