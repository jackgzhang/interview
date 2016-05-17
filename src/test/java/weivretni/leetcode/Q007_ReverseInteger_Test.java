package weivretni.leetcode;

import junit.framework.Assert;
import org.junit.Test;

public class Q007_ReverseInteger_Test {

    @Test
    public void test() {
        Q007_ReverseInteger source = new Q007_ReverseInteger();
        // -2147483648
        // 2147483647
        Assert.assertEquals(2147483641, source.reverse(1463847412));
        Assert.assertEquals(0, source.reverse(-2147483648));
        Assert.assertEquals(0, source.reverse(-1563847412));
        Assert.assertEquals(0, source.reverse(-2147483648));
        Assert.assertEquals(0, source.reverse(1534236469));
        Assert.assertEquals(1, source.reverse(100));
        Assert.assertEquals(1, source.reverse(1));
        Assert.assertEquals(-1, source.reverse(-1));
        Assert.assertEquals(321, source.reverse(123));
        Assert.assertEquals(-321, source.reverse(-123));
        Assert.assertEquals(-44321, source.reverse(-12344));
    }
}
