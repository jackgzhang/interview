package weivretni.leetcode;

import junit.framework.Assert;
import org.junit.Test;
import weivretni.BaseTest;

public class PeakElement_Test extends BaseTest {
    private PeakElement source = new PeakElement();

    @Test
    public void test() {
        Assert.assertEquals(7, source.findPeakElement(new int[]{1,1,1,2,1,3,4,5,1}));
        Assert.assertEquals(3, source.findPeakElement(new int[]{1,1,1,2,1}));
        Assert.assertEquals(1, source.findPeakElement(new int[]{1,2}));
        Assert.assertEquals(3, source.findPeakElement(new int[]{1,2,3,4,}));
        Assert.assertEquals(4, source.findPeakElement(new int[]{1,2,3,4,5}));
    }
}
