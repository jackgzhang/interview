package weivretni.leetcode;

import weivretni.TreeNode;

/**
 * <pre>
 * Given a binary tree, determine if it is height-balanced.
 * For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two 
 * subtrees of every node never differ by more than 1.
 * </pre>
 * 
 * @author gzhang
 * 
 */
public class Q007_BalancedTree {

    private int getHeight(TreeNode n) {
        if (n == null) {
            return 0;
        }

        return Math.max(getHeight(n.left), getHeight(n.right)) + 1;
    }

    public boolean isBalanced(TreeNode root) {
        if (root == null)
            return true;

        int left = getHeight(root.left);
        int right = getHeight(root.right);
        if (Math.abs(left - right) > 1)
            return false;

        return isBalanced(root.left) && isBalanced(root.right);
    }
}
