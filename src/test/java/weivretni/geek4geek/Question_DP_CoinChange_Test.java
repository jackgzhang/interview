package weivretni.geek4geek;

import junit.framework.Assert;

import org.junit.Test;

public class Question_DP_CoinChange_Test {

    private DP_7_CoinChange source = new DP_7_CoinChange();

    @Test
    public void test() {
        Assert.assertEquals(4, source.doIt(new int[] { 2, 3, 5 }, 10));
        Assert.assertEquals(5, source.doIt(new int[] { 2, 5, 3, 6 }, 10));
    }
}
