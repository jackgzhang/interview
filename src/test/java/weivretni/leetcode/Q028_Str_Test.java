package weivretni.leetcode;

import junit.framework.Assert;
import org.junit.Test;

public class Q028_Str_Test {

    private Q028_Str source = new Q028_Str();

    @Test
    public void test() {
        Assert.assertEquals(0, source.strStr("a", "a"));
        Assert.assertEquals(4, source.strStr("mississippi", "issip"));
        Assert.assertEquals(-1, source.strStr("mississippi", "a"));
    }
}
