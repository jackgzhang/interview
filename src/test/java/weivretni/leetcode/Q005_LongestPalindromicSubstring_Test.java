package weivretni.leetcode;

import junit.framework.Assert;
import org.junit.Test;

public class Q005_LongestPalindromicSubstring_Test {

    private Q005_LongestPalindromicSubstring source = new Q005_LongestPalindromicSubstring();

    @Test
    public void test() {
        Assert.assertEquals("aba", source.longestPalindrome("aaba"));
        Assert.assertEquals("aa", source.longestPalindrome("aa"));
        Assert.assertEquals("abba", source.longestPalindrome("aabba"));
        Assert.assertEquals("x1x", source.longestPalindrome("x1x"));
        Assert.assertEquals("aaaaa", source.longestPalindrome("aaaaa"));
        Assert.assertEquals("aa", source.longestPalindrome("aa"));
        Assert.assertEquals("a", source.longestPalindrome("a"));
        Assert.assertEquals("aba", source.longestPalindrome("aba"));
        Assert.assertEquals("aba", source.longestPalindrome("caba"));
        Assert.assertEquals("aaaaaaaaaaaaaaaaaaaa", source.longestPalindrome("aaaaaaaaaaaaaaaaaaaa"));
    }

    @Test
    public void test2() {
        Assert.assertEquals("aba", source.longestPalindrome2("aaba"));
        Assert.assertEquals("aa", source.longestPalindrome2("aa"));
        Assert.assertEquals("abba", source.longestPalindrome2("aabba"));
        Assert.assertEquals("x1x", source.longestPalindrome2("x1x"));
        Assert.assertEquals("aaaaa", source.longestPalindrome2("aaaaa"));
        Assert.assertEquals("aa", source.longestPalindrome2("aa"));
        Assert.assertEquals("a", source.longestPalindrome2("a"));
        Assert.assertEquals("aba", source.longestPalindrome2("aba"));
        Assert.assertEquals("aba", source.longestPalindrome2("caba"));
        Assert.assertEquals("aaaaaaaaaaaaaaaaaaaa", source.longestPalindrome2("aaaaaaaaaaaaaaaaaaaa"));

    }
}
