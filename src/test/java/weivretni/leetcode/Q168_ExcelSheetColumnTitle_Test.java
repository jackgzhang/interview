package weivretni.leetcode;

import junit.framework.Assert;
import org.junit.Test;

public class Q168_ExcelSheetColumnTitle_Test {

    @Test
    public void test() {
        Q168_ExcelSheetColumnTitle source = new Q168_ExcelSheetColumnTitle();
        Assert.assertEquals("AZ", source.convertToTitle(52));
        Assert.assertEquals("AB", source.convertToTitle(28));
        Assert.assertEquals("A", source.convertToTitle(1));
        Assert.assertEquals("B", source.convertToTitle(2));

    }
}
