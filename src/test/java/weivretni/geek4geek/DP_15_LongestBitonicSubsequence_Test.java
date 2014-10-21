package weivretni.geek4geek;

import org.junit.Test;

import weivretni.BaseTest;

public class DP_15_LongestBitonicSubsequence_Test extends BaseTest {

    private DP_15_LongestBitonicSubsequence source = new DP_15_LongestBitonicSubsequence();

    @Test
    public void test() {
        assertEquals(new int[] { 1, 2, 1 }, source.doIt(new int[] { 1, 0, 2, 1 }));
        assertEquals(new int[] { 1, 11, 10, 4, 2, 1 }, source.doIt(new int[] { 1, 11, 2, 10, 4, 5, 2, 1 }));
        assertEquals(new int[] { 80, 60, 30, 20, 10 }, source.doIt(new int[] { 80, 60, 30, 40, 20, 10 }));
        assertEquals(new int[] { 80, 60, 40, 20, 10 }, source.doIt(new int[] { 80, 60, 40, 20, 10 }));
    }
}
