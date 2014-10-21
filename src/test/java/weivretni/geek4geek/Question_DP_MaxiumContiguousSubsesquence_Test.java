package weivretni.geek4geek;

import junit.framework.Assert;

import org.junit.Test;

public class Question_DP_MaxiumContiguousSubsesquence_Test {

    private Question_DP_MaxiumContiguousSubsesquence source = new Question_DP_MaxiumContiguousSubsesquence();

    @Test
    public void testMax() {

        Assert.assertEquals(2, source.getMaxContigousSubsequence(new int[] { 2, -1 })); // Not
                                                                                        // working
        Assert.assertEquals(0, source.getMaxContigousSubsequence(new int[] { 0 }));
        Assert.assertEquals(1, source.getMaxContigousSubsequence(new int[] { 0, 1 }));
        Assert.assertEquals(3, source.getMaxContigousSubsequence(new int[] { 0, 1, 2, -1, 1 }));
        Assert.assertEquals(6, source.getMaxContigousSubsequence(new int[] { 0, 1, 2, -1, 1, 3 }));
        Assert.assertEquals(7, source.getMaxContigousSubsequence(new int[] { 0, 1, 2, -1, 1, 3, -6, 7 }));

        Assert.assertEquals(6, source.getMaxContigousSubsequencePrintRange(new int[] { 0, 1, 2, -1, 1, 3 }));
        Assert.assertEquals(7, source.getMaxContigousSubsequencePrintRange(new int[] { 0, 1, 2, -1, 1, 3, -6, 7 }));
    }
}
