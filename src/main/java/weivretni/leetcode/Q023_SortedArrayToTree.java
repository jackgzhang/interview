package weivretni.leetcode;

import weivretni.TreeNode;
import weivretni.Utils;

public class Q023_SortedArrayToTree {

    public int[] subArray(int[] src, int start, int end) {
        int length = end - start + 1;
        int[] dest = new int[length];
        System.arraycopy(src, start, dest, 0, length);

        return dest;
    }

    public TreeNode sortedArrayToBST(int[] num) {

        if (num == null || num.length == 0) {
            return null;
        }

        int pivot = num.length / 2;
        int pivotV = num[pivot];

        TreeNode node = new TreeNode(pivotV);

        if (pivot > 0)
            node.left = sortedArrayToBST(subArray(num, 0, pivot - 1));

        if (pivot + 1 <= num.length - 1)
            node.right = sortedArrayToBST(subArray(num, pivot + 1, num.length - 1));

        return node;

    }
}
