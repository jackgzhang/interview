package weivretni.leetcode;

import junit.framework.Assert;
import org.junit.Test;

public class Q005_LongestPalindromicSubstring_Test {

    private Q005_LongestPalindromicSubstring source = new Q005_LongestPalindromicSubstring();

    @Test
    public void test() {
        Assert.assertEquals(source.longestPalindrome("aaba"), source.longestPalindrome2("aaba"));
        Assert.assertEquals(source.longestPalindrome("aa"), source.longestPalindrome2("aa"));
        Assert.assertEquals(source.longestPalindrome("aabba"), source.longestPalindrome2("aabba"));
        Assert.assertEquals(source.longestPalindrome("x1x"), source.longestPalindrome2("x1x"));
        Assert.assertEquals(source.longestPalindrome("aaaaa"), source.longestPalindrome2("aaaaa"));
        Assert.assertEquals(source.longestPalindrome("aa"), source.longestPalindrome2("aa"));
        Assert.assertEquals(source.longestPalindrome("a"), source.longestPalindrome2("a"));
        Assert.assertEquals(source.longestPalindrome("aba"), source.longestPalindrome2("aba"));
        Assert.assertEquals(source.longestPalindrome("caba"), source.longestPalindrome2("caba"));
        Assert.assertEquals(source.longestPalindrome("aaaaaaaaaaaaaaaaaaaa"), source.longestPalindrome2("aaaaaaaaaaaaaaaaaaaa"));
    }
}
