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

    // ======= 解法一 ======== //
    /**
     *  Top-down
     *  O(n^2),  O(n) stack space
     */
    public boolean isBalanced(TreeNode root) {
        if (root == null)
            return true;

        int left = getHeight(root.left);
        int right = getHeight(root.right);
        if (Math.abs(left - right) > 1)
            return false;

        return isBalanced(root.left) && isBalanced(root.right);
    }

    private int getHeight(TreeNode n) {
        if (n == null) {
            return 0;
        }

        return Math.max(getHeight(n.left), getHeight(n.right)) + 1;
    }

    // ======= 解法二 ======== //
    /**
     *  Bottom-up
     *  O(n),  O(n) stack space
     *
     *  The problem of 解法一 is, it re-travel the child to get
     *  the getHeight() and isBalanced(). We can merge these 2 calls to one.
     *  Which is use the getHeight() to return -1 if it is not balanced.
     */
    public boolean isBalanced2(TreeNode root) {
        return root == null || getHeight2(root) != -1;
    }


    private int getHeight2(TreeNode n) {
        if (n == null) return 0;
        int left = getHeight2(n.left);
        if (left == -1) return -1;

        int right = getHeight2(n.right);
        if (right == -1) return -1;

        return (Math.abs(left - right) <= 1) ? Math.max(left, right) + 1: -1;

    }
}
