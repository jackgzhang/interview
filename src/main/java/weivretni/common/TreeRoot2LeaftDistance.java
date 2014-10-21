package weivretni.common;

import weivretni.TreeNode;

/**
 * Tell the shortest distance from root to leaf
 * 
 * tree , root leaf
 * 
 * @author gzhang
 * 
 */
public class TreeRoot2LeaftDistance {

    private int getDistance(TreeNode node, int depth) {
        if (node.left == null && node.right == null) {
            return depth;
        } else {

            int left = depth;
            if (node.left != null) {
                left = getDistance(node.left, depth) + 1;
            }

            int right = depth;
            if (node.right != null) {
                right = getDistance(node.right, depth) + 1;
            }

            return Math.min(left, right);
        }
    }

    public int getShortestDistance(TreeNode root) {
        return getDistance(root, 0);
    }
}
