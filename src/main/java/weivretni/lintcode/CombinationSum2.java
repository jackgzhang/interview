package weivretni.lintcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum2 {

    private List<List<Integer>> result = null;

    /**
     * @param num: Given the candidate numbers
     * @param target: Given the target number
     * @return: All the combinations that sum to target
     */
    public List<List<Integer>> combinationSum2(int[] num, int target) {
        result = new ArrayList<List<Integer>>();
        Arrays.sort(num);
        
        
        helper(num, 0, target, new ArrayList<Integer>());
        return result;
    }

    private void helper(int[] candidates, int index, int target, List<Integer> currList) {
        if (target == 0) {
            result.add(new ArrayList<Integer>(currList));
        } else {
            for (int i = index; i < candidates.length; i++) {
                if (target >= candidates[i]) {
                    currList.add(candidates[i]);
                    
                    
                    // Find the next non-dup value
                    while (candidates[i+1] == candidates[i]) {
                        i++;
                    }
                    
                    helper(candidates, i + 1, target - candidates[i], currList);
                    currList.remove(currList.size() - 1);
                }
            }
        }
    }
}
