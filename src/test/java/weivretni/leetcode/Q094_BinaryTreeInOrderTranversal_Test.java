package weivretni.leetcode;

import org.junit.Test;
import weivretni.BaseTest;
import weivretni.TreeNode;

public class Q094_BinaryTreeInOrderTranversal_Test extends BaseTest {

    private Q094_BinaryTreeInOrderTranversal source = new Q094_BinaryTreeInOrderTranversal();

    @Test
    public void test() {
        /**
         * <pre>
         *      3
         *   2      5
         * 1     4     6
         * </pre>
         */
        TreeNode root = this.buildTree(new String[] { "3", "2", "5", "1", "#", "4", "6" });

        this.assertEquals(new int[] { 1, 2, 3, 4, 5, 6 }, source.inorderTraversal(root));
        this.assertEquals(new int[] { 3, 2, 1, 5, 4, 6 }, source.preorderTraversal(root));
        this.assertEquals(new int[] { 1, 2, 4, 6, 5, 3 }, source.postorderTraversal(root));
        this.assertEquals(new int[] { 1, 2, 4, 6, 5, 3 }, source.postorderTraversal2(root));

    }
}
