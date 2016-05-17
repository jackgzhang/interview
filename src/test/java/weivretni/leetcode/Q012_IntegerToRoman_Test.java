package weivretni.leetcode;

import junit.framework.Assert;
import org.junit.Test;

public class Q012_IntegerToRoman_Test {

    private Q012_IntegerToRoman source = new Q012_IntegerToRoman();

    @Test
    public void test() {
        Assert.assertEquals("IV", source.intToRoman(4));
        Assert.assertEquals("XXXII", source.intToRoman(32));
        Assert.assertEquals("X", source.intToRoman(10));
        Assert.assertEquals("MMMCCL", source.intToRoman(3250));
        Assert.assertEquals("X", source.intToRoman(10));
    }
}
