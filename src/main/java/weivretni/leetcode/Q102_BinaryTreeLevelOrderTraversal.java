package weivretni.leetcode;

/**
 * <pre>
 * Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).
 * 
 * For example:
 * Given binary tree {3,9,20,#,#,15,7},
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * return its level order traversal as:
 * [
 *   [3],
 *   [9,20],
 *   [15,7]
 * ]
 * 
 * Use 2 queue
 * </pre>
 */

import weivretni.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Q102_BinaryTreeLevelOrderTraversal {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        Queue<TreeNode> queue2 = new LinkedList<TreeNode>();

        queue.add(root);
        while (!queue.isEmpty() || !queue2.isEmpty()) {

            List<Integer> level = new ArrayList<Integer>();
            while (!queue.isEmpty()) {

                TreeNode node = queue.poll();
                level.add(node.val);
                if (node.left != null) {
                    queue2.add(node.left);
                }
                if (node.right != null) {
                    queue2.add(node.right);
                }
            }
            result.add(level);
            level = new ArrayList<Integer>();
            while (!queue2.isEmpty()) {

                TreeNode node = queue2.poll();
                level.add(node.val);
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            result.add(level);
        }

        return result;
    }
}
