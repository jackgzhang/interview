package weivretni.leetcode;

import junit.framework.Assert;
import org.junit.Test;

public class Q053_MaximumSubarray_Test {

    @Test
    public void test() {
        Q053_MaximumSubarray source = new Q053_MaximumSubarray();

        Assert.assertEquals(14, source.maxSubArray(new int[] { 1, -4, 2, 4, -1, 9, -10, 3 }));
        Assert.assertEquals(6, source.maxSubArray(new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 }));
        Assert.assertEquals(5, source.maxSubArray(new int[] { -1, 2, 3 }));
        Assert.assertEquals(1, source.maxSubArray(new int[] { -2, 1 }));
        Assert.assertEquals(-1, source.maxSubArray(new int[] { -2, -1 }));
        Assert.assertEquals(-1, source.maxSubArray(new int[] { -1 }));
    }
}
