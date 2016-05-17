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
 * 
 */
public class Q124_BinaryTreeMaximumPathSum {

    private int max = Integer.MIN_VALUE;

    private int helper(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = helper(root.left);
        int right = helper(root.right);


        //用 全局 变量  保存 最大
        int tmpMax = left + right + root.val;
        if (tmpMax > max) {
            max = tmpMax;
        }

        // 返回值 是 either  左边  或 右边 , 但是要是 》 0. 因为 可以 不选 左边 或 右边
        int subSum = (root.val + left > root.val + right) ? root.val + left : root.val + right;
        
        if (subSum > 0) {
            return subSum;
        }else{
            return 0;
        }
    }

    public int maxPathSum(TreeNode root) {
        helper(root);

        return max;
    }
}
