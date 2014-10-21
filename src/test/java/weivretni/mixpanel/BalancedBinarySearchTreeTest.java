package weivretni.mixpanel;

import org.junit.Test;

import weivretni.BaseTest;
import weivretni.TreeNode;
import weivretni.mixpanel.BalancedBinarySearchTree;

public class BalancedBinarySearchTreeTest extends BaseTest {

    private BalancedBinarySearchTree source = new BalancedBinarySearchTree();

    @Test
    public void test() {
        TreeNode root = source.convert(new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }, 0, 10);
        System.out.println(root);
    }
}
