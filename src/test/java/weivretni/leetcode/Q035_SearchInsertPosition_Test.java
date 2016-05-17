package weivretni.leetcode;

import junit.framework.Assert;
import org.junit.Test;

public class Q035_SearchInsertPosition_Test {

    @Test
    public void test() {
        Q035_SearchInsertPosition source = new Q035_SearchInsertPosition();

        Assert.assertEquals(1, source.searchInsert(new int[] { 1 }, 2));
        Assert.assertEquals(0, source.searchInsert(new int[] { 1, 3, 5 }, 0));
        Assert.assertEquals(0, source.searchInsert(new int[] { 1 }, 0));
        Assert.assertEquals(0, source.searchInsert(new int[] { 1, 3 }, 1));
        Assert.assertEquals(1, source.searchInsert(new int[] { 1, 3 }, 2));
        Assert.assertEquals(2, source.searchInsert(new int[] { 1, 4 }, 5));
        Assert.assertEquals(2, source.searchInsert(new int[] { 1, 3, 5 }, 4));
    }
}
