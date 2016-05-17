package weivretni.leetcode;

import weivretni.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Q144_BinaryTreeInorderTraversal {

    List<Integer> result = new ArrayList<>();

    public List<Integer> iterative(TreeNode root) {

        result.clear();

        Stack<TreeNode> s = new Stack<>();
        TreeNode node = root;
        while (node != null) {
            s.push(node);
            node = node.left;
        }

        while (! s.isEmpty()) {
            node = s.pop();
            result.add(node.val);
            node = node.right;
            while (node != null) {
                s.push(node);
                node = node.left;
            }
        }

        return result;
    }

    public List<Integer> recursive(TreeNode root) {
        if (root != null) {
            recursive(root.left);
            result.add(root.val);
            recursive(root.right);
        }
        return result;
    }
}
