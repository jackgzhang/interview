package weivretni.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class Q080_RemoveDuplicatesfromSortedArrayII_Test {

    @Test
    public void test() {
        Q080_RemoveDuplicatesfromSortedArrayII source = new Q080_RemoveDuplicatesfromSortedArrayII();
        Assert.assertEquals(4, source.removeDuplicates(new int[] { 1, 1, 1, 1, 2, 2 }));
        Assert.assertEquals(2, source.removeDuplicates(new int[] { 1, 2 }));
        Assert.assertEquals(4, source.removeDuplicates(new int[] { 1, 1, 2, 2 }));
        Assert.assertEquals(2, source.removeDuplicates(new int[] { 1, 1 }));

        // Assert.assertEquals(4, source.removeDuplicates(new int[] { 1, 1, 2, 3 }));
        // Assert.assertEquals(4, source.removeDuplicates(new int[] { 1, 2, 2, 3 }));
        Assert.assertEquals(6, source.removeDuplicates(new int[] { 1, 2, 2, 2, 3, 3, 4 }));
    }
}
