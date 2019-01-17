package weivretni.leetcode;

import junit.framework.Assert;
import org.junit.Test;

public class Q036_FindMinimuminRotatedSortedArray_Test {

    private Q036_FindMinimuminRotatedSortedArray source = new Q036_FindMinimuminRotatedSortedArray();

    @Test
    public void test() {

        Assert.assertEquals(1, source.findMin(new int[] { 2, 1 }));
        Assert.assertEquals(2, source.findMin(new int[] { 6, 7, 0, 1, 2, 3, 4, 5 }));
        Assert.assertEquals(4, source.findMin(new int[] { 4, 5, 6, 7, 0, 1, 2, 3 }));
        Assert.assertEquals(0, source.findMin(new int[] { 1 }));
        Assert.assertEquals(0, source.findMin(new int[] { 1, 2 }));
        Assert.assertEquals(5, source.findMin(new int[] { 4, 5, 6, 7, 10, 1 }));

    }
}
