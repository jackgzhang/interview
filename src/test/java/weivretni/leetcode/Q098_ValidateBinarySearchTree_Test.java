package weivretni.leetcode;

import junit.framework.Assert;
import org.junit.Test;
import weivretni.BaseTest;

public class Q098_ValidateBinarySearchTree_Test extends BaseTest {

    private Q098_ValidateBinarySearchTree source = new Q098_ValidateBinarySearchTree();

    @Test
    public void test() {
        Assert.assertEquals(true, source.isValidBST(this.buildTree(new String[] { "2147483647" })));
        Assert.assertEquals(true, source.isValidBST(this.buildTree(new String[] { "1" })));
        Assert.assertEquals(false, source.isValidBST(this.buildTree(new String[] { "1", "1" })));
    }
}
