package weivretni.lintcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given a set of candidate numbers (C) and a target number (T), find all unique combinations in C where
 * the candidate numbers sums to T.
 *
 * The same repeated number may be chosen from C unlimited number of times.
 *
 * Note:
 *
 * All numbers (including target) will be positive integers.
 * Elements in a combination (a1, a2, … , ak) must be in non-descending order. (ie, a1 ≤ a2 ≤ … ≤ ak).
 * The solution set must not contain duplicate combinations.
 * For example, given candidate set 2,3,6,7 and target 7,
 * A solution set is:
 * [7]
 * [2, 2, 3]
 */
public class CombinationSum {

    private List<List<Integer>> result = null;

    /**
     * @param candidates: A list of integers
     * @param target:An integer
     * @return: A list of lists of integers
     */
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        result = new ArrayList<List<Integer>>();
        Arrays.sort(candidates);
        helper(candidates, 0, target, new ArrayList<Integer>());
        return result;
    }

    private void helper(int[] candidates, int index, int target, List<Integer> currList) {
        if (target == 0) {
            result.add(new ArrayList<Integer>(currList));
        } else {
            for (int i = index; i < candidates.length; i++) {
                if (target >= candidates[i]) {
                    currList.add(candidates[i]);
                    helper(candidates, i, target - candidates[i], currList);
                    currList.remove(currList.size() - 1);
                }
            }
        }
    }

}
