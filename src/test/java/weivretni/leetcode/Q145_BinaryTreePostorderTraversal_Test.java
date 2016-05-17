package weivretni.leetcode;

import org.junit.Test;
import weivretni.BaseTest;
import weivretni.TreeNode;

/**
 * Created by gzhang on 4/29/16.
 */
public class Q145_BinaryTreePostorderTraversal_Test extends BaseTest {

    @Test
    public void test() {
        Q145_BinaryTreePostorderTraversal source = new Q145_BinaryTreePostorderTraversal();
        TreeNode head = this.getTreeNode1();
        assertEquals(source.recursive(head), source.iterative(head));
    }
}
