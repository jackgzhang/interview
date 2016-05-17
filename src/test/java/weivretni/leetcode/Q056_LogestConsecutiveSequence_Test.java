package weivretni.leetcode;

import junit.framework.Assert;
import org.junit.Test;

public class Q056_LogestConsecutiveSequence_Test {

    private Q056_LogestConsecutiveSequence source = new Q056_LogestConsecutiveSequence();

    @Test
    public void test() {
        Assert.assertEquals(3, source.longestConsecutive(new int[] { 100, 1, 300, 2, 5, 400, 3 }));
    }
}
