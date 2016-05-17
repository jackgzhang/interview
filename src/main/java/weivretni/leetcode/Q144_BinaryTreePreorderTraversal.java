package weivretni.leetcode;

import weivretni.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * <pre>
 * Given a binary tree, return the preorder traversal of its nodes' values.
 * 
 * For example:
 * Given binary tree {1,#,2,3},
 *    1
 *     \
 *      2
 *     /
 *    3
 * return [1,2,3].
 * </pre>
 * 
 * @author gzhang
 * 
 */
public class Q144_BinaryTreePreorderTraversal {

    List<Integer> result = new ArrayList<>();

    public List<Integer> iterative(TreeNode root) {

        result.clear();

        Stack<TreeNode> s = new Stack<>();

        if (root != null) {
            s.push(root);

            while (!s.isEmpty()) {
                TreeNode node = s.pop();
                result.add(node.val);

                if (node.right != null) {
                    s.push(node.right);
                }

                if (node.left != null) {
                    s.push(node.left);
                }
            }
        }

        return result;

    }

    public List<Integer> recursive(TreeNode root) {
        if (root != null) {
            result.add(root.val);
            recursive(root.left);
            recursive(root.right);
        }
        return result;

    }
}
