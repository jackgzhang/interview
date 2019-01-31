package weivretni.leetcode;

import weivretni.ListNode;

/**
 * <pre>
 * Write a program to find the node at which the intersection of two singly linked lists begins.
 * 
 * 
 * For example, the following two linked lists:
 * 
 * A:          a1 → a2
 *                    ↘
 *                      c1 → c2 → c3
 *                    ↗            
 * B:     b1 → b2 → b3
 * begin to intersect at node c1.
 * 
 * 
 * Notes:
 * 
 * If the two linked lists have no intersection at all, return null.
 * The linked lists must retain their original structure after the function returns.
 * You may assume there are no cycles anywhere in the entire linked structure.
 * Your code should preferably run in O(n) time and use only O(1) memory.
 * </pre>
 * 
 * 
 * 
 * 我们可以首先计算出每个链表的长度lenA,lenB。 diff为长链表比短链表长出的节点数。
 * 
 * 让长链表先走diff步，然后两个链表同步向后走，检验节点是否想等，地一个想等的节点即为开始重合的位置。
 * 
 * 如果等长，（diff=0）， 两个链表 可能 （1） 完全相等 或者 （2）指向同一个尾节点
 * 
 * @author gzhang
 *
 */
public class Q160_IntersectionOfTwoLinkedLists {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA != null && headB != null) {

            int lengthA = getLength(headA);
            int lengthB = getLength(headB);

            ListNode longHead = (lengthA > lengthB) ? headA : headB;
            ListNode shortHead = (lengthA > lengthB) ? headB : headA;

            int diff = Math.abs(lengthA - lengthB);
            int i = 0;
            while (i++ < diff) {
                longHead = longHead.next;
            }

            // Now start at the same time
            while (longHead.val != shortHead.val) {
                longHead = longHead.next;
                shortHead = shortHead.next;
            }

            return longHead;
        } else {
            return null;
        }
    }

    private int getLength(ListNode node) {
        ListNode p = node;
        int i = 0;
        while (p != null) {
            p = p.next;
            i++;
        }
        return i;
    }
}
