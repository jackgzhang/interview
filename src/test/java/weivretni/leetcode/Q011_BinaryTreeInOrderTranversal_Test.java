package weivretni.leetcode;

import org.junit.Test;

import weivretni.BaseTest;
import weivretni.TreeNode;

public class Q011_BinaryTreeInOrderTranversal_Test extends BaseTest {

    private Q011_BinaryTreeInOrderTraversal source1 = new Q011_BinaryTreeInOrderTraversal();
    private Q011_BinaryTreeInOrderTraversal source2 = new Q011_BinaryTreeInOrderTraversal();

    @Test
    public void test() {
        /**
         * <pre>
         *      3
         *    /   \
         *   2     5
         *  /     / \
         * 1     4   6
         * </pre>
         */
        TreeNode root = super.buildTree(new String[]{"3","2","5","1","#","4","6"});

        this.assertEquals(source1.inOrderTraversal_1(root), source2.inOrderTraversal_2(root));
    }
}
