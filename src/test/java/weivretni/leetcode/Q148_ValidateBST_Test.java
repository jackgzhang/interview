package weivretni.leetcode;

import junit.framework.Assert;
import org.junit.Test;
import weivretni.BaseTest;

public class Q148_ValidateBST_Test extends BaseTest {

    @Test
    public void test() {
        Q148_ValidateBST source = new Q148_ValidateBST();
        Assert.assertEquals(false, source.isValidBST(this.buildTree(new String[] { "3", "1", "5", "0", "2", "4", "6", "#", "#", "#", "3" })));

        Assert.assertEquals(false, source.isValidBST(this.buildTree(new String[] { "1", "#", "1" })));
    }
}
