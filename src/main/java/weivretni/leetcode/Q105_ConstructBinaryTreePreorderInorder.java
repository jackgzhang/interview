package weivretni.leetcode;

import weivretni.TreeNode;

import java.util.Arrays;

/**
 * <pre>
 * Given preorder and inorder traversal of a tree, construct the binary tree.
 * 
 * Note:
 * You may assume that duplicates do not exist in the tree.
 * </pre>
 * 
 * @author gzhang
 * 
 */
public class Q105_ConstructBinaryTreePreorderInorder {

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null || preorder.length == 0) {
            return null;
        }

        TreeNode root = new TreeNode(preorder[0]);

        int index = 0;
        while (index < inorder.length) {
            if (inorder[index++] == preorder[0]) {
                break;
            }
        }

        root.left = buildTree(Arrays.copyOfRange(preorder, 1, index), Arrays.copyOfRange(inorder, 0, index - 1));
        root.right = buildTree(Arrays.copyOfRange(preorder, index, preorder.length), Arrays.copyOfRange(inorder, index, inorder.length));

        return root;
    }

}
