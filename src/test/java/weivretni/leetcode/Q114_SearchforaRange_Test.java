package weivretni.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class Q114_SearchforaRange_Test {

    @Test
    public void test() {
        Q114_SearchforaRange source = new Q114_SearchforaRange();

        Assert.assertArrayEquals(new int[] { 1, 1 }, source.searchRange(new int[] { 1, 2 }, 2));
        Assert.assertArrayEquals(new int[] { -1, -1 }, source.searchRange(new int[] { 1, 1, 1, 2, 3, 4 }, 7));
        Assert.assertArrayEquals(new int[] { 3, 4 }, source.searchRange(new int[] { 5, 7, 7, 8, 8, 10 }, 8));

    }
}
