package weivretni.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import weivretni.TreeNode;

public class Q012_BinaryTreeLevelOrderTraversal {

    public ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();

        Queue<TreeNode> s1 = new LinkedList<TreeNode>();
        s1.add(root);
        Queue<TreeNode> s2 = new LinkedList<TreeNode>();

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
                if (node.left != null) {
                    insertQueue.add(node.left);
                }
                if (node.right != null) {
                    insertQueue.add(node.right);
                }
            }

            res.add(level);
        }

        return res;

    }
}
