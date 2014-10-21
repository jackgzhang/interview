package weivretni.mixpanel;

import java.util.Stack;

import weivretni.TreeNode;

/**
 * http://www.interviewzen.com/question/dBfv4W
 * <p>
 * Verify whether a binary tree is a binary search tree
 * 
 * @author gzhang
 * 
 */
public class BinaryTreeVerify {

    public boolean verifyRecursive(TreeNode root) {

        boolean leftIsOk = true;
        boolean rightIsOk = true;

        if (root.left != null) {
            leftIsOk = verifyRecursive(root.left);
            leftIsOk = leftIsOk && (root.left.val <= root.val);
        }
        if (root.right != null) {
            rightIsOk = verifyRecursive(root.left);
            rightIsOk = rightIsOk && (root.right.val >= root.val);
        }

        return leftIsOk && rightIsOk;
    }

    public boolean verifyIterative(TreeNode root) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);

        boolean result = true;
        while (!stack.isEmpty()) {
            TreeNode t = stack.pop();
            if (t.left != null) {
                stack.push(t.left);
                result = result && (t.left.val <= t.val);
            }

            if (t.right != null) {
                stack.push(t.right);
                result = result && (t.right.val >= t.val);
            }
        }

        return result;
    }
}
