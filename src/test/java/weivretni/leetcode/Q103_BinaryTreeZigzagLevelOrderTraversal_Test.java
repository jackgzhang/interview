package weivretni.leetcode;

import org.junit.Test;
import weivretni.BaseTest;

import java.util.List;

public class Q103_BinaryTreeZigzagLevelOrderTraversal_Test extends BaseTest {

    private Q103_BinaryTreeZigzagLevelOrderTraversal source = new Q103_BinaryTreeZigzagLevelOrderTraversal();

    @Test
    public void test() {

        List res = source.zigzagLevelOrder(this.buildTree(new String[] { "1", "2", "3", "4", "#", "#", "5" }));
        System.out.println(res);

        res = source.zigzagLevelOrder(this.buildTree(new String[] { "1", "2", "3", }));
        System.out.println(res);
    }
}
