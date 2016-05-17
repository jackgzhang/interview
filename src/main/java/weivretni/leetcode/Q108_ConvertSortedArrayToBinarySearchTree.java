package weivretni.leetcode;

import weivretni.TreeNode;

import java.util.Arrays;

/**
 * Given an array where elements are sorted in ascending order, convert it to a height balanced BST.
 * 
 * @author gzhang
 * 
 */
public class Q108_ConvertSortedArrayToBinarySearchTree {

    public TreeNode sortedArrayToBST(int[] num) {
        if (num == null || num.length == 0) {
            return null;
        } else {
            int pivot = num.length / 2;
            TreeNode node = new TreeNode(num[pivot]);

            node.left = sortedArrayToBST(Arrays.copyOfRange(num, 0, pivot));
            node.right = sortedArrayToBST(Arrays.copyOfRange(num, pivot + 1, num.length));

            return node;
        }
    }
}
