package weivretni.leetcode;//package weivretni.leetcode;
//
//import weivretni.ListNode;
//
///**
// * <pre>
// * Given a sorted linked list, delete all nodes that have duplicate numbers,
// *
// * leaving only distinct numbers from the original list.
// *
// * For example,
// * Given 1->2->3->3->4->4->5, return 1->2->5.
// * Given 1->1->1->2->3, return 2->3.
// * </pre>
// *
// * @author gzhang
// *
// */
//public class Q082_RemoveDuplicatesfromSortedListII {
//s
//    public ListNode deleteDuplicates(ListNode head) {
//        if (head == null)
//            return head;
//        ListNode helper = new ListNode(0);
//        helper.next = head;
//        ListNode pre = helper;
//        ListNode cur = head;
//        while (cur != null) {
//            while (cur.next != null && cur.val == cur.next.val) {
//                cur = cur.next;
//            }
//            if (pre.next == cur) {   // No duplicate
//                pre = cur;
//            } else {
//                pre.next = cur.next;  // yes , there is duplicates
//            }
//            cur = cur.next;
//        }
//
//        return helper.next;
//    }
//}
