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
 */
public class Q039_CombinationSum {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> result = new ArrayList<>();

        if (candidates == null || candidates.length == 0 || target <= 0) {
            return result;
        } else {
            Arrays.sort(candidates);

            dfs(candidates, new ArrayList<>(), result, 0, target);
            return result;
        }
    }

    private void dfs(int[] candidates, List<Integer> current, List<List<Integer>> result, int currIndex, int target) {
        if (target == 0) {
            result.add(new ArrayList<>(current));
        } else {
            for (int i = currIndex; i < candidates.length; i++) {

                if (candidates[i] <= target) {
                    current.add(candidates[i]);
                    dfs(candidates, current, result , i, target - candidates[i]);
                    current.remove(current.size() - 1);
                }
            }
        }
    }
}
