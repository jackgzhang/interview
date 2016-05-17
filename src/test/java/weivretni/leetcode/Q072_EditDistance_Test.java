package weivretni.leetcode;

import junit.framework.Assert;
import org.junit.Test;

public class Q072_EditDistance_Test {

    private Q072_EditDistance source = new Q072_EditDistance();

    @Test
    public void test() {
        Assert.assertEquals(1, source.minDistance("ab", "ac"));
        Assert.assertEquals(2, source.minDistance("ab", "bc"));
        Assert.assertEquals(1, source.minDistance("a", "b"));
    }
}
