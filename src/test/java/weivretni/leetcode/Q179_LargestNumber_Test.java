package weivretni.leetcode;

import junit.framework.Assert;
import org.junit.Test;

public class Q179_LargestNumber_Test {

    @Test
    public void test() {
        Q179_LargestNumber source = new Q179_LargestNumber();

        Assert.assertEquals("9534330", source.largestNumber(new int[] { 3, 30, 34, 5, 9 }));
        Assert.assertEquals("21", source.largestNumber(new int[] { 1, 2 }));

    }
}
