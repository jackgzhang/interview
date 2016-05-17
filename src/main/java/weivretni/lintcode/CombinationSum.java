package weivretni.lintcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
