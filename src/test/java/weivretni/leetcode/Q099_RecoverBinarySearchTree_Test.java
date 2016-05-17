package weivretni.leetcode;

import org.junit.Test;
import weivretni.BaseTest;
import weivretni.TreeNode;

public class Q099_RecoverBinarySearchTree_Test extends BaseTest {

    @Test
    public void test() {
        Q099_RecoverBinarySearchTree source = new Q099_RecoverBinarySearchTree();

        TreeNode node = null;

        source.recoverTree(node = this.buildTree(new String[] { "1", "2", "3" }));
        System.out.println(node);

        source.recoverTree(node = this.buildTree(new String[] { "2", "3", "1" }));
        System.out.println(node);
    }
}
