package weivretni.leetcode;

/**
 * Find the contiguous subarray within an array (containing at least one number)
 * <p>
 * which has the largest product.
 * <p>
 * For example, given the array [2,3,-2,4], the contiguous subarray [2,3] has the
 * <p>
 * largest product = 6.
 * <p>
 * <pre>
 *
 * DP 会超时
 * http://shepherdyuan.wordpress.com/2014/07/23/linkedin-maximum-sumproduct-subarray/
 * 跟Gas Station的想法几乎一模一样
 *
 *
 * http://bookshadow.com/weblog/2014/10/15/leetcode-maximum-product-subarray/
 * 简单动态规划：
 *
 * 用数组positive_max[i]维护原始数组前i个数的子数组乘积中正数的最大值
 * 用数组negative_min[i]维护原始数组前i个数的子数组乘积中负数的最小值
 * 状态转移方程为：
 *
 * Let us denote that:
 *
 * f(k) = Largest product subarray, from index 0 up to k.
 * Similarly,
 *
 * g(k) = Smallest product subarray, from index 0 up to k.
 * Then,
 *
 * f(k) = max( f(k-1) * A[k], A[k], g(k-1) * A[k] )
 * g(k) = min( g(k-1) * A[k], A[k], f(k-1) * A[k] )
 *
 *
 * </pre>
 */
public class Q152_MaximumProductSubarray {

    public int maxProduct(int[] A) {

        int maxSoFar = A[0];
        int minSoFar = A[0];

        int max = maxSoFar;

        for (int i = 1; i < A.length; i++) {

            int maxSoFarCopy = maxSoFar;
            int minSoFarCopy = minSoFar;

            maxSoFar = Math.max(Math.max(maxSoFarCopy * A[i], A[i]), minSoFarCopy * A[i]);
            minSoFar = Math.min(Math.min(minSoFarCopy * A[i], A[i]), maxSoFarCopy * A[i]);

            max = Math.max(max, maxSoFar);
        }

        return max;
    }

}
