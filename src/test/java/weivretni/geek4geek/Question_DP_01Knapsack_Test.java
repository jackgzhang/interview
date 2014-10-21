package weivretni.geek4geek;

import junit.framework.Assert;

import org.junit.Test;

public class Question_DP_01Knapsack_Test {

    private DP_10_01Knapsack source = new DP_10_01Knapsack();

    @Test
    public void test() {
        Assert.assertEquals(9, source.doIt(4, new int[] { 3, 5, 6 }, new int[] { 1, 2, 3 }, 3));
        Assert.assertEquals(180, source.doIt(50, new int[] { 60, 100, 120 }, new int[] { 10, 20, 30 }, 3));
    }
}
