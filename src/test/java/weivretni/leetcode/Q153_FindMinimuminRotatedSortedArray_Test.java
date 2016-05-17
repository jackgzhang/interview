package weivretni.leetcode;

import junit.framework.Assert;
import org.junit.Test;

public class Q153_FindMinimuminRotatedSortedArray_Test {

    private Q153_FindMinimuminRotatedSortedArray source = new Q153_FindMinimuminRotatedSortedArray();

    @Test
    public void test() {
        Assert.assertEquals(1, source.findMin(new int[] { 4, 5, 6, 7, 10, 1 }));
        Assert.assertEquals(1, source.findMin(new int[] { 2, 1 }));
        Assert.assertEquals(1, source.findMin(new int[] { 1 }));
        Assert.assertEquals(1, source.findMin(new int[] { 1, 2 }));
        Assert.assertEquals(0, source.findMin(new int[] { 4, 5, 6, 7, 0 }));
        Assert.assertEquals(0, source.findMin(new int[] { 4, 5, 6, 7, 0, 1 }));
        Assert.assertEquals(0, source.findMin(new int[] { 4, 5, 6, 7, 0, 1, 2, 3 }));
    }
}
