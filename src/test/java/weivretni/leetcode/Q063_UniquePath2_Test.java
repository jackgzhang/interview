package weivretni.leetcode;

import junit.framework.Assert;
import org.junit.Test;

public class Q063_UniquePath2_Test {

    @Test
    public void test() {
        Q063_UniquePath2 source = new Q063_UniquePath2();

        Assert.assertEquals(2, source.uniquePathsWithObstacles(new int[][] { { 0, 0, 0 }, { 0, 1, 0 }, { 0, 0, 0 } }));
    }
}
