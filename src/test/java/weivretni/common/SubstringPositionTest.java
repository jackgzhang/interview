package weivretni.common;

import junit.framework.Assert;

import org.junit.Test;

public class SubstringPositionTest {

    private SubstringPosition source = new SubstringPosition();

    @Test
    public void test() {
        Assert.assertEquals(1, source.getPositionBrutalFroace("abc", "bc"));
        Assert.assertEquals(9, source.getPositionBrutalFroace("abxcasdfabc", "bc"));
        Assert.assertEquals(8, source.getPositionBrutalFroace("abxcasdfabc", "abc"));
        Assert.assertEquals(-1, source.getPositionBrutalFroace("abxcasdfabc", "abcd"));
        
        
        Assert.assertEquals(1, source.getPositionRollingHash("abc", "bc"));
        Assert.assertEquals(9, source.getPositionRollingHash("abxcasdfabc", "bc"));
        Assert.assertEquals(8, source.getPositionRollingHash("abxcasdfabc", "abc"));
        Assert.assertEquals(-1, source.getPositionRollingHash("abxcasdfabc", "abcd"));
    }
}
