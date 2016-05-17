package weivretni.leetcode;

import junit.framework.Assert;
import org.junit.Test;

public class Q058_LengthOfLastWord_Test {

    private Q058_LengthOfLastWord source = new Q058_LengthOfLastWord();

    @Test
    public void test() {
        Assert.assertEquals(1, source.lengthOfLastWord("b   a    "));
        Assert.assertEquals(0, source.lengthOfLastWord(" "));
        Assert.assertEquals(0, source.lengthOfLastWord(""));
        Assert.assertEquals(1, source.lengthOfLastWord("s"));
    }
}
