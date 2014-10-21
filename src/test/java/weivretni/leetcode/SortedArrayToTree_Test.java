package weivretni.leetcode;

import org.junit.Test;

import weivretni.TreeNode;

public class SortedArrayToTree_Test {

    private Q023_SortedArrayToTree source = new Q023_SortedArrayToTree();

    @Test
    public void test() {
        TreeNode node = source.sortedArrayToBST(new int[] { 1, 2, 3 });
        node = source.sortedArrayToBST(new int[] { 1, 2, 3, 4 });
        node = source.sortedArrayToBST(new int[] { 1, 2, 3, 5 });
    }
}
