package weivretni.leetcode;

import junit.framework.Assert;
import org.junit.Test;

public class MajorityElement_Test {
    private MajorityElement source = new MajorityElement();

    @Test
    public void test() {
        Assert.assertEquals(1, source.majorityElement(new int[]{1,1,1,1,1,3,1,5,1}));
        Assert.assertEquals(2, source.majorityElement(new int[]{1,2,2}));

    }
}
