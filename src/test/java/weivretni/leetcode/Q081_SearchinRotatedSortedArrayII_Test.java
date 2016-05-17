package weivretni.leetcode;

import junit.framework.Assert;
import org.junit.Test;

public class Q081_SearchinRotatedSortedArrayII_Test {

    @Test
    public void test() {
        Q081_SearchinRotatedSortedArrayII source = new Q081_SearchinRotatedSortedArrayII();

        Assert.assertEquals(true, source.search(new int[] { 2, 3, 4, 5, 1 }, 1));
        Assert.assertEquals(false, source.search(new int[] { 1 }, 0));
        Assert.assertEquals(false, source.search(new int[] { 1, 2 }, 0));
        Assert.assertEquals(true, source.search(new int[] { 1, 2 }, 2));
        Assert.assertEquals(true, source.search(new int[] { 4, 5, 6, 7, 0, 1, 2 }, 2));
        Assert.assertEquals(true, source.search(new int[] { 4, 5, 6, 7, 0, 1, 2, 3 }, 2));
    }
}
