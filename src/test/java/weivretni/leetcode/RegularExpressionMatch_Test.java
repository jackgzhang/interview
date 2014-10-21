package weivretni.leetcode;

import junit.framework.Assert;

import org.junit.Test;

public class RegularExpressionMatch_Test {

    private RegularExpressionMatch source = new RegularExpressionMatch();

    @Test
    public void test1() {

        Assert.assertTrue(source.isMatch("aaa", "a*a"));

        Assert.assertTrue(source.isMatch("aaa", "a.a"));
        Assert.assertFalse(source.isMatch("aa", "a"));
        Assert.assertFalse(source.isMatch("aaa", "aa"));
        Assert.assertTrue(source.isMatch("aa", "a*"));
        Assert.assertTrue(source.isMatch("aa", ".*"));
        Assert.assertTrue(source.isMatch("ab", ".*"));
        Assert.assertTrue(source.isMatch("aab", "c*a*b"));

    }
}
