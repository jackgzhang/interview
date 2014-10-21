package weivretni.mixpanel;

import weivretni.ListNode;
import weivretni.TreeNode;

/**
 * Implement the reversal of a singly linked list iteratively and recursively.
 * 
 * @author gzhang
 * 
 */
public class TreeTraverse {

    ListNode current1 = new ListNode(-1);

    public ListNode preOrderTraverse(TreeNode root) {
        ListNode aNode = new ListNode(root.val);
        current1.next = aNode;
        aNode.pre = current1;
        current1 = aNode;

        if (root.left != null) {
            preOrderTraverse(root.left);
        }

        if (root.right != null) {
            preOrderTraverse(root.right);
        }

        return current1;
    }

    ListNode current2 = new ListNode(-1);

    public ListNode inOrderTraverse(TreeNode root) {

        if (root.left != null) {
            inOrderTraverse(root.left);
        }

        ListNode aNode = new ListNode(root.val);
        current2.next = aNode;
        aNode.pre = current2;
        current2 = aNode;

        if (root.right != null) {
            inOrderTraverse(root.right);
        }

        return current2;
    }

    ListNode current3 = new ListNode(-1);

    public ListNode postOrderTraverse(TreeNode root) {

        if (root.left != null) {
            postOrderTraverse(root.left);
        }

        if (root.right != null) {
            postOrderTraverse(root.right);
        }

        ListNode aNode = new ListNode(root.val);
        current3.next = aNode;
        aNode.pre = current3;
        current3 = aNode;

        return current3;
    }
}
