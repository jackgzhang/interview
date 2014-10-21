package weivretni.geek4geek;

import junit.framework.Assert;

import org.junit.Test;

public class Question_DP_MaximumSumIncreasingSubsequence_Test {

    private DP_14_MaximumSumIncreasingSubsequence source = new DP_14_MaximumSumIncreasingSubsequence();

    @Test
    public void test() {
        Assert.assertEquals(3, source.doIt(new int[] { 1, 2 }));
        Assert.assertEquals(8, source.doIt(new int[] { 8, 7, 1, 2, 3 }));
        Assert.assertEquals(10, source.doIt(new int[] { -1, 1, 2, 3, 4 }));
    }
}
