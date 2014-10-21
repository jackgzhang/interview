package weivretni.common.tree;

import weivretni.TreeNode;

/**
 * http://www.itint5.com/oj/#4
 * 
 * <pre>
 * 给定一棵完全二叉树（查看定义）的根结点，统计该树的结点总数。
 * 
 * 使用O(n)的递归算法统计二叉树的结点数是一种显而易见的方法，
 * 此题中请利用完全二叉树的性质，想出效率更高的算法。
 * 
 * 
 * 使用TreeNodeUtil.getLeftChildNode(TreeNode)获得左儿子结点
 * 使用TreeNodeUtil.getRightChildNode(TreeNode)获得右儿子结点
 * 使用TreeNodeUtil.isNullNode(TreeNode)判断结点是否为空
 * </pre>
 * 
 * @author gzhang
 * 
 */

public class CountCompleteBinayTreeNodes {

    private int getHeight(TreeNode node) {
        int h = 0;
        while (node != null) {
            node = node.left;
            h++;
        }
        return h;
    }

    public int counter(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            int heightLeft = getHeight(root.left);
            int heightRight = getHeight(root.right);

            if (heightLeft == heightRight) {
                return 1 << heightLeft + counter(root.right);
            } else {
                return 1 << heightRight + counter(root.left);
            }
        }
    }
}
