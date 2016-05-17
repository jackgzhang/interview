package weivretni.leetcode;

/**
 * <pre>
 * Given two sorted integer arrays A and B, merge B into A as one sorted array.
 * 
 * Note:
 * You may assume that A has enough space (size that is greater or equal to m + n) to
 * 
 * hold additional elements from B. The number of elements initialized in A and B are 
 * 
 * 
 * m and n respectively.
 * </pre>
 * 
 * 从后往前填空。
 * 
 * @author gzhang
 * 
 */
public class Q088_MergeSortedArray {

    public void merge(int A[], int m, int B[], int n) {
        if (B == null || B.length == 0) {
            return;
        } else {
            int i = m - 1;
            int j = n - 1;
            int k = m + n - 1;

            for (; i >= 0 && j >= 0; k--) {
                if (A[i] > B[j]) {
                    A[k] = A[i];
                    i--;
                } else {
                    A[k] = B[j];
                    j--;
                }
            }

            while (j >= 0) {
                A[k] = B[j];
                k--;
                j--;
            }
        }
    }
}
