package weivretni.mixpanel;

import weivretni.TreeNode;

/**
 * Convert a binary search tree into a sorted circular doubly-linked list. Think of the left and
 * right pointers as synonymous to the previous and next pointers in the doubly-linked list.
 * 
 * @author gzhang
 * 
 */
public class BinaryTreeToList {

    public TreeNode convert(TreeNode root, boolean leftNode) {

        if (root.left == null && root.right == null) {
            return root;
        }

        if (root.left != null) {
            TreeNode leftMost = convert(root.left, true);
            leftMost.right = root;
            root.left = leftMost;
        }

        if (root.right != null) {
            TreeNode rightMinimum = convert(root.right, false);
            root.right = rightMinimum;
            rightMinimum.left = root;
        }


        if (leftNode) {
            while (root.right != null) {
                root = root.right;
            }
            return root;
        } else {
            while (root.left != null) {
                root = root.left;
            }
            return root;
        }
    }

}
