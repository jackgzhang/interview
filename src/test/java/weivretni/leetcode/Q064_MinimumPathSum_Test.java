package weivretni.leetcode;

import junit.framework.Assert;
import org.junit.Test;

public class Q064_MinimumPathSum_Test {

    @Test
    public void test() {
        Q064_MinimumPathSum source = new Q064_MinimumPathSum();
        Assert.assertEquals(7, source.minPathSum(new int[][] { { 1, 3, 1 }, { 1, 5, 1 }, { 4, 2, 1 } }));
        Assert.assertEquals(10, source.minPathSum(new int[][] { { 1, 3, 1, 1 }, { 1, 5, 1, 2 }, { 4, 2, 1, 3 } }));
        Assert.assertEquals(8, source.minPathSum(new int[][] { { 1, 2 }, { 5, 6 }, { 1, 1 } }));
    }
}
