package weivretni.leetcode;

/**
 * <pre>
 * Given n non-negative integers representing an elevation map where the width of each bar is 1,
 * compute how much water it is able to trap after raining.
 *
 * For example,
 * Given [0,1,0,2,1,0,1,3,2,1,2,1], return 6.
 *
 * <img src="rainwatertrap.png"/>
 *
 * The above elevation map is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case,
 *
 * 6 units of rain water (blue section) are being trapped. Thanks Marcos for contributing this image!
 * </pre>
 * <p>
 * http://www.blogjava.net/menglee/archive/2014/01/14/408898.html
 * <p>
 * <pre>
 * 算法很简单，核心思想是：对某个值A[i]来说，能trapped的最多的water取决于
 * 在i之前最高的值leftMostHeight[i]和在i右边的最高的值rightMostHeight[i]。(均不包含自身）。
 * 如果min(left,right) > A[i]，那么在i这个位置上能trapped的water就是min(left,right) – A[i]。
 *
 * 有了这个想法就好办了，第一遍从左到右计算数组leftMostHeight，
 * 第二遍从右到左计算rightMostHeight，在第二遍的同时就可以计算出i位置的结果了，
 * 而且并不需要开空间来存放rightMostHeight数组。
 * 时间复杂度是O(n)，只扫了两遍。
 *
 * </pre>
 *
 * @author gzhang
 */
public class Q042_TrappingRainWater {

    public int trap(int[] A) {
        int[] left = new int[A.length];
        int[] right = new int[A.length];

        // --->
        int leftMaxSoFar = 0;
        for (int i = 0; i < A.length; i++) {
            left[i] = leftMaxSoFar;
            if (A[i] > leftMaxSoFar) leftMaxSoFar = A[i];
        }

        // <--
        int rightMaxSoFar = 0;
        for (int i = A.length - 1; i >= 0; i--) {
            right[i] = rightMaxSoFar;
            if (A[i] > rightMaxSoFar) rightMaxSoFar = A[i];
        }

        // Now calc
        int result = 0;
        for (int i = 0; i < A.length; i++) {
            int min = Math.min(left[i], right[i]);

            if (min > A[i]) {
                result += (min - A[i]);
            }
        }

        return result;
    }
}
