package weivretni.lintcode;

import org.junit.Assert;
import org.junit.Test;

public class CompareString_Test {

    @Test
    public void test() {
        CompareStrings source = new CompareStrings();

        Assert.assertFalse(source.compareStrings("ABCDEFG", "ACC"));
        Assert.assertTrue(source.compareStrings("ABC", "A"));
        Assert.assertFalse(source.compareStrings("", "A"));
        Assert.assertTrue(source.compareStrings("A", ""));

    }
}
