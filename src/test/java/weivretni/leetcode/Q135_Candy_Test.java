package weivretni.leetcode;

import junit.framework.Assert;
import org.junit.Test;

public class Q135_Candy_Test {

    private Q135_Candy source = new Q135_Candy();

    @Test
    public void test() {
        Assert.assertEquals(8, source.candy(new int[] { 1, 2, 3, 3, 3 }));
        Assert.assertEquals(6, source.candy(new int[] { 1, 2, 3 }));
        Assert.assertEquals(4, source.candy(new int[] { 1, 2, 2 }));
    }
}
