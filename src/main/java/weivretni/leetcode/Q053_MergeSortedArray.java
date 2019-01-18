package weivretni.leetcode;

/**
 * Merge Sorted Array
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
 *
 * Note:
 * You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional
 * elements from nums2. The number of elements initialized in nums1 and nums2 are m and n respectively.
 */
public class Q053_MergeSortedArray {

    public int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int k = n + m -1;
        int i = m - 1;
        int j = n - 1;

        while (k >= 0) {

            int value1 = i>=0? nums1[i] : Integer.MIN_VALUE;
            int value2 = j>=0? nums2[j] : Integer.MIN_VALUE;

            if (value1 > value2) {
                nums1[k] = nums1[i];
                i--;
                k--;
            }else{
                nums1[k] = nums2[j];
                j--;
                k--;
            }
        }

        return nums1;
    }
}
