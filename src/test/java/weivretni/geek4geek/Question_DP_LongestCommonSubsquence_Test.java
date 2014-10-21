package weivretni.geek4geek;

import junit.framework.Assert;

import org.junit.Test;

public class Question_DP_LongestCommonSubsquence_Test {

    private DP_4_LongestCommonSubsquence source = new DP_4_LongestCommonSubsquence();

    @Test
    public void test() {
        Assert.assertEquals("GTAB", source.doIt("AGGTABC", "GXTXAYB"));
        Assert.assertEquals("TAB", source.doIt("TAB", "GXTXAYB"));
        Assert.assertEquals("", source.doIt("123", "GXTXAYB"));
    }

}
