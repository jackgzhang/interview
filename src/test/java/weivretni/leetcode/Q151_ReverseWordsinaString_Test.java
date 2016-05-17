package weivretni.leetcode;

import junit.framework.Assert;
import org.junit.Test;

public class Q151_ReverseWordsinaString_Test {

    @Test
    public void test() {
        Q151_ReverseWordsinaString source = new Q151_ReverseWordsinaString();

        String longString = "";
        for (int i = 0; i < 50000; i++) {
            longString += " " + "ab";
        }

        long s0 = System.currentTimeMillis();
        Assert.assertEquals("he start the", source.reverseWords("the start he"));
        Assert.assertEquals("start the", source.reverseWords("the start"));
        Assert.assertEquals("start the", source.reverseWords("the    start"));
        Assert.assertEquals("blue is sky the", source.reverseWords("  the sky is blue  "));
        source.reverseWords(longString);
        System.out.println(System.currentTimeMillis() - s0);

        s0 = System.currentTimeMillis();
        Assert.assertEquals("he start the", source.reverseWords2("the start he"));
        Assert.assertEquals("start the", source.reverseWords2("the start"));
        Assert.assertEquals("start the", source.reverseWords2("the    start"));
        Assert.assertEquals("blue is sky the", source.reverseWords2("  the sky is blue  "));
        source.reverseWords2(longString);
        System.out.println(System.currentTimeMillis() - s0);
    }
}
