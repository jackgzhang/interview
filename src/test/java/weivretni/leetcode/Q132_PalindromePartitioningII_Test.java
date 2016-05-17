package weivretni.leetcode;

import junit.framework.Assert;
import org.junit.Test;

public class Q132_PalindromePartitioningII_Test {

    @Test
    public void test() {
        Q132_PalindromePartitioningII source = new Q132_PalindromePartitioningII();

        Assert.assertEquals(1, (source.minCut("aab")));
        Assert.assertEquals(1, (source.minCut("aaba")));
    }
}
