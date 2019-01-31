package weivretni.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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
        List<List<Integer>> result = new ArrayList<>();

        for (int s : S) {
            List<List<Integer>> result2 = new ArrayList<>();
            for (List<Integer> existing: result) {
                List<Integer> n = new ArrayList<>(existing);
                n.add(s);
                result2.add(n);
            }

            if (result2.size() > 0 ) {
                result.addAll(result2);
            }
            result.add(Collections.singletonList(s));
        }

        return result;
    }

}
