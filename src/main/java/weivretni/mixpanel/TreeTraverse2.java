package weivretni.mixpanel;

import java.util.Stack;

import weivretni.TreeNode;

/**
 * Write a non-recursive function to delete an entire binary tree. Solve in two different ways.
 * 
 * @author gzhang
 * 
 */
public class TreeTraverse2 {

    /**
     * Using a stack
     * 
     * @param root
     */
    public void preOrder(TreeNode root) {
        Stack<TreeNode> s = new Stack();
        s.push(root);
        while (!s.isEmpty()) {
            TreeNode top = s.pop();

            System.out.print(top.val + "->");

            if (top.right != null) {
                s.push(top.right);
            }
            if (top.left != null) {
                s.push(top.left);
            }
        }
    }
    
    
    /**
     * Using a stack
     * 
     * @param root
     */
    public void inOrder(TreeNode root) {
        Stack<TreeNode> s = new Stack();
        s.push(root);
        while (!s.isEmpty()) {
            TreeNode top = s.pop();

            if (top.right != null) {
                s.push(top.right);
            }
            
            System.out.print(top.val + "->");
            
            if (top.left != null) {
                s.push(top.left);
            }
        }
    }
}
