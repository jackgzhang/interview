package weivretni.leetcode;

import junit.framework.Assert;
import org.junit.Test;

public class Q033_SearchinRotatedSortedArray_Test {

    @Test
    public void test() {
        Q033_SearchinRotatedSortedArray source = new Q033_SearchinRotatedSortedArray();

        Assert.assertEquals(1, source.search(new int[] { 1, 2 }, 2));
        Assert.assertEquals(4, source.search(new int[] { 2, 3, 4, 5, 1 }, 1));
        Assert.assertEquals(-1, source.search(new int[] { 1 }, 0));
        Assert.assertEquals(-1, source.search(new int[] { 1, 2 }, 0));
        Assert.assertEquals(6, source.search(new int[] { 4, 5, 6, 7, 0, 1, 2 }, 2));
        Assert.assertEquals(6, source.search(new int[] { 4, 5, 6, 7, 0, 1, 2, 3 }, 2));
    }
}
