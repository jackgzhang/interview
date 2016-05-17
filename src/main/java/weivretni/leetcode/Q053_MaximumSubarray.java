package weivretni.leetcode;

/**
 * Find the contiguous subarray within an array (containing at least one number) which has the
 * largest sum.
 *
 * For example, given the array [−2,1,−3,4,−1,2,1,−5,4], the contiguous subarray
 *
 * [4,−1,2,1] has the largest sum = 6.
 *
 *
 * <pre>
 *  http://fisherlei.blogspot.com/2012/12/leetcode-maximum-subarray.html
 *
 *
 *
 * 解法一
 *
 * [解题思路]
 * O(n)就是一维DP.
 * 假设A(0, i)区间存在k，使得[k, i]区间是以i结尾区间的最大值， 定义为Max[i], 在这里，当求取Max[i+1]时，
 * Max[i+1] = Max[i] + A[i+1],  if (Max[i] + A[i+1] >0)
 *                 = 0, if(Max[i]+A[i+1] <0)，如果和小于零，A[i+1]必为负数，没必要保留，舍弃掉
 * 然后从左往右扫描，求取Max数字的最大值即为所求。
 *
 *
 *
 * 解法二
 *
 * 假设数组A[left, right]存在最大值区间[i, j](i>=left & j<=right)，以mid = (left + right)/2 分界，无非以下三种情况：
 *
 * subarray A[i,..j] is either
 * (1) Entirely in A[low,mid-1]
 * (2) Entirely in A[mid+1,high]
 * (3) Across mid
 * 对于(1) and (2)，直接递归求解即可，对于(3)，则需要以min为中心，向左及向右扫描求最大值，
 * 意味着在A[left, Mid]区间中找出A[i..mid], 而在A[mid+1, right]中找出A[mid+1..j]，两者加和即为(3)的解。
 *
 * </pre>
 *
 */
public class Q053_MaximumSubarray {

    public int maxSubArray(int[] A) {
        if (A.length >= 0) {
            int max = A[0];
            int maxEndingHere = A[0];


            for (int i =1; i< A.length ;i++) {
                maxEndingHere = Math.max(A[i], maxEndingHere + A[i]);
                max = Math.max(maxEndingHere, max);
            }

            return max;


        }else{
            return Integer.MIN_VALUE;
        }
    }

}
