package weivretni.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import weivretni.TreeNode;

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
 * @author gzhang
 * 
 */
public class Q015_BinaryTreeZigzagLevelOrderTraversal {

    public ArrayList<ArrayList<Integer>> travel(TreeNode root) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();

        Queue<TreeNode> s1 = new LinkedList<TreeNode>();
        s1.add(root);
        Queue<TreeNode> s2 = new LinkedList<TreeNode>();

        boolean fromLeftToRight = true;

        while (!s1.isEmpty() || !s2.isEmpty()) {

            Queue<TreeNode> workerQueue = s1;
            Queue<TreeNode> insertQueue = s2;

            if (!s2.isEmpty()) {
                workerQueue = s2;
                insertQueue = s1;
            }

            ArrayList<Integer> level = new ArrayList<Integer>();

            while (!workerQueue.isEmpty()) {
                TreeNode node = workerQueue.remove();
                level.add(node.val);

                if (fromLeftToRight) {
                    if (node.left != null) {
                        insertQueue.add(node.left);
                    }
                    if (node.right != null) {
                        insertQueue.add(node.right);
                    }
                } else {
                    if (node.right != null) {
                        insertQueue.add(node.right);
                    }
                    if (node.left != null) {
                        insertQueue.add(node.left);
                    }
                }

            }
            fromLeftToRight = !fromLeftToRight;
            res.add(level);
        }

        return res;
    }
}
