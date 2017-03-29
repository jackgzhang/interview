package weivretni.leetcode;

import java.util.Arrays;

/**
 * Given an array S of n integers, find three integers in S such that the sum is closest to a given
 * number, target. Return the sum of the three integers. You may assume that each input would have
 * exactly one solution.
 * <p>
 * For example, given array S = {-1 2 1 -4}, and target = 1.
 * -4,-1,1,2
 * The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
 *
 * @author gzhang
 */
public class Q016_ThreeSumClosest {

    public int threeSumClosest(int[] num, int target) {
        Arrays.sort(num);

        int result = Integer.MAX_VALUE;

        for (int i = 0; i < num.length; i++) {
            int j = i + 1;
            int k = num.length - 1 ;
            while (j < k) {
                int currdiff = Math.abs(num[i] + num[j] + num[k] - target);
                int prediff = Math.abs(result - target);
                if ( currdiff < prediff  || currdiff == 0) {
                    result = num[i] + num[j] + num[k];
                }

                if ((num[i] + num[j] + num[k] - target) < 0) {
                    j++;
                }else{
                    k--;
                }
            }
        }

        return result;
    }

}
