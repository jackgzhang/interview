package weivretni.leetcode;

import junit.framework.Assert;
import org.junit.Test;

public class Q091_DecodeWays_Test {

    @Test
    public void test() {
        Q091_DecodeWays source = new Q091_DecodeWays();

        Assert.assertEquals(1, source.numDecodings("27"));
        Assert.assertEquals(2, source.numDecodings("227"));
        Assert.assertEquals(1, source.numDecodings("10"));
        Assert.assertEquals(3, source.numDecodings("123"));
        Assert.assertEquals(2, source.numDecodings("12"));

    }
}
