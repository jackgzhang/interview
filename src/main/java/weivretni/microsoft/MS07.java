package weivretni.microsoft;

import weivretni.ListNode;

/**
 * http://blog.csdn.net/shiren_bod/article/details/6651703
 * 
 * <pre>
 * 微软亚院之编程判断俩个链表是否相交
 * 给出俩个单向链表的头指针，比如h1，h2，判断这俩个链表是否相交。
 * 为了简化问题，我们假设俩个链表均不带环。
 * 
 * 问题扩展：
 * 1.如果链表可能有环列?
 * 2.如果需要求出俩个链表相交的第一个节点列?
 * </pre>
 * 
 * @author gzhang
 * 
 */
public class MS07 {

    private ListNode crossNode1 = null;
    private ListNode crossNode2 = null;

    /**
     * If it is circle, return null, otherwise, return last Node
     * 
     * @param l
     * @return
     */
    private ListNode isCircle(ListNode l, int i) {
        ListNode slow = l;
        ListNode fast = l.next;

        while (slow != fast && fast != null && slow != null) {

            if (fast.next != null) {
                fast = fast.next;
            } else {
                return fast;
            }

            slow = slow.next;
            fast = fast.next;
        }

        if (i == 1) {
            crossNode1 = fast;
        } else {
            crossNode2 = fast;
        }

        return null;

    }

    public boolean isCross(ListNode l1, ListNode l2) {
        ListNode lastNode1 = isCircle(l1, 1);
        ListNode lastNode2 = isCircle(l2, 2);

        if (lastNode1 != null && lastNode2 != null) {
            return lastNode1.equals(lastNode2);
        }

        if (lastNode1 == null && lastNode2 == null) {
            // 两个都有环，判断环里的节点是否能到达另一个链表环里的节点

            ListNode tmp = crossNode1.next;

            while (tmp != crossNode1) {
                if (tmp == crossNode2) {
                    return true;
                }
                tmp = tmp.next;
            }

            return false;
        } else {
            return false;
        }

    }
}
