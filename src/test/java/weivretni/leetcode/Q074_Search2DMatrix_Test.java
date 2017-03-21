package weivretni.leetcode;

import junit.framework.Assert;
import org.junit.Test;

public class Q074_Search2DMatrix_Test {

    @Test
    public void test() {
        Q074_Search2DMatrix source = new Q074_Search2DMatrix();

        Assert.assertEquals(true,source.searchMatrix(new int[][]{{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22}, {10, 13, 14, 17, 24}, {18, 21, 23, 26, 30}}, 5));
        Assert.assertEquals(false,source.searchMatrix(new int[][]{{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22}, {10, 13, 14, 17, 24}, {18, 21, 23, 26, 30}}, 20));
        Assert.assertEquals(true,source.searchMatrix(new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 50}}, 3));
        Assert.assertEquals(false,source.searchMatrix(new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 50}}, 4));
        Assert.assertEquals(true,source.searchMatrix(new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 50}}, 34));
    }
}
