package weivretni.leetcode;

import junit.framework.Assert;
import org.junit.Test;
import weivretni.BaseTest;
import weivretni.TreeNode;

public class Q124_BinaryTreeMaximumPathSum_Test extends BaseTest {

    private Q124_BinaryTreeMaximumPathSum source = new Q124_BinaryTreeMaximumPathSum();

    @Test
    public void test() {
        TreeNode treeNode = this.buildTree(new String[]{"-5", "2", "3", "-1", "4"});
        Assert.assertEquals(6, source.maxPathSum(treeNode));
    }
}
