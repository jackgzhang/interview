package weivretni.leetcode;

import junit.framework.Assert;
import org.junit.Test;

public class Q010_RegularExpressionMatch_Test {

    private Q010_RegularExpressionMatch source = new Q010_RegularExpressionMatch();

    @Test
    public void test1() {
        
        Assert.assertFalse(source.isMatch("a", ".*..a*"));
        Assert.assertTrue(source.isMatch("a", "ab*"));
        
        
        Assert.assertTrue(source.isMatch("aa", "a*"));
        
        Assert.assertTrue(source.isMatch("aaa", "a.a"));
        Assert.assertTrue(source.isMatch("aaa", "a*a"));

        
        Assert.assertFalse(source.isMatch("aa", "a"));
        Assert.assertFalse(source.isMatch("aaa", "aa"));
        Assert.assertTrue(source.isMatch("aa", "a*"));
        Assert.assertTrue(source.isMatch("aa", ".*"));
        Assert.assertTrue(source.isMatch("ab", ".*"));
        Assert.assertTrue(source.isMatch("aab", "c*a*b"));

    }
}
