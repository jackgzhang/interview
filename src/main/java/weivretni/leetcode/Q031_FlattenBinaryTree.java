package weivretni.leetcode;

import weivretni.TreeNode;

public class Q031_FlattenBinaryTree {

    /**
     * <pre>
     *  recurrence: 
     *  
     * 1) if current node is null or leaf, return it.
     * 
     * 2) get the left child and right child of current node,
     *  
     * 2.1) if the left is not null, set the left as the current node's right, 
     *      flat the left tree. return the tail of left child tree as current node.
     * 
     * 2.2) if the right is not null, set the right as the current node's right, 
     *      flat the right tree. return the tail of left child tree as current node.
     * 
     * </pre>
     */
    public TreeNode flatten_recurr(TreeNode root) {
        if (root == null || (root.left == null && root.right == null))
            return root;

        TreeNode left = root.left;
        TreeNode right = root.right;

        root.left = null;

        if (left != null) {
            root.right = left;
            root = flatten_recurr(left);
        }

        if (right != null) {
            root.right = right;
            root = flatten_recurr(right);
        }

        return root;
    }

    public void flatten(TreeNode root) {
        flatten_recurr(root);

    }
}