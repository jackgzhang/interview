package weivretni.leetcode;

import junit.framework.Assert;
import org.junit.Test;

public class Q008_StringToInteger_Test {

    @Test
    public void test() {
        Q008_StringToInteger source = new Q008_StringToInteger();

        Assert.assertEquals(Integer.MAX_VALUE, source.atoi("2147483648"));
        Assert.assertEquals(Integer.MIN_VALUE, source.atoi("-2147483648"));
        Assert.assertEquals(0, source.atoi("   +0 123"));
        Assert.assertEquals(Integer.MAX_VALUE, source.atoi("    10522545459"));
        Assert.assertEquals(Integer.MAX_VALUE, source.atoi("9223372036854775809"));
        Assert.assertEquals(-1, source.atoi("-+1"));
        Assert.assertEquals(Integer.MIN_VALUE, source.atoi("-2147483649"));
        Assert.assertEquals(0, source.atoi(""));
        Assert.assertEquals(-12, source.atoi("  -0012a42"));
        Assert.assertEquals(-1, source.atoi("+-1"));
        Assert.assertEquals(1, source.atoi("1"));
        Assert.assertEquals(12, source.atoi("12"));
        Assert.assertEquals(-1, source.atoi("-1"));
        Assert.assertEquals(1, source.atoi(" 1"));
        Assert.assertEquals(1, source.atoi(" 1x1"));
        Assert.assertEquals(111141, source.atoi(" 111141"));

    }
}
