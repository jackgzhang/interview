package weivretni.leetcode;

import junit.framework.Assert;
import org.junit.Test;
import weivretni.BaseTest;

public class Q062_UniquePaths_Test extends BaseTest {
    @Test
    public void test() {
        Q062_UniquePaths source = new Q062_UniquePaths();
        Assert.assertEquals(10, source.uniquePaths(3, 4));
    }
}
