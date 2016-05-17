package weivretni.leetcode;

import junit.framework.Assert;
import org.junit.Test;

public class Q069_Sqrtx_Test {

    @Test
    public void test() {
        Q069_Sqrtx source = new Q069_Sqrtx();

        Assert.assertEquals(1, source.sqrt(1));
        Assert.assertEquals(1, source.sqrt(2));
        Assert.assertEquals(1, source.sqrt(3));
        Assert.assertEquals(2, source.sqrt(4));
        Assert.assertEquals(2, source.sqrt(5));
        Assert.assertEquals(2, source.sqrt(6));
        Assert.assertEquals(2, source.sqrt(7));
        Assert.assertEquals(2, source.sqrt(8));
        Assert.assertEquals(3, source.sqrt(9));

    }
}
