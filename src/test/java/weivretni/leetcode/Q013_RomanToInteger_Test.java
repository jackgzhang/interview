package weivretni.leetcode;

import junit.framework.Assert;
import org.junit.Test;

public class Q013_RomanToInteger_Test {

    private Q013_RomanToInteger source = new Q013_RomanToInteger();

    @Test
    public void test() {
        Assert.assertEquals(4, source.romanToInt("IV"));
        Assert.assertEquals(32, source.romanToInt("XXXII"));
        Assert.assertEquals(10, source.romanToInt("X"));
        Assert.assertEquals(3250, source.romanToInt("MMMCCL"));
    }
}
