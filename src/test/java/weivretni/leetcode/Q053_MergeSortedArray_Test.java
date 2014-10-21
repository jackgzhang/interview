package weivretni.leetcode;

import org.junit.Test;

import weivretni.BaseTest;

public class Q053_MergeSortedArray_Test extends BaseTest {

    private Q053_MergeSortedArray source = new Q053_MergeSortedArray();

    @Test
    public void test() {
        this.assertEquals(new int[] { 1, 2, 3, 4, 5, 6 }, source.merge(new int[] { 3, 4, 5 }, new int[] { 1, 2, 6 }));
        this.assertEquals(new int[] { 1, 2, 3, 4, 5, 6 }, source.merge(new int[] { 1, 4, 5 }, new int[] { 2, 3, 6 }));
        this.assertEquals(new int[] { 1, 2, 3, 4, 5, 6, 7, 8 }, source.merge(new int[] { 1, 4, 5 }, new int[] { 2, 3, 6, 7, 8 }));
    }
}
