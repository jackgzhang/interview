package weivretni.microsoft;

import junit.framework.Assert;

import org.junit.Test;

public class MS3_Test {

    private MS03 source = new MS03();

    @Test
    public void test() {
        Assert.assertEquals(2, source.getMaxSum(new int[] { 1, -1, 2 }));
        Assert.assertEquals(18, source.getMaxSum(new int[] { 1, -2, 3, 10, -4, 7, 2, -5 }));
        Assert.assertEquals(3, source.getMaxSum(new int[] { -1, -2, 3 }));
        Assert.assertEquals(7, source.getMaxSum(new int[] { -1, -2, 3, 4 }));
    }
}
