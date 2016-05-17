package weivretni.leetcode;

import junit.framework.Assert;
import org.junit.Test;

public class Q171_ExcelSheetColumnNumber_Test {

    @Test
    public void test() {
        Q171_ExcelSheetColumnNumber source = new Q171_ExcelSheetColumnNumber();

        Assert.assertEquals(1, source.titleToNumber("A"));
        Assert.assertEquals(28, source.titleToNumber("AB"));

    }
}
