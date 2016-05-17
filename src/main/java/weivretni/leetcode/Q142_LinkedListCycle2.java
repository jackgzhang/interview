package weivretni.leetcode;

import weivretni.ListNode;

/**
 * <pre>
 * Given a linked list, return the node where the cycle begins. If there is no cycle, return null.
 * 
 * Follow up:
 * Can you solve it without using extra space?
 * 
 * Definition for singly-linked list.
 * 
 * 
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 * 
 * |<---x--->|<------------
 *                         |
 * 1 -> 2 -> 3 -> 4 -> 5   |
 *         |  |         |  y
 *         z 10        6   |
 *         |  |         |  |
 *        -- (9) <- 8 <-7  |
 *                         |
 *           |<------------              
 * p1:   distance is   t = x + y
 * p2:   distance is  2t = x + 2y + z
 * 
 *     推出：  x=z     
 *     
 *     两个 点 相遇后， P2再从头走， 相遇点就是起点
 * 
 * </pre>
 * 
 * @author gzhang
 * 
 */
public class Q142_LinkedListCycle2 {

    public ListNode detectCycle(ListNode head) {
        if (head == null) {
            return null;
        } else {

            ListNode p1 = head;
            ListNode p2 = head;

            do {
                p1 = p1.next;
                p2 = p2.next;
                if (p2 != null) {
                    p2 = p2.next;
                }
            } while (p2 != null && p1 != p2);

            if (p2 == null) {
                return null;
            } else {
                p1 = head;
                while (p1 != p2) {
                    p1 = p1.next;
                    p2 = p2.next;
                }

                return p2;
            }
        }
    }
}
