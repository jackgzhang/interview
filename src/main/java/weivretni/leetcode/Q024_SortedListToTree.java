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
        ListNode node2 = head;

        int length = 1;
        while (node2.next != null) {
            node2 = node2.next;
            length++;
        }

        return buildBST(head, 0, length - 1);
    }

    private TreeNode buildBST(ListNode head, int start, int end) {
        if (start > end) {
            return null;
        }

        int mid = (end + start) / 2;

        ListNode p = head;
        for (int i = 0; i < mid; i++) {
            p = p.next;
        }
        TreeNode parent = new TreeNode(p.val);

        parent.left = buildBST(head, start, mid - 1);
        parent.right = buildBST(head, mid + 1, end);

        return parent;
    }

}
