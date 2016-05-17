package weivretni.leetcode;

import junit.framework.Assert;
import org.junit.Test;

public class Q014_LongestCommonPrefix_Test {

    private Q014_LongestCommonPrefix source = new Q014_LongestCommonPrefix();

    @Test
    public void test() {

        Assert.assertEquals("", source.longestCommonPrefix(new String[] { "aca", "cba" }));
        Assert.assertEquals("a", source.longestCommonPrefix(new String[] { "aa", "a" }));
        Assert.assertEquals("a", source.longestCommonPrefix(new String[] { "ab", "ac" }));
        Assert.assertEquals("ab", source.longestCommonPrefix(new String[] { "ab", "abcd", "abd" }));
    }
}
