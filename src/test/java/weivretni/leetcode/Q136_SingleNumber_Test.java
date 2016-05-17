package weivretni.leetcode;

import junit.framework.Assert;
import org.junit.Test;

public class Q136_SingleNumber_Test {

    @Test
    public void test() {
        Q136_SingleNumber source = new Q136_SingleNumber();

        Assert.assertEquals(2, source.singleNumber(new int[]{1,2,1}));
        Assert.assertEquals(1, source.singleNumber(new int[]{1,2,3,4,5,6,6,5,4,3,2}));
    }
}
