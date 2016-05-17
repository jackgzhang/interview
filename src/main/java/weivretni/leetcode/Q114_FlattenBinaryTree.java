package weivretni.leetcode;

import weivretni.TreeNode;

/**
 * 
 * <pre>
 * Given a binary tree, flatten it to a linked list in-place using pre-order traversal
 * 
 * For example,
 * Given
 * 
 *          1
 *         / \
 *        2   5
 *       / \   \
 *      3   4   6
 * The flattened tree should look like:
 *    1
 *     \
 *      2
 *       \
 *        3
 *         \
 *          4
 *           \
 *            5
 *             \
 *              6
 * </pre>
 * 
 * 
 * 
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
public class Q114_FlattenBinaryTree {

    public void flatten(TreeNode root) {
        flatten_recurr(root);

    }

    /**
     * Return the tail of the flatterned sub tree
     * 
     * @param root
     * @return
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

}