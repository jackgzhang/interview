package weivretni.leetcode;

import weivretni.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * <pre>
 * Given a binary tree, return the postorder traversal of its nodes' values.
 * 
 * For example:
 * Given binary tree {1,#,2,3},
 *    1
 *     \
 *      2
 *     /
 *    3
 * return [3,2,1].
 * </pre>
 * 
 * <pre>
 * 
 * http://www.geeksforgeeks.org/iterative-postorder-traversal/
 * 
 * Use 2 stacks
 * 
 * 1. Push root to first stack.
 * 2. Loop while first stack is not empty
 *    2.1 Pop a node from first stack and push it to second stack
 *    2.2 Push left and right children of the popped node to first stack
 * 3. Print contents of second stack
 * </pre>
 * 
 * @author gzhang
 * 
 */
public class Q145_BinaryTreePostorderTraversal {

    public List<Integer> iterative(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        Stack<TreeNode> s1 = new Stack<>();
        Stack<TreeNode> s2 = new Stack<>();

        s1.push(root);
        while (! s1.isEmpty()) {
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
        while (! s2.isEmpty()) {
            result.add(s2.pop().val);
        }
        
        return result;
    }


    List<Integer> result = new ArrayList<>();
    public List<Integer> recursive(TreeNode root) {
        if (root != null) {
            recursive(root.left);
            recursive(root.right);
            result.add(root.val);
        }
        return result;
    }
}
