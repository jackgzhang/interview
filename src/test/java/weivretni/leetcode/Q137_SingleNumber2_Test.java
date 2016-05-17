package weivretni.leetcode;

import junit.framework.Assert;
import org.junit.Test;

public class Q137_SingleNumber2_Test {

    @Test
    public void test() {
        Q137_SingleNumber2 source = new Q137_SingleNumber2();

        Assert.assertEquals(2, source.singleNumber(new int[] { 1, 2, 1, 1 }));

        Assert.assertEquals(4, source.singleNumber(new int[] { 1, 2, 1, 1, 2, 2, 4 }));
    }
}
