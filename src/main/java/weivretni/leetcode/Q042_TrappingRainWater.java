package weivretni.leetcode;

/**
 * <pre>
 * Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it is able to trap after raining.
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
 * 
 * http://www.blogjava.net/menglee/archive/2014/01/14/408898.html
 * 
 * <pre>
 * 算法很简单，核心思想是：对某个值A[i]来说，能trapped的最多的water取决于在i之前最高的值leftMostHeight[i]和在i右边的最高的值rightMostHeight[i]。
 * （均不包含自身）。如果min(left,right) > A[i]，那么在i这个位置上能trapped的water就是min(left,right) – A[i]。
 * 有了这个想法就好办了，第一遍从左到右计算数组leftMostHeight，第二遍从右到左计算rightMostHeight，在第二遍的同时就可以计算出i位置的结果了，
 * 而且并不需要开空间来存放rightMostHeight数组。
 * 时间复杂度是O(n)，只扫了两遍。
 * 
 * </pre>
 * 
 * @author gzhang
 *
 */
public class Q042_TrappingRainWater {

    public int trap(int[] A) {

        int sum = 0;
        if (A == null || A.length <= 2) {
            return sum;
        } else {

            // 1st scan

            int[] leftMostHeight = new int[A.length];
            leftMostHeight[0] = 0;
            int maxLeftHeight = A[0];
            for (int i = 1; i < A.length; i++) {
                leftMostHeight[i] = maxLeftHeight;
                if (A[i] > maxLeftHeight) {
                    maxLeftHeight = A[i];
                }
            }

            // 2nd scan
            int maxRightHeight = A[A.length - 1];
            for (int i = A.length - 2; i >= 0; i--) {
                
                if (Math.min(maxRightHeight, leftMostHeight[i]) > A[i]) {
                    sum += Math.min(maxRightHeight, leftMostHeight[i]) - A[i];
                }
                
                if (A[i] > maxRightHeight) {
                    maxRightHeight = A[i];
                }
            }

            return sum;
        }
    }
}
