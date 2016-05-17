package weivretni.leetcode;

import junit.framework.Assert;
import org.junit.Test;

public class Q128_LongestConsecutiveSequence_Test {

    @Test
    public void test() {
        Q128_LongestConsecutiveSequence source = new Q128_LongestConsecutiveSequence();
        Assert.assertEquals(4, source.longestConsecutive(new int[] { 100, 4, 200, 1, 3, 2 }));
        Assert.assertEquals(5, source.longestConsecutive(new int[] { 100, 4, 200, 1, 3, 2, 5 }));

    }
}
