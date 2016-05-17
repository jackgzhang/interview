package weivretni.leetcode;

import weivretni.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * <pre>
 * Given a binary tree, return the zigzag level order traversal of its nodes' values.
 * (ie, from left to right, then right to left for the next level and alternate between).
 * 
 * For example:
 * Given binary tree {3,9,20,#,#,15,7},
 * 
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * return its zigzag level order traversal as:
 * 
 * [
 *   [3],
 *   [20,9],
 *   [15,7]
 * ]
 * </pre>
 * 
 * 
 * 2 Stack
 * 
 * @author gzhang
 * 
 */
public class Q103_BinaryTreeZigzagLevelOrderTraversal {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();

        Stack<TreeNode> leftFirstStack = new Stack<TreeNode>();
        Stack<TreeNode> rightFirstStack = new Stack<TreeNode>();

        leftFirstStack.push(root);

        while (!leftFirstStack.isEmpty() || !rightFirstStack.isEmpty()) {
            List<Integer> level = new ArrayList<Integer>();
            while (!leftFirstStack.isEmpty()) {
                TreeNode node = leftFirstStack.pop();
                level.add(node.val);
                if (node.left != null) rightFirstStack.push(node.left);
                if (node.right != null) rightFirstStack.push(node.right);
            }
            if (level.size() > 0) {
                result.add(level);
                level = new ArrayList<Integer>(); 
            }
            
            while (!rightFirstStack.isEmpty()) {
                TreeNode node = rightFirstStack.pop();
                level.add(node.val);
                if (node.right != null) leftFirstStack.push(node.right);
                if (node.left != null) leftFirstStack.push(node.left);
            }
            if (level.size() > 0) {
                result.add(level);
                level = new ArrayList<Integer>(); 
            }
        }

        return result;
    }
}
