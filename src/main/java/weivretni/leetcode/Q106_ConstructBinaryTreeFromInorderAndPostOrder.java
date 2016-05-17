package weivretni.leetcode;

import weivretni.TreeNode;

import java.util.Arrays;

/**
 * <pre>
 * Given inorder and postorder traversal of a tree, construct the binary tree.
 * 
 * Note:
 * You may assume that duplicates do not exist in the tree.
 * </pre>
 * 
 * @author gzhang
 * 
 */
public class Q106_ConstructBinaryTreeFromInorderAndPostOrder {

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder.length == 0) {
            return null;
        }

        TreeNode root = new TreeNode(postorder[postorder.length - 1]);
        int index = 0;
        while (index < inorder.length) {
            if (inorder[index++] == postorder[postorder.length - 1]) {
                break;
            }
        }

        root.left = buildTree(Arrays.copyOfRange(inorder, 0, index - 1), Arrays.copyOfRange(postorder, 0, index - 1));
        root.right = buildTree(Arrays.copyOfRange(inorder, index, inorder.length), Arrays.copyOfRange(postorder, index - 1, postorder.length - 1));

        return root;
    }
}
