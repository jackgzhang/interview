package weivretni.leetcode;

import weivretni.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * <pre>
 * 
 * Given a binary tree, return the inorder traversal of its nodes' values 
 * iteratively without using recursion.
 * 
 * For example:
 * Given binary tree {1,2,3,4,5},
 * 
 *             1
 *            / \
 *           2   3
 *          / \
 *         4   5
 *
 * (a) In-order (Left, Root, Right) : 4 2 5 1 3
 * (b) Pre-order (Root, Left, Right) : 1 2 4 5 3
 * (c) Post-order (Left, Right, Root) : 4 5 2 3 1
 *
 * </pre>
 * 
 * @author gzhang
 * 
 */
public class Q011_BinaryTreeInOrderTraversal {

    // recursive
    private List<Integer> result;
    public List<Integer> inOrderTraversal_1(TreeNode root) {
        result = new ArrayList<>();
        traverse(root);
        return result;
    }

    private void traverse(TreeNode node) {
        if (node == null) return;

        traverse(node.left);
        result.add(node.val);
        traverse(node.right);
    }

    // iterative
    public List<Integer> inOrderTraversal_2(TreeNode root) {
        List<Integer> res = new ArrayList<>();

        Stack<TreeNode> stack = new Stack<>();
        while (root != null) {
            stack.push(root);
            root = root.left;
        }

        while (!stack.isEmpty())  {
            TreeNode n = stack.pop();
            res.add(n.val);
            if (n.right != null) {
                n = n.right;
                while ( n != null) {
                    stack.push(n);
                    n = n.left;
                }
            }
        }

        return res;

    }
}
