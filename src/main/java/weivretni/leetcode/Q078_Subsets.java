package weivretni.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <Pre>
 * Given a set of distinct integers, S, return all possible subsets.
 * 
 * Note:
 * Elements in a subset must be in non-descending order.
 * The solution set must not contain duplicate subsets.
 * For example,
 * If S = [1,2,3], a solution is:
 * 
 * [
 *   [3],
 *   [1],
 *   [2],
 *   [1,2,3],
 *   [1,3],
 *   [2,3],
 *   [1,2],
 *   []
 * ]
 * </pre>
 * 
 * http://www.cnblogs.com/felixfang/p/3775712.html
 * 
 * @author gzhang
 *
 */
public class Q078_Subsets {

    public List<List<Integer>> subsets(int[] S) {
        Arrays.sort(S);
        return helper(S);
    }

    private List<List<Integer>> helper(int[] s) {

        List<List<Integer>> result = new ArrayList<List<Integer>>();

        if (s == null || s.length == 0) {
            result.add(new ArrayList());
            return result;
        } else {
            List<List<Integer>> tmpResult = helper(Arrays.copyOf(s, s.length - 1));

            for (List<Integer> atmpResult : tmpResult) {
                result.add(new ArrayList(atmpResult));
                atmpResult.add(s[s.length - 1]);
                result.add(new ArrayList(atmpResult));
            }

            return result;
        }
    }
}
