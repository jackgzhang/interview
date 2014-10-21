package weivretni.geek4geek;

import junit.framework.Assert;

import org.junit.Test;

public class Question_DP_LongestIncreasingSubsquence_Test {

    private DP_3_LongestIncreasingSubsquence source = new DP_3_LongestIncreasingSubsquence();

    @Test
    public void testMax() {

        Assert.assertEquals(3, source.doIt(new int[] { 1, 2, 3 }));
        Assert.assertEquals(2, source.doIt(new int[] { 8, 1, 2 }));
        Assert.assertEquals(2, source.doIt(new int[] { 2, 3, 1 }));
        Assert.assertEquals(6, source.doIt(new int[] { 10, 22, 9, 33, 21, 50, 41, 60, 80 })); // 10,22,33,50,60,80
        Assert.assertEquals(7, source.doIt(new int[] { 10, 22, 9, 33, 21, 50, 41, 60, 80, 81 })); // 10,22,33,50,60,80,81
    }
}
