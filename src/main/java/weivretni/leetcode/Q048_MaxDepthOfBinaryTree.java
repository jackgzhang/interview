package weivretni.leetcode;

import weivretni.TreeNode;

/**
 * The maximum height of a binary tree is defined as the number of nodes along the path from the
 * root node to the deepest leaf node. Note that the maximum height of an empty tree is 0.
 * 
 * @author gzhang
 * 
 */
public class Q048_MaxDepthOfBinaryTree {

    public int helper(TreeNode root, int depth) {
        if (root == null) {
            return depth;
        }

        int left = helper(root.left, depth) + 1;
        int right = helper(root.right, depth) + 1;

        return Math.max(left, right);
    }

    public int maxDepth(TreeNode root) {
        return helper(root, 0);
    }
}
