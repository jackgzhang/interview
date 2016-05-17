package weivretni.leetcode;

import junit.framework.Assert;
import org.junit.Test;

public class Q087_ScrambleString_Test {

    @Test
    public void test() {
        Q087_ScrambleString source = new Q087_ScrambleString();
        Assert.assertEquals(true, source.isScramble("ab", "ba"));
        Assert.assertEquals(true, source.isScramble("great", "rgeat"));
    }
}
