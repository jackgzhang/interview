package weivretni.geek4geek;

import junit.framework.Assert;

import org.junit.Test;

public class Question_DP_MatricChainMulitplication_Test {

    private DP_8_MatricChainMulitplication source = new DP_8_MatricChainMulitplication();

    @Test
    public void test() {
        Assert.assertEquals(24000, source.doIt(new int[] { 40, 20, 30 }));
        Assert.assertEquals(30, source.doIt(new int[] { 1, 2, 3, 4, 3 }));
        Assert.assertEquals(26000, source.doIt(new int[] { 40, 20, 30, 10, 30 }));
        Assert.assertEquals(4500, source.doIt(new int[] { 10, 30, 5, 60 }));
    }
}
