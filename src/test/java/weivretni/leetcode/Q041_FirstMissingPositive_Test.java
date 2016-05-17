package weivretni.leetcode;

import junit.framework.Assert;
import org.junit.Test;

public class Q041_FirstMissingPositive_Test {

    private Q041_FirstMissingPositive source = new Q041_FirstMissingPositive();

    @Test
    public void test() {

        Assert.assertEquals(2, source.firstMissingPositive(new int[] { 3, 4, -1, 1 }));
        Assert.assertEquals(3, source.firstMissingPositive(new int[] { 0, 1, 2 }));
        Assert.assertEquals(3, source.firstMissingPositive(new int[] { 2, 1 }));
        Assert.assertEquals(2, source.firstMissingPositive(new int[] { 1 }));
        Assert.assertEquals(3, source.firstMissingPositive(new int[] { 1, 2 }));
        Assert.assertEquals(2, source.firstMissingPositive(new int[] { 1, 0 }));
    }
}
