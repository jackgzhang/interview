package weivretni.leetcode;

import junit.framework.Assert;
import org.junit.Test;
import weivretni.BaseTest;

import java.util.Arrays;

public class MajorityElement2_Test extends BaseTest {
    private MajorityElement2 source = new MajorityElement2();

    @Test
    public void test() {
        assertEquals(Arrays.asList(2,3), source.majorityElement(new int[]{1,2,1,2,2,3,3,3}));
        assertEquals(Arrays.asList(1,3), source.majorityElement(new int[]{1,1,1,1,3,3,3,1,5,3}));
    }
}
