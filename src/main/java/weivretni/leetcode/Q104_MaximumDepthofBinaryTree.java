package weivretni.leetcode;

import weivretni.TreeNode;

/**
 * Given a binary tree, find its maximum depth.
 * 
 * The maximum depth is the number of nodes along the longest
 * 
 * path from the root node down to the farthest leaf node.
 * 
 * @author gzhang
 * 
 */
public class Q104_MaximumDepthofBinaryTree {

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            return (1 + Math.max(maxDepth(root.left), maxDepth(root.right)));
        }
    }

}
