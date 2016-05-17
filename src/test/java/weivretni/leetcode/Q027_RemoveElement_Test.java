package weivretni.leetcode;

import junit.framework.Assert;
import org.junit.Test;

public class Q027_RemoveElement_Test {

    @Test
    public void test() {
        Q027_RemoveElement source = new Q027_RemoveElement();
        Assert.assertEquals(0, source.removeElement(new int[] { 1 }, 1));
        Assert.assertEquals(3, source.removeElement(new int[] { 1, 2, 2, 5, 2, 4 }, 2));

    }
}
