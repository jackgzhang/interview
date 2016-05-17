package weivretni.leetcode;

import org.junit.Test;
import weivretni.BaseTest;
import weivretni.TreeNode;

/**
 * Created by gzhang on 4/28/16.
 */
public class Q144_BinaryTreeInorderTranversal_Test extends BaseTest {
    @Test
    public void test() {
        Q144_BinaryTreeInorderTraversal source = new Q144_BinaryTreeInorderTraversal();

        TreeNode head = this.getTreeNode1();

        assertEquals(source.recursive(head), source.iterative(head));

    }
}
