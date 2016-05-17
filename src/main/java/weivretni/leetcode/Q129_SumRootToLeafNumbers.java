package weivretni.leetcode;

import weivretni.TreeNode;

/**
 * <pre>
 * Given a binary tree containing digits from 0-9 only, each root-to-leaf path could represent a number.
 * 
 * An example is the root-to-leaf path 1->2->3 which represents the number 123.
 * 
 * Find the total sum of all root-to-leaf numbers.
 * 
 * For example,
 * 
 *     1
 *    / \
 *   2   3
 * The root-to-leaf path 1->2 represents the number 12.
 * The root-to-leaf path 1->3 represents the number 13.
 * 
 * Return the sum = 12 + 13 = 25.
 * 
 * 
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 * 
 * </pre>
 * 
 * @author gzhang
 *
 */
public class Q129_SumRootToLeafNumbers {

    private int totalSum = 0;

    public int sumNumbers(TreeNode root) {

        totalSum = 0;

        if (root == null) {
            return totalSum;
        }

        if (root.left == null && root.right == null) {
            return root.val;
        }

        helper(root, root.val);

        return totalSum;
    }

    private void helper(TreeNode root, int currSum) {
        if (root.left == null && root.right == null) {
            // Now add sum
            totalSum = totalSum + currSum;
        } else {
            if (root.left != null)
                helper(root.left, currSum * 10 + root.left.val);

            if (root.right != null) {
                helper(root.right, currSum * 10 + root.right.val);
            }

        }

    }
}
