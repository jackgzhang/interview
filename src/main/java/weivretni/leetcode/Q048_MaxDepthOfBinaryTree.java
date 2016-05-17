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

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
        }
    }

}
