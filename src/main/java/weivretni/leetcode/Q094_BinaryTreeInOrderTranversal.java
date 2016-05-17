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
public class Q094_BinaryTreeInOrderTranversal {

    /**
     * Non-recursive
     * 
     * @param root
     * @return
     */
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();

        Stack<TreeNode> s = new Stack<TreeNode>();

        if (root == null) {
            return res;
        }
        while (!s.isEmpty() || root != null) {

            if (root != null) {
                s.push(root);
                root = root.left;
            } else {
                root = s.pop();
                res.add(root.val);
                root = root.right;
            }
        }

        return res;
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        Stack<TreeNode> s = new Stack();
        while (!s.isEmpty() || root != null) {
            if (root != null) {
                result.add(root.val);

                if (root.right != null) {
                    s.push(root.right);
                }

                root = root.left;

            } else {
                root = s.pop();
            }
        }

        return result;
    }

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();

        Stack<TreeNode> s = new Stack();
        TreeNode lastVisited = null;

        while (!s.isEmpty() || root != null) {
            if (root != null) {
                s.push(root);
                root = root.left;
            } else {
                TreeNode peekNode = s.peek();
                if (peekNode.right != null && lastVisited != peekNode.right) {
                    root = peekNode.right;
                } else {
                    result.add(peekNode.val);
                    lastVisited = s.pop();
                }
            }
        }

        return result;
    }

    /**
     * use 2 stacks
     * 
     * @param root
     * @return
     */
    public List<Integer> postorderTraversal2(TreeNode root) {

        List<Integer> result = new ArrayList<Integer>();

        Stack<TreeNode> s1 = new Stack<TreeNode>();
        Stack<TreeNode> s2 = new Stack<TreeNode>();
        if (root != null) {
            s1.push(root);
            while (!s1.isEmpty()) {
                TreeNode node = s1.pop();
                s2.push(node);
                if (node.left != null) {
                    s1.push(node.left);
                }
                if (node.right != null) {
                    s1.push(node.right);
                }
            }

            // After this. s2 contains the right answer

            while (!s2.isEmpty()) {
                TreeNode node = s2.pop();
                result.add(node.val);
            }
        }

        return result;
    }
}
