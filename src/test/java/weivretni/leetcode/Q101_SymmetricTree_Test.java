package weivretni.leetcode;

import junit.framework.Assert;
import org.junit.Test;
import weivretni.BaseTest;

public class Q101_SymmetricTree_Test extends BaseTest {

    @Test
    public void test() {
        Q101_SymmetricTree source = new Q101_SymmetricTree();

        Assert.assertEquals(true,
            source.isSymmetric(this.buildTree(new String[] { "1", "2", "2", "3", "4", "4", "3" })));

        Assert.assertEquals(false,
            source.isSymmetric(this.buildTree(new String[] { "1", "2", "2", "3", "4", "4", "3", "1" })));

        Assert.assertEquals(false,
            source.isSymmetric(this.buildTree(new String[] { "1", "2", "2", "3", "4", "4", "5" })));

    }
}
