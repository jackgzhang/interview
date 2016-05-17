package weivretni.leetcode;

import weivretni.ListNode;

/**
 * <pre>
 * Given a list, rotate the list to the right by k places, where k is non-negative.
 * 
 * For example:
 * Given 1->2->3->4->5->NULL and k = 2,
 * return 4->5->1->2->3->NULL.
 * </pre>
 * 
 * 首先从head开始跑，直到最后一个节点，这时可以得出链表长度len。然后将尾指针指向头指针，将整个圈连起来，接着往前跑len – n%len，从这里断开，就是要求的结果了。 *
 * 
 * @author gzhang
 * 
 */
public class Q061_RotateList {

    public ListNode rotateRight(ListNode head, int n) {
        if (head == null) {
            return head;
        }

        int len = 0;
        ListNode p = head;
        while (p.next != null) {
            p = p.next;
            len++;
        }
        len++;
        p.next = head;

        int step = len - n % len;
        int i = 1;
        p = head;
        while (i < step) {
            p = p.next;
            i++;
        }

        head = p.next;
        p.next = null;

        return head;

    }
}
