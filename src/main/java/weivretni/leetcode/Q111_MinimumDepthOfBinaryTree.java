package weivretni.leetcode;

import weivretni.TreeNode;

/**
 * Given a binary tree, find its minimum depth.
 * 
 * The minimum depth is the number of nodes along the shortest path from the root
 * 
 * node down to the nearest leaf node.
 * 
 * @author gzhang
 * 
 */
public class Q111_MinimumDepthOfBinaryTree {

    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            int left = minDepth(root.left);
            int right = minDepth(root.right);

            if (left > 0 && right > 0) {
                return Math.min(left, right) + 1;
            } else {
                // 如果只有左 ， 或 右， 就 只 count 一边就好
                return Math.max(left, right) + 1;
            }
        }
    }
}