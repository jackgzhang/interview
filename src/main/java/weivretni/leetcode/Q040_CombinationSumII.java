package weivretni.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <pre>
 * Given a collection of candidate numbers (C) and a target number (T), find all unique combinations in C 
 * 
 * where the candidate numbers sums to T.
 * 
 * Each number in C may only be used once in the combination.
 * 
 * Note:
 * All numbers (including target) will be positive integers.
 * Elements in a combination (a1, a2, … , ak) must be in non-descending order. (ie, a1 ≤ a2 ≤ … ≤ ak).
 * The solution set must not contain duplicate combinations.
 * For example, given candidate set 10,1,2,7,6,1,5 and target 8, 
 * A solution set is: 
 * [1, 7] 
 * [1, 2, 5] 
 * [2, 6] 
 * [1, 1, 6]
 * </pre>
 * 
 * @author gzhang
 *
 */
public class Q040_CombinationSumII {

    List<List<Integer>> result = new ArrayList<List<Integer>>();

    public List<List<Integer>> combinationSum2(int[] num, int target) {

        result = new ArrayList<List<Integer>>();

        if (num == null || num.length == 0 || target <= 0) {
            return result;
        } else {

            Arrays.sort(num);

            helper(num, new ArrayList<Integer>(), 0, target);

            return result;

        }
    }

    private void helper(int[] num, List<Integer> curr, int currIndex, int currTarget) {
        if (currTarget == 0) {
            result.add(new ArrayList<Integer>(curr));
        } else {
            for (int i = currIndex; i < num.length; i++) {
                if (i < num.length && num[i] <= currTarget) {
                    curr.add(num[i]);
                    helper(num, curr, i + 1, currTarget - num[i]);
                    curr.remove(curr.size() - 1);
                }

                while (i < num.length - 1 && num[i] == num[i + 1]) {
                    i++;
                }
                
            }
        }
    }
}
