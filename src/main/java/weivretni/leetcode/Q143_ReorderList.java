package weivretni.leetcode;

import weivretni.ListNode;

import java.util.Stack;

/**
 * <pre>
 * Given a singly linked list L: L0→L1→…→Ln-1→Ln,
 * reorder it to: L0→Ln→L1→Ln-1→L2→Ln-2→…
 * 
 * You must do this in-place without altering the nodes' values.
 * 
 * For example,
 * Given {1,2,3,4}, reorder it to {1,4,2,3}.
 * </pre>
 * 
 * @author gzhang
 * 
 */
public class Q143_ReorderList {

    public void reorderList(ListNode head) {
        if (head == null) {
            return;
        } else {
            Stack<ListNode> stack = new Stack<ListNode>();

            int length = 0;
            ListNode p = head;
            while (p != null) {
                stack.push(p);
                p = p.next;
                length++;
            }

            p = head;
            for (int i = 0; i < length / 2; i++) {

                ListNode tmp = p.next;

                ListNode s = stack.pop();
                p.next = s;
                s.next = tmp;
                p = tmp;
            }
            
            p.next = null;

        }
    }
}
