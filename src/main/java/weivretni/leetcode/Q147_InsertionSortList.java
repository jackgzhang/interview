package weivretni.leetcode;

import weivretni.ListNode;

/**
 * Sort a linked list using insertion sort.
 * 
 * 
 * <pre>
 * 
 * http://huntfor.iteye.com/blog/2072912
 * 
 * 起一个新头， 逐渐 把 旧的list 的元素 加到 新头的list。
 * 然后 返回 新头 的 下 一个 元素
 * </pre>
 * 
 * @author gzhang
 * 
 */
public class Q147_InsertionSortList {

    public ListNode insertionSortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode head0 = new ListNode(head.val);
        ListNode p = head.next;

        while (p != null) {
            head0 = insertMe(head0, p.val);
            p = p.next;
        }

        return head0;
    }

    private ListNode insertMe(ListNode head, int value) {
        // Add 1 dummy node ahead, so we can use 2 pointers to do the comparison
        ListNode virtual = new ListNode(Integer.MIN_VALUE);
        virtual.next = head;

        // Now start iterate
        ListNode l = virtual;
        ListNode r = virtual.next;

        while (r.val < value  && r.next != null) {
            l = r;
            r = r.next;
        }

        if (r.val < value) {
            // Append as the last one
            r.next = new ListNode(value);
        }else{
            // Insert between l and r
            l.next = new ListNode(value);
            l.next.next = r;
        }

        return virtual.next;
    }

}
