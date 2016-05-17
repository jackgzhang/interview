package weivretni.leetcode;

import junit.framework.Assert;
import org.junit.Test;

public class Q070_ClimbingStairs_Test {

    private Q070_ClimbingStairs source = new Q070_ClimbingStairs();

    @Test
    public void test() {

        // Assert.assertEquals(6, source.candy(new int[] { 1, 2, 3 }));
        Assert.assertEquals(5, source.climbStairs(4));
    }
}
