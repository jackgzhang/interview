package weivretni.leetcode;

import junit.framework.Assert;
import org.junit.Test;

public class Q084_LargestRectangleinHistogram_Test {

    private Q084_LargestRectangleinHistogram source = new Q084_LargestRectangleinHistogram();

    @Test
    public void test() {
        Assert.assertEquals(10, source.largestRectangleArea(new int[] { 2, 1, 5, 6, 2, 3 }));
        Assert.assertEquals(2, source.largestRectangleArea(new int[] { 2 }));
        
    }
}
