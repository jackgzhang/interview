package weivretni.leetcode;

import junit.framework.Assert;
import org.junit.Test;

public class Q004_MedianofTwoSortedArrays_Test {

    @Test
    public void test() {
        Q004_MedianofTwoSortedArrays source = new Q004_MedianofTwoSortedArrays();
        
        Assert.assertEquals(3.0, source.findMedianSortedArrays(new int[] { 1, 2, 3 }, new int[] { 4, 5 }));
        Assert.assertEquals(3.5, source.findMedianSortedArrays(new int[] { 1, 2, 3 }, new int[] { 4, 5, 6 }));
        
        Assert.assertEquals(3.0, source.findMedianSortedArrays2(new int[] { 1, 2, 3 }, new int[] { 4, 5 }));
        Assert.assertEquals(3.5, source.findMedianSortedArrays2(new int[] { 1, 2, 3 }, new int[] { 4, 5, 6 }));
        
    }
}
