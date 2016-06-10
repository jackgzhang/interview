package weivretni.leetcode;

/**
 * Find the contiguous subarray within an array (containing at least one number) which has the
 * largest sum.
 * <p>
 * For example, given the array [−2,1,−3,4,−1,2,1,−5,4], the contiguous subarray
 * <p>
 * [4,−1,2,1] has the largest sum = 6.
 * <p>
 * <pre>
 *
 * http://fisherlei.blogspot.com/2012/12/leetcode-maximum-subarray.html
 *
 *
 * [解题思路]
 * O(n)就是一维DP.
 *
 * 假设A(0, i)区间存在k，使得[k, i-1]区间是以i结尾区间的最大值， 定义为Max[i-1],
 *
 * Max[i] =  (Max[i-1] > 0 ) -->  Max[i-1] + A[i],   // Max[i-1] 对当前最大值有贡献
 *        =  (Max[i-1] <=0 ) -->  A[i]  // Max[i-1] 对当前最大值没有贡献, 重新开始
 *
 *
 * 然后在遍历中用一个变量记录最大值即可
 *
 * </pre>
 */
public class Q053_MaximumSubarray {

    public int maxSubArray(int[] A) {
        int preMax = A[0];
        int result = A[0];

        for (int i = 1; i < A.length; i++) {
            preMax = preMax < 0 ? A[i] : preMax + A[i];
            result = Math.max(result, preMax);
        }

        return result;
    }

}
