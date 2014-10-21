package weivretni.geek4geek;

import junit.framework.Assert;

import org.junit.Test;


public class Question_DP_LongestPalindromicSubstring_Test {
    private Question_DP_LongestPalindromicSubstring source = new Question_DP_LongestPalindromicSubstring();

    @Test
    public void testMax() {

        Assert.assertEquals("abcba", source.doIt("abcba123"));
        Assert.assertEquals("bcb", source.doIt("11abcb123"));
        Assert.assertEquals("1", source.doIt("123abc"));
        Assert.assertEquals("121", source.doIt("123abc121"));
        Assert.assertEquals("1221", source.doIt("1221"));
     }
}
