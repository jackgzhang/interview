package weivretni.geek4geek;

import junit.framework.Assert;

import org.junit.Test;

public class Question_DP_LongestPalindromicSubsequence_Test {

    private DP_12_LongestPalindromicSubsequence source = new DP_12_LongestPalindromicSubsequence();

    @Test
    public void test() {
        Assert.assertEquals(3, source.doIt("1234541"));
        
        //Assert.assertEquals(9, source.doIt("123454321"));
        
    }
}
