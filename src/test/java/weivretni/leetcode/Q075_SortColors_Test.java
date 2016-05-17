package weivretni.leetcode;

import org.junit.Assert;
import org.junit.Test;

public class Q075_SortColors_Test {

    @Test
    public void test() {
        Q075_SortColors source = new Q075_SortColors();
        Assert.assertArrayEquals(new int[] { 0, 0, 1, 1, 1, 2, 2, 2 }, source.sortColors(new int[] { 1, 1, 2, 1, 0, 2, 0, 2 }));
        Assert.assertArrayEquals(new int[] { 0, 1, 2 }, source.sortColors(new int[] { 1, 0, 2 }));
        Assert.assertArrayEquals(new int[] { 0, 1 }, source.sortColors(new int[] { 1, 0 }));
        Assert.assertArrayEquals(new int[] { 1, 2 }, source.sortColors(new int[] { 2, 1 }));
        Assert.assertArrayEquals(new int[] { 2, 2 }, source.sortColors(new int[] { 2, 2 }));
        Assert.assertArrayEquals(new int[] { 0, 1, 2 }, source.sortColors(new int[] { 2, 1, 0 }));
        Assert.assertArrayEquals(new int[] { 0, 1, 1, 2, 2 }, source.sortColors(new int[] { 2, 1, 1, 2, 0 }));
        Assert.assertArrayEquals(new int[] { 0, 0, 1, 1, 2, 2 }, source.sortColors(new int[] { 0, 2, 1, 1, 2, 0 }));
    }
}
