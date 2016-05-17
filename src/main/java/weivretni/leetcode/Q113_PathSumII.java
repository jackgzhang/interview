package weivretni.leetcode;

import weivretni.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 * Given a binary tree and a sum, find all root-to-leaf paths where each path's sum equals the given sum.
 * 
 * For example:
 * Given the below binary tree and sum = 22,
 *               5
 *              / \
 *             4   8
 *            /   / \
 *           11  13  4
 *          /  \    / \
 *         7    2  5   1
 * return
 * [
 *    [5,4,11,2],
 *    [5,8,4,5]
 * ]
 * </pre>
 * 
 * @author gzhang
 * 
 */
public class Q113_PathSumII {

    private List<List<Integer>> ans = null;

    public List<List<Integer>> pathSum(TreeNode root, int sum) {

        ans = new ArrayList<List<Integer>>();

        if (root != null) {
            helper(root, sum, new ArrayList<Integer>(0));

        }

        return ans;
    }

    private void helper(TreeNode node, int sum, List<Integer> path) {
        if (node == null) {
            return;
        }

        if (node.val == sum && node.left == null && node.right == null) {
            path.add(node.val);
            ans.add(new ArrayList(path));
            path.remove(path.size() - 1);
        } else {
            path.add(node.val);
            helper(node.left, sum - node.val, path);
            helper(node.right, sum - node.val, path);
            path.remove(path.size() - 1);
        }
    }
}
