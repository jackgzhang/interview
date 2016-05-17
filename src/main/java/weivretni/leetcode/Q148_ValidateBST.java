package weivretni.leetcode;

import weivretni.TreeNode;

/**
 * <pre>
 * Given a binary tree, determine if it is a valid binary search tree (BST).
 * 
 * Assume a BST is defined as follows:
 * 
 * The left subtree of a node contains only nodes with keys less than the node's key.
 * The right subtree of a node contains only nodes with keys greater than the node's key.
 * Both the left and right subtrees must also be binary search trees.
 * </pre>
 * 
 * @author gzhang
 *
 */
public class Q148_ValidateBST {

    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean isValidBST(TreeNode node, int MIN, int MAX) {
        if (node == null) {
            return true;
        } else {
            return isValidBST(node.left, MIN, node.val) && MIN < node.val && isValidBST(node.right, node.val, MAX) && node.val < MAX;
        }
    }

}
