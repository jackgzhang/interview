package weivretni.leetcode;

import junit.framework.Assert;
import org.junit.Test;

public class Q042_TrappingRainWater_Test {

    @Test
    public void test() {
        Q042_TrappingRainWater source = new Q042_TrappingRainWater();

        Assert.assertEquals(14, source.trap(new int[] { 5, 2, 1, 2, 1, 5 }));
        Assert.assertEquals(1, source.trap(new int[] { 5, 4, 1, 2 }));
        Assert.assertEquals(6, source.trap(new int[] { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 }));
        Assert.assertEquals(1, source.trap(new int[] { 1, 0, 2 }));
        Assert.assertEquals(1, source.trap(new int[] { 1, 0, 1 }));
        Assert.assertEquals(2, source.trap(new int[] { 1, 0, 0, 1 }));
        Assert.assertEquals(2, source.trap(new int[] { 0, 1, 1, 0, 0, 1 }));

    }
}
