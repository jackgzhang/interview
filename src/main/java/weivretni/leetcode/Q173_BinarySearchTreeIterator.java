package weivretni.leetcode;

import weivretni.TreeNode;

import java.util.Stack;

/**
 * <pre>
 * Implement an iterator over a binary search tree (BST). Your iterator will be initialized with the root node of a BST.
 * 
 * Calling next() will return the next smallest number in the BST.
 * 
 * Note: next() and hasNext() should run in average O(1) time and uses O(h) memory, 
 * 
 * where h is the height of the tree.
 * 
 * Credits:
 * Special thanks to @ts for adding this problem and creating all test cases.
 * </pre>
 * 
 * 
 * https://oj.leetcode.com/discuss/20204/accepted-java-solution-using-stack
 * 
 * @author gzhang
 *
 */

public class Q173_BinarySearchTreeIterator {

    private Stack<TreeNode> ancestors = new Stack<TreeNode>();
    private TreeNode curr      = null;

    public Q173_BinarySearchTreeIterator(TreeNode root) {
        curr = root;
        while (curr != null) {
            ancestors.push(curr);
            curr = curr.left;
        }

        // After this, curr = null;
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return curr != null || !ancestors.isEmpty();
    }

    /** @return the next smallest number */
    public int next() {
        if (curr == null) {
            curr = ancestors.pop();
        } else if (curr.right != null) {
            // traversal to the left most
            curr = curr.right;
            while (curr.left != null) {
                ancestors.push(curr);
                curr = curr.left;
            }
        } else {
            curr = ancestors.pop();
        }

        return curr.val;
    }
}
