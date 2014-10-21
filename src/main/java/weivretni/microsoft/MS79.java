package weivretni.microsoft;

import weivretni.ListNode;
import weivretni.Node;

/**
 * 
 * 
 * @author gzhang
 * 
 */
public class MS79 {

    private int findLength(ListNode head) {
        int i = 0;
        ListNode pointer = head;
        while (pointer.next != null) {
            i++;
            pointer = pointer.next;
        }

        return i;
    }

    private ListNode merge(ListNode head1, ListNode head2) {
        ListNode head = new ListNode(0);
        ListNode tmp = head;
        while (head1 != null || head2 != null) {

            if (head1 != null && head2 != null) {
                if (head1.val < head2.val) {
                    head.next = head1;
                    head = head.next;
                    head1 = head1.next;
                } else {
                    head.next = head2;
                    head = head.next;
                    head2 = head2.next;
                }
            } else {
                if (head1 != null) {
                    head.next = head1;
                    break;
                } else {
                    head.next = head2;
                    break;
                }
            }
        }

        return tmp.next;
    }

    private ListNode mergeSort(ListNode p, int len) {
        if (len <= 1) {
            p.next = null;
            return p;
        }

        ListNode pmid = p;
        for (int i = 0; i < len / 2; i++) {
            pmid = pmid.next;
        }
        ListNode p1 = mergeSort(p, len / 2);
        ListNode p2 = mergeSort(pmid, len - len / 2);
        return merge(p1, p2);
    }

    public ListNode sort(ListNode head) {
        int len = findLength(head);

        return mergeSort(head, len);
    }
}
