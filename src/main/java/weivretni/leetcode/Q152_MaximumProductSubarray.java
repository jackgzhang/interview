package weivretni.leetcode;

/**
 * Maximum Product Subarray
 * Find the contiguous subarray within an array (containing at least one number) which has the largest product.
 *
 * For example, given the array [2,3,-2,4],
 * the contiguous subarray [2,3] has the largest product = 6.
 *
 * 参考：LeetCode 152 Maximum Product Subarray
 *
 * LeetCode第53题Maximum Subarray是求连续和最大的子数组，本题是求连续乘积最大的子数组。
 *
 * 在解法上是一样的，只是在求和时，是负就舍弃。但是在乘积中，因为负数*负数=正数，所以连续乘积为负数时，并不能舍弃这个数，因为如果数组的元素是负数，它可能成为乘积最大的数。
 *
 * 所以LeetCode第53题Maximum Subarray，只需要定义一个变量，用来记录和；本题要定义两个变量：
 * positive和negative，分别记录当前乘积最大值和最小值。
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
