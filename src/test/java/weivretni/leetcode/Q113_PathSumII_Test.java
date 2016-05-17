package weivretni.leetcode;

import org.junit.Test;
import weivretni.BaseTest;
import weivretni.TreeNode;

public class Q113_PathSumII_Test extends BaseTest {

    @Test
    public void test() {
        Q113_PathSumII source = new Q113_PathSumII();

        TreeNode node = null;

        node = this.buildTree(new String[] { "1", "2" });
        System.out.println(source.pathSum(node, 3));

        node = this.buildTree(new String[] { "0", "1", "1" });
        System.out.println(source.pathSum(node, 1));
    }
}
