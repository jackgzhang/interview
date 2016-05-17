package weivretni.leetcode;

import weivretni.ListNode;

/**
 * <pre>
 * Given a linked list and a value x, partition it such that all nodes less than x 
 * 
 * come before nodes greater than or equal to x.
 * 
 * You should preserve the original relative order of the nodes in each of the two partitions.
 * 
 * For example,
 * Given 1->4->3->2->5->2 and x = 3,
 * return 1->2->2->4->3->5.
 * </pre>
 * 
 * <pre>
 * new两个新链表，一个用来创建所有大于等于x的链表，一个用来创建所有小于x的链表。
 * 
 * 遍历整个链表时，当当前node的val小于x时，接在小链表上，反之，接在大链表上。这样就保证了相对顺序没有改变，而仅仅对链表做了与x的比较判断。
 * 
 * 最后，把小链表接在大链表上，别忘了把大链表的结尾赋成null。
 * </pre>
 * 
 * @author gzhang
 * 
 */
public class Q086_PartitionList {

    public ListNode partition(ListNode head, int x) {
        if (head == null) {
            return null;
        } else {

            ListNode smallNode = new ListNode(0);
            ListNode largenode = new ListNode(0);

            ListNode p0 = smallNode;
            ListNode p1 = largenode;

            while (head != null) {
                ListNode node = new ListNode(head.val);
                if (head.val < x) {
                    smallNode.next = node;
                    smallNode = node;
                } else {
                    largenode.next = node;
                    largenode = node;
                }

                head = head.next;
            }

            smallNode.next = p1.next;
            return p0.next;
        }
    }
}
