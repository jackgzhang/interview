package weivretni.leetcode;

import junit.framework.Assert;
import org.junit.Test;

public class Q016_ThreeSumClosest_Test {

    private Q016_ThreeSumClosest source = new Q016_ThreeSumClosest();

    @Test
    public void test() {
        Assert.assertSame(2, source.threeSumClosest(new int[] { -1, 2, 1, -4 }, 1));
        Assert.assertSame(3, source.threeSumClosest(new int[] { 1, 1, 1, 1 }, 3));
        Assert.assertSame(3, source.threeSumClosest(new int[] { 0, 1, 2 }, 3));
    }
}
