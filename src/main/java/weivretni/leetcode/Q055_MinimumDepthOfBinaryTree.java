package weivretni.leetcode;

import weivretni.TreeNode;

public class Q055_MinimumDepthOfBinaryTree {

    private int helper(TreeNode root, int depth) {
        if (root == null) {
            return Integer.MAX_VALUE;
        }

        if(root.left == null && root.right == null)
            return depth;
        
        int minLeft = Integer.MAX_VALUE;
        if (root.left != null) {
            minLeft = helper(root.left, depth + 1);
        }

        int minright = 0;
        if (root.right != null) {
            minright = helper(root.right, depth + 1);
        }

        return Math.min(minLeft, minright);
    }

    public int minDepth(TreeNode root) {
        
        if (root == null) {
            return 0;
        }
        return helper(root, 1);
    }
}