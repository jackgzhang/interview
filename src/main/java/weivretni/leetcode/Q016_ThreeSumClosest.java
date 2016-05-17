package weivretni.leetcode;

import java.util.Arrays;

/**
 * Given an array S of n integers, find three integers in S such that the sum is closest to a given
 * number, target. Return the sum of the three integers. You may assume that each input would have
 * exactly one solution.
 * 
 * For example, given array S = {-1 2 1 -4}, and target = 1.
 * 
 * The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
 * 
 * @author gzhang
 * 
 */
public class Q016_ThreeSumClosest {

    public int threeSumClosest(int[] num, int target) {
        if (num.length < 3) {
            return 0;
        } else {
            // Sort
            Arrays.sort(num);

            // Start
            int minDiff = Integer.MAX_VALUE;
            for (int i = 1; i < num.length - 1; i++) {
                int currTarget = target - num[i - 1];
                int twoSumClosest = twoSumCloset(num, i, currTarget);
                int currClosestSum = twoSumClosest + num[i - 1];
                                
                if (Math.abs(currClosestSum - target) < minDiff) {
                    minDiff = target - currClosestSum ;
                }
            }

            return target - minDiff;
        }
    }

    private int twoSumCloset(int[] num, int start, int target) {
        int diff = Integer.MAX_VALUE;
        int left = start;
        int right = num.length - 1;
        while (left < right) {
            int sum = num[left] + num[right];

            if (Math.abs(diff) > Math.abs(target - sum)) {
                diff = target - sum;
            }

            if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return target - diff;
    }
}
