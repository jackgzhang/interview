package weivretni.leetcode;

import weivretni.TreeNode;

public class Q110_BalancedBinaryTree {

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
