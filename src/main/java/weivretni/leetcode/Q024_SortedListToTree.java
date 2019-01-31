package weivretni.leetcode;

import weivretni.ListNode;
import weivretni.TreeNode;

/**
 * <pre>
 * It is similar with "Convert Sorted Array to Binary Search Tree". But the difference here is we have no way to random access item in O(1).
 * 
 * If we build BST from array, we can build it from top to bottom, like
 * 1. choose the middle one as root,
 * 2. build left sub BST
 * 3. build right sub BST
 * 4. do this recursively.
 * 
 * But for linked list, we can't do that because Top-To-Bottom are heavily relied on the index operation.
 * There is a smart solution to provide an Bottom-TO-Top as an alternative way, 
 * http://leetcode.com/2010/11/convert-sorted-list-to-balanced-binary.html
 * 
 * With this, we can insert nodes following the list’s order. So, we no longer need to find the middle element, 
 * as we are able to traverse the list while inserting nodes to the tree.
 * </pre>
 * 
 * @author gzhang
 * 
 */
public class Q024_SortedListToTree {

    public TreeNode sortedListToBST(ListNode head) {

        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return new TreeNode(head.val);
        }

        ListNode middle = cutMiddle(head);

        TreeNode root = new TreeNode(middle.val);
        root.left = sortedListToBST(head);
        root.right = sortedListToBST(middle.next);

        return root;

    }

    private ListNode cutMiddle(ListNode head) {
        ListNode pslow = head;
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            pslow = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        pslow.next = null;
        return slow;
    }

}
