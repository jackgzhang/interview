package weivretni.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <pre>
 * Given a set of candidate numbers (C) and a target number (T), find all unique combinations in C 
 * 
 * where the candidate numbers sums to T.
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
 * <pre>
 * http://www.binglu.me/combination-sum-i-and-ii-leetcode-question/
 * 
 * https://www.youtube.com/watch?v=eXaaYoTKBlE
 * 
 * 
 * 典型 的 深度优先 搜索
 * 
 *                                  2
 *                                  
 *                   2          3       6         7
 *                           
 *               2 3 6 7    2 3 6 7  2 3 6 7    2 3 6 7
 *               
 *             。。。。。。。。。。。。。。。。。。。。。。。。。。。。
 * </pre>
 * 
 * @author gzhang
 * 
 */
public class Q021_CombinationSum {

    private List<List<Integer>> result;

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        result = new ArrayList<List<Integer>>();

        if (candidates.length > 0) {
            // Sort
            Arrays.sort(candidates);
            
            // Remove duplicates
            List<Integer> uniqueValues = new ArrayList<Integer>();
            for (int number : candidates) {
                if (uniqueValues.size() == 0 || uniqueValues.get(uniqueValues.size() - 1) != number) {
                    uniqueValues.add(number);
                }
            }
            
            // do math
            helper(uniqueValues, new ArrayList<Integer>(), target);
        }

        return result;
    }

    private void helper(List<Integer> candidates, List<Integer> currPath, int currTarget) {
        if (currTarget == 0) {
            result.add(new ArrayList(currPath));
        } else {
            for (int number : candidates) {
                if (number <= currTarget) {

                    if (currPath.size() == 0 || (currPath.size() > 0 && number >= currPath.get(currPath.size() - 1))) {
                        currPath.add(number);
                        helper(candidates, currPath, currTarget - number);
                        currPath.remove(currPath.size() - 1);
                    }
                }
            }
        }
    }

}
