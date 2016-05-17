package weivretni.leetcode;

import junit.framework.Assert;
import org.junit.Test;
import weivretni.BaseTest;

public class Q048_MaxDepthOfBinaryTree_Test extends BaseTest {

    private Q048_MaxDepthOfBinaryTree source = new Q048_MaxDepthOfBinaryTree();

    @Test
    public void test() {
        Assert.assertSame(3, source.maxDepth(this.buildTree(new String[] { "1", "2", "3", "4", "#", "#", "5" })));
        Assert.assertSame(4, source.maxDepth(this.buildTree(new String[] { "1", "2", "3", "4", "#", "#", "5", "6" })));
    }
}
