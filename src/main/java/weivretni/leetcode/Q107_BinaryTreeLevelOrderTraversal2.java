package weivretni.leetcode;

import weivretni.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * <pre>
 * Given a binary tree, return the bottom-up level order traversal of its nodes' values. 
 * (ie, from left to right, level by level from leaf to root).
 * 
 * 
 * 
 * For example:
 * Given binary tree {3,9,20,#,#,15,7},
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * return its bottom-up level order traversal as:
 * [
 *   [15,7],
 *   [9,20],
 *   [3]
 * ]
 * </pre>
 * 
 * @author gzhang
 * 
 */
public class Q107_BinaryTreeLevelOrderTraversal2 {

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();

        Stack<TreeNode> s = new Stack<TreeNode>();
        s.push(root);

        Stack layerList = new Stack();
        while (root != null && !s.isEmpty()) {

            List<TreeNode> sameLayerNodes = new ArrayList<TreeNode>();

            while (!s.isEmpty()) {
                TreeNode treeNode = s.pop();
                sameLayerNodes.add(treeNode);
            }
            layerList.add(sameLayerNodes);

            // Now got to the next level
            for (int i = sameLayerNodes.size() - 1; i >= 0; i--) {
                TreeNode node = sameLayerNodes.get(i);
                if (node.right != null) {
                    s.push(node.right);
                }

                if (node.left != null) {
                    s.push(node.left);
                }
            }
        }

        // Now iterate the layerList
        while (!layerList.isEmpty()) {
            List<TreeNode> sameLayerNodes = (List<TreeNode>) layerList.pop();

            List<Integer> values = new ArrayList<Integer>();
            for (TreeNode node : sameLayerNodes) {
                values.add(node.val);
            }

            result.add(values);
        }

        return result;
    }
}
