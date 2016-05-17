package weivretni.leetcode;

import junit.framework.Assert;
import org.junit.Test;
import weivretni.BaseTest;

public class Q129_SumRootToLeafNumbers_Test extends BaseTest {

    @Test
    public void test() {
        Q129_SumRootToLeafNumbers source = new Q129_SumRootToLeafNumbers();

        Assert.assertEquals(25, source.sumNumbers(this.buildTree(new String[] { "1", "2", "3" })));
        Assert.assertEquals(259, source.sumNumbers(this.buildTree(new String[] { "1", "2", "3", "4", "#", "#", "5" })));

    }
}
