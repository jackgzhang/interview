package weivretni.leetcode;

import org.junit.Test;

public class Q088_MergeSortedArray_Test {

    @Test
    public void test() {
        Q088_MergeSortedArray source = new Q088_MergeSortedArray();

        int[] A = new int[] { 1, 2, 3, 0, 0, 0 };
        int[] B = new int[] { 2, 5, 6 };
        // source.merge(A, 3, B, 3);

        source.merge(new int[] { 0 }, 0, new int[] { 1 }, 1);

    }
}
