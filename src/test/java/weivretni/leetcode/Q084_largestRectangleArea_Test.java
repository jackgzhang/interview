package weivretni.leetcode;

import junit.framework.Assert;
import org.junit.Test;
import weivretni.BaseTest;

/**
 * Created by gzhang on 5/18/16.
 */
public class Q084_largestRectangleArea_Test extends BaseTest {

    private Q084_largestRectangleArea source = new Q084_largestRectangleArea();

    @Test
    public void test() {
        Assert.assertEquals(10, source.largestRectangleArea(new int[] { 2, 1, 5, 6, 2, 3 }));
        Assert.assertEquals(2, source.largestRectangleArea(new int[] { 2 }));
        Assert.assertEquals(10, source.largestRectangleArea(new int[] { 2, 1, 5, 6, 5, 3 }));


    }
}
