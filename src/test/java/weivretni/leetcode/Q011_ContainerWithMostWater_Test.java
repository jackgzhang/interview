package weivretni.leetcode;

import junit.framework.Assert;
import org.junit.Test;

public class Q011_ContainerWithMostWater_Test {

    @Test
    public void test() {

        Q011_ContainerWithMostWater source = new Q011_ContainerWithMostWater();

        Assert.assertEquals(1, source.maxArea(new int[] { 1, 1 }));
    }
}
