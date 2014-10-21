package weivretni.microsoft;

import weivretni.TreeNode;

/**
 * <pre>
 * 第11题
 * ------------------------------------
 * 求二叉树中节点的最大距离...
 * 
 * 如果我们把二叉树看成一个图，
 * 父子节点之间的连线看成是双向的，
 * 我们姑且定义"距离"为两节点之间边的个数。
 * 写一个程序，
 * 求一棵二叉树中相距最远的两个节点之间的距离。
 * </pre>
 * 
 * 
 * <pre>
 * http://pengliu.me/?p=1154
 * 
 * 
 * 综合这两种情况，节点A与B的最大距离等于以下三个值的最大值：
 * 
 * 左子树中节点的最大距离（不经过根节点的路径）
 * 右子树中节点的最大距离（不经过根节点的路径）
 * 左子树的深度与右子树的深度的和再加2（经过根节点的路径）
 * </pre>
 * 
 * @author gzhang
 * 
 */
public class MS11 {

    private int getDepth(TreeNode node) {
        if (node == null) {
            return -1;
        } else {
            return 1 + Math.max(getDepth(node.left), getDepth(node.right));
        }
    }

    public int getMaxDistance(TreeNode root) {

        if (root == null) {
            return -1;
        } else {

            int leftMax = getMaxDistance(root.left);
            int rightMax = getMaxDistance(root.right);
            int depth = getDepth(root.left) + getDepth(root.right) + 2;
            return max(leftMax, rightMax, depth);
        }
    }

    private int max(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }
}
