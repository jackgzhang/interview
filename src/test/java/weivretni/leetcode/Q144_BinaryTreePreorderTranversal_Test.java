package weivretni.leetcode;

import org.junit.Test;
import weivretni.BaseTest;
import weivretni.TreeNode;

/**
 * Created by gzhang on 4/29/16.
 */
public class Q144_BinaryTreePreorderTranversal_Test extends BaseTest {
    @Test
    public void test() {
        Q144_BinaryTreePreorderTraversal source = new Q144_BinaryTreePreorderTraversal();
        TreeNode head = this.getTreeNode1();
        assertEquals(source.recursive(head), source.iterative(head));
    }
}
