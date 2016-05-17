package weivretni.leetcode;

import junit.framework.Assert;
import org.junit.Test;

public class Q152_MaximumProductSubarray_Test {

    @Test
    public void test() {
        Q152_MaximumProductSubarray source = new Q152_MaximumProductSubarray();

        Assert.assertEquals(18, source.maxProduct(new int[] { 2, 3, -1, -3 }));
        Assert.assertEquals(6, source.maxProduct(new int[] { -1, 2, 3 }));
        Assert.assertEquals(2, source.maxProduct(new int[] { 2, -1, 1, 1 }));
        Assert.assertEquals(0, source.maxProduct(new int[] { -1, 0, -3 }));
        Assert.assertEquals(6, source.maxProduct(new int[] { 2, 3, -1 }));
        Assert.assertEquals(18, source.maxProduct(new int[] { -1, 2, 3, -1, -3 }));
    }
}
