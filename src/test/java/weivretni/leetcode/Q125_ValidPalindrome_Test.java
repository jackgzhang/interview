package weivretni.leetcode;

import junit.framework.Assert;
import org.junit.Test;

public class Q125_ValidPalindrome_Test {

    @Test
    public void test() {
        Q125_ValidPalindrome source = new Q125_ValidPalindrome();

        Assert.assertEquals(false, source.isPalindrome("1a2"));
        Assert.assertEquals(true, source.isPalindrome("aA"));
        Assert.assertEquals(true, source.isPalindrome("a"));
        Assert.assertEquals(true, source.isPalindrome("a."));
        Assert.assertEquals(true, source.isPalindrome("aa"));
    }
}
