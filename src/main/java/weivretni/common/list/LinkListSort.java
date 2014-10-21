package weivretni.common.list;

import weivretni.ListNode;

/**
 * http://www.itint5.com/oj/#3
 * 
 * 
 * 对一个单链表原地（in-place）排序。即直接对链表结点排序。返回排序后链表的头结点。
 * 
 * @author gzhang
 * 
 */

public class LinkListSort {

    private int getLength(ListNode node) {

        ListNode head = node;

        int length = 0;
        while (head != null) {
            length++;
            head = head.next;
        }

        return length;
    }

    /**
     * return the head of the sorted list
     */
    private ListNode sortHelper(ListNode head, int length) {
        if (length <= 1) {
            head.next = null;
            return head;
        } else {
            int middle = length / 2;

            int index = 0;
            ListNode middleNode = head;
            while (index < middle) {
                middleNode = middleNode.next;
                index++;
            }
            
            // Sort first
            ListNode firstHalf = sortHelper(head, middle);

            // Sort second
            ListNode secondHalf = sortHelper(middleNode, length - middle);

            // merge
            return merge(firstHalf, secondHalf);
        }

    }

    private ListNode merge(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        ListNode result = head;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                head.next = l1;
                l1 = l1.next;
            } else {
                head.next = l2;
                l2 = l2.next;
            }
            head = head.next;
        }

        if (l1 != null) {
            head.next = l1;
        }

        if (l2 != null) {
            head.next = l2;
        }

        return result.next;
    }

    public ListNode sort(ListNode head) {
        int length = getLength(head);

        if (length > 0) {
            return sortHelper(head, length);
        } else {
            return head;
        }

    }
}