package weivretni.leetcode;

import weivretni.TreeNode;

/**
 * Given an array where elements are sorted in ascending order, convert it to a height balanced BST.
 *
 * @author gzhang
 */
public class Q108_ConvertSortedArrayToBinarySearchTree {

    public TreeNode sortedArrayToBST(int[] num) {
        return helper(num, 0, num.length - 1);
    }

    private TreeNode helper(int[] num, int start, int end) {
        if (start > end) return null;

        int pivot = (end + start) / 2;
        TreeNode node = new TreeNode(num[pivot]);

        node.left = helper(num, start, pivot - 1);
        node.right = helper(num, pivot + 1, end);

        return node;
    }
}
