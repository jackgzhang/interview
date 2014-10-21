package weivretni.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import weivretni.TreeNode;

/**
 * <pre>
 * 
 * Given a binary tree, return the inorder traversal of its nodes' values 
 * iteratively without using recursion.
 * 
 * For example:
 * Given binary tree {1,#,2,3},
 * 
 *    1
 *     \
 *      2
 *     /
 *    3
 * return [1,3,2].
 * </pre>
 * 
 * @author gzhang
 * 
 */
public class Q011_BinaryTreeInOrderTranversal {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();

        Stack<TreeNode> s = new Stack<TreeNode>();

        TreeNode curr = root;

        if (root == null) {
            return res;
        }
        while (!s.isEmpty() || curr != null) {

            if (curr != null) {
                s.push(curr);
                curr = curr.left;
            } else {
                curr = s.pop();
                res.add(curr.val);
                curr = curr.right;
            }

        }

        return res;

    }
}
