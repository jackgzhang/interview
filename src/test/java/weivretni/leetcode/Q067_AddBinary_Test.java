package weivretni.leetcode;

import junit.framework.Assert;
import org.junit.Test;

public class Q067_AddBinary_Test {

    private Q067_AddBinary source = new Q067_AddBinary();

    @Test
    public void test() {
        Assert.assertEquals("100", source.addBinary("11", "1"));
        Assert.assertEquals("10101", source.addBinary("1010", "1011"));
        Assert.assertEquals("10101", source.addBinary("1010", "1011"));
        Assert.assertEquals("1", source.addBinary("1", "0"));
        Assert.assertEquals("0", source.addBinary("0", "0"));
        Assert.assertEquals("10", source.addBinary("1", "1"));
        Assert.assertEquals("11", source.addBinary("10", "1"));
        Assert.assertEquals("1001", source.addBinary("1000", "1"));

    }
}
