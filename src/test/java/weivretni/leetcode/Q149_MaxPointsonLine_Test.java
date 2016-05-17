package weivretni.leetcode;

import junit.framework.Assert;
import org.junit.Test;
import weivretni.Point;

public class Q149_MaxPointsonLine_Test {

    @Test
    public void test() {
        Q149_MaxPointsonLine source = new Q149_MaxPointsonLine();
        Assert.assertEquals(3, source.maxPoints(new Point[] { new Point(0, 0), new Point(1, 1), new Point(0, 0) }));
        Assert.assertEquals(3, source.maxPoints(new Point[] { new Point(0, 0), new Point(-1, -1), new Point(2, 2) }));
        Assert.assertEquals(2, source.maxPoints(new Point[] { new Point(0, 0), new Point(0, 0) }));
    }
}
