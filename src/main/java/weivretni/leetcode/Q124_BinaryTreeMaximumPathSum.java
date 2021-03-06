package weivretni.leetcode;

import weivretni.TreeNode;

/**
 * <pre>
 * Given a binary tree, find the maximum path sum.
 *
 * 返回树中任意两点路径的最大值。只要两点间有路径联通就可以。
 *
 * The path may start and end at any node in the tree.
 *
 * For example:
 * Given the below binary tree,
 *
 *        1
 *       / \
 *      2   3
 *
 * Return 6.
 * </pre>
 *
 * @author gzhang
 */
public class Q124_BinaryTreeMaximumPathSum {

    private int max = Integer.MIN_VALUE;

    private int helper(TreeNode root) {
        if (root == null) return 0;

        int left = helper(root.left);
        int right = helper(root.right);


        //用 全局 变量  保存 最大
        max = Math.max(left + right + root.val, max);

        // 如果结果<=0, 那么就返回0, 因为对root没有贡献
        int subSum = root.val + Math.max(left, right);
        return subSum > 0 ? subSum : 0;
    }

    public int maxPathSum(TreeNode root) {
        helper(root);

        return max;
    }
}
