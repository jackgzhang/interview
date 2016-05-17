package weivretni.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <pre>
 * Given a set of candidate numbers (C) and a target number (T), find all unique combinations in C where the candidate numbers sums to T.
 * 
 * The same repeated number may be chosen from C unlimited number of times.
 * 
 * Note:
 * All numbers (including target) will be positive integers.
 * Elements in a combination (a1, a2, … , ak) must be in non-descending order. (ie, a1 ≤ a2 ≤ … ≤ ak).
 * The solution set must not contain duplicate combinations.
 * For example, given candidate set 2,3,6,7 and target 7, 
 * A solution set is: 
 * [7] 
 * [2, 2, 3]
 * </pre>
 * 
 * @param num
 * @param target
 * @return
 */
public class Q039_CombinationSum {

    List<List<Integer>> result = new ArrayList<List<Integer>>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        result = new ArrayList<List<Integer>>();

        if (candidates == null || candidates.length == 0 || target <= 0) {
            return result;
        } else {
            Arrays.sort(candidates);

            helper(candidates, new ArrayList<Integer>(), 0, target);

            return result;
        }
    }

    private void helper(int[] candidates, List<Integer> current, int currIndex, int target) {
        if (target == 0) {
            result.add(new ArrayList<Integer>(current));
        } else {
            for (int i = currIndex; i < candidates.length; i++) {

                // Skip duplicates
                if (i > 0 && candidates[i] == candidates[i - 1]) {
                    continue;
                }

                if (candidates[i] <= target) {
                    current.add(candidates[i]);
                    helper(candidates, current, i, target - candidates[i]);
                    current.remove(current.size() - 1);
                }
            }
        }
    }
}
