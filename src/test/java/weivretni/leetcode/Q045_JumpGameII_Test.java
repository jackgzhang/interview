package weivretni.leetcode;

import junit.framework.Assert;
import org.junit.Test;

public class Q045_JumpGameII_Test {

    @Test
    public void test() {
        Q045_JumpGameII source = new Q045_JumpGameII();

        Assert.assertEquals(2, source.jump(new int[] { 2, 3, 1, 1, 4 }));
    }
}
