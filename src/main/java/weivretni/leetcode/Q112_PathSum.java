package weivretni.leetcode;

import weivretni.TreeNode;

/**
 * <pre>
 * Given a binary tree and a sum, determine if the tree has a root-to-leaf path such 
 * 
 * that adding up all the values along the path equals the given sum.
 * 
 * For example:
 * Given the below binary tree and sum = 22,
 *               5
 *              / \
 *             4   8
 *            /   / \
 *           11  13  4
 *          /  \      \
 *         7    2      1
 * return true, as there exist a root-to-leaf path 5->4->11->2 which sum is 22.
 * </pre>
 * 
 * @author gzhang
 * 
 */
public class Q112_PathSum {

    public boolean hasPathSum(TreeNode node, int sum) {
        if (node == null) {
            return false;
        } else if (node.val == sum) {
            return true;
        } else {
            return hasPathSum(node.left, sum - node.val) || hasPathSum(node.right, sum - node.val);
        }
    }
}
