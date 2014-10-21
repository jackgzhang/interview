package weivretni.leetcode;

import org.junit.Test;

import weivretni.BaseTest;
import weivretni.TreeNode;

public class Q011_BinaryTreeInOrderTranversal_Test extends BaseTest {

    private Q011_BinaryTreeInOrderTranversal source = new Q011_BinaryTreeInOrderTranversal();

    @Test
    public void test() {
        /**
         * <pre>
         *      3
         *   2      5
         * 1     4     6
         * </pre>
         */
        TreeNode root = new TreeNode(3);
        TreeNode left2 = new TreeNode(2);
        TreeNode left1 = new TreeNode(1);
        TreeNode left4 = new TreeNode(4);
        TreeNode right5 = new TreeNode(5);
        TreeNode right6 = new TreeNode(6);

        root.left = left2;
        root.right = right5;
        left2.left = left1;
        right5.right = right6;
        right5.left = left4;

        this.assertEquals(new int[] { 1, 2, 3, 4, 5, 6 }, source.inorderTraversal(root));
    }
}
