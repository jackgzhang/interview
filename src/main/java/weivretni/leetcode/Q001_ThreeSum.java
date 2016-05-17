package weivretni.leetcode;

import java.util.ArrayList;

/**
 * <pre>
 *  Given an array S of n integers, are there elements a, b, c in S
 *  such that a + b + c = 0?
 *
 *
 *  Find all unique triplets in the array which
 *  gives the sum of zero.
 *  
 *  Note:
 *  Elements in a triplet (a,b,c) must be in non-descending order. (ie, a <=b <= c)
 *  The solution set must not contain duplicate triplets.
 *     
 *  For example, given array S = {-1 0 1 2 -1 -4},
 *  
 *      A solution set is:
 *      (-1, 0, 1)
 *      (-1, -1, 2)
 *
 *  解法如下
 * </pre>
 * 
 * @author gzhang
 * 
 */

public class Q001_ThreeSum {

    public ArrayList<ArrayList<Integer>> threeSum(int[] num) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();

        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                for (int k = j + 1; k < num.length; k++) {
                    if (num[i] + num[j] + num[k] == 0) {

                        ArrayList<Integer> tuple = new ArrayList<Integer>();
                        tuple.add(num[i]);
                        tuple.add(num[j]);
                        tuple.add(num[k]);

                        result.add(tuple);
                    }
                }
            }
        }

        return result;
    }
}
