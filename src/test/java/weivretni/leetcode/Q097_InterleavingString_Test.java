package weivretni.leetcode;

import junit.framework.Assert;
import org.junit.Test;

public class Q097_InterleavingString_Test {

    private Q097_InterleavingString source = new Q097_InterleavingString();

    @Test
    public void test() {
        Assert.assertEquals(source.isInterleave2("abbbbbbcabbacaacccababaabcccabcacbcaabbbacccaaaaaababbbacbb", "ccaacabbacaccacababbbbabbcacccacccccaabaababacbbacabbbbabc", "cacbabbacbbbabcbaacbbaccacaacaacccabababbbababcccbabcabbaccabcccacccaabbcbcaccccaaaaabaaaaababbbbacbbabacbbacabbbbabc"), source.isInterleave("abbbbbbcabbacaacccababaabcccabcacbcaabbbacccaaaaaababbbacbb", "ccaacabbacaccacababbbbabbcacccacccccaabaababacbbacabbbbabc", "cacbabbacbbbabcbaacbbaccacaacaacccabababbbababcccbabcabbaccabcccacccaabbcbcaccccaaaaabaaaaababbbbacbbabacbbacabbbbabc"));
        Assert.assertEquals(source.isInterleave2("c", "a", "ac"), source.isInterleave("c", "a", "ac"));
        Assert.assertEquals(source.isInterleave2("aabcc", "dbbca", "aadbbcbcac"), source.isInterleave("aabcc", "dbbca", "aadbbcbcac"));
        Assert.assertEquals(source.isInterleave2("ac", "ac", "acac"), source.isInterleave("ac", "ac", "acac"));
        Assert.assertEquals(source.isInterleave2("a", "b", "aba"), source.isInterleave("a", "b", "aba"));
        Assert.assertEquals(source.isInterleave2("a", "c", "aba"), source.isInterleave("a", "c", "aba"));

    }
}
