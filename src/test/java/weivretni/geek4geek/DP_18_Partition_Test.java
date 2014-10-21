package weivretni.geek4geek;

import org.junit.Assert;
import org.junit.Test;

public class DP_18_Partition_Test {

    private DP_18_Partition source = new DP_18_Partition();

    @Test
    public void test() {
        Assert.assertSame(true, source.doIt(new int[] { 3, 1, 5, 9, 12 }));
        Assert.assertSame(false, source.doIt(new int[] { 3, 1, 6 }));
    }
}
