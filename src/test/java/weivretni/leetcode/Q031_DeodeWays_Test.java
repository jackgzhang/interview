package weivretni.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class Q031_DeodeWays_Test {

    private Q091_DecodeWays source = new Q091_DecodeWays();

    @Test
    public void test() {
        Assert.assertSame(0, source.numDecodings("301"));
        
        Assert.assertSame(1, source.numDecodings("101"));
        Assert.assertSame(0, source.numDecodings("100"));
        Assert.assertSame(1, source.numDecodings("1"));
        Assert.assertSame(2, source.numDecodings("12"));
        Assert.assertSame(0, source.numDecodings("0"));
        Assert.assertSame(1, source.numDecodings("10"));
        Assert.assertSame(0, source.numDecodings("00"));
        Assert.assertSame(0, source.numDecodings("0001"));
        Assert.assertSame(0, source.numDecodings("01"));

        

    }
}
