package weivretni.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class Q026_RemoveDuplicatesfromSortedArray_Test {

    @Test
    public void test() {
        Q026_RemoveDuplicatesfromSortedArray source = new Q026_RemoveDuplicatesfromSortedArray();

        // source.connect(this.buildLinkedTree(new String[] { "1" }));
        Assert.assertEquals(4, source.removeDuplicates(new int[] { 1, 2, 2, 3, 3, 3, 4 }));
        Assert.assertEquals(1, source.removeDuplicates(new int[] { 1 }));
        Assert.assertEquals(3, source.removeDuplicates(new int[] { 1, 2, 2, 3 }));
    }
}
