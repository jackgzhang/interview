package weivretni.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <pre>
 * Given a collection of integers that might contain duplicates, S, return all possible subsets.
 * 
 * Note:
 * Elements in a subset must be in non-descending order.
 * The solution set must not contain duplicate subsets.
 * For example,
 * If S = [1,2,2], a solution is:
 * 
 * [
 *   [2],
 *   [1],
 *   [1,2,2],
 *   [2,2],
 *   [1,2],
 *   []
 * ]
 * </pre>
 * 
 * <pre>
 * 
 * http://www.cnblogs.com/felixfang/p/3775712.html
 * 
 * 我们以S=[1,2,2]为例:
 * 
 *   [1]    [1,2]   [1,2,2]   假如是  [1,2,3]
 *      
 *   []     []      []                  []
 *   [1]    [1]     [1]                 [1]    
 *          [2]     [2]                 [2]
 *          [1,2]   [1,2]               [1,2]
 *                  ----                ----
 *                  [2,2]               [1,3]
 *                  [1,2,2]             [2,3]
 *                                      [1,2,3]
 * 
 * 可以发现从S=[1,2]变化到S=[1,2,2]时，多出来的有两个子集[2,2]和[1,2,2]
 * 
 * ，这两个子集，其实就是 [2], [1,2]末尾都加上2 而产生。而[2], [1,2] 
 * 
 * 这两个子集实际上是 S=[1,2]的解到 S=[1]的解 新添加的部分。
 * 
 * 因此，若S中有重复元素，可以先排序；遍历过程中如果发现当前元素S[i] 和 S[i-1] 相同，
 * 
 * 那么不同于原有思路中“将当前res中所有自己拷贝一份再在末尾添加S[i]”的做法，
 * 
 * 我们只将res中上一次添加进来的子集拷贝一份，末尾添加S[i]。
 * </pre>
 * 
 * @author gzhang
 *
 */
public class Q090_Subsets2 {

    private List<List<Integer>> preNewItems;

    public List<List<Integer>> subsetsWithDup(int[] num) {
        preNewItems = new ArrayList<List<Integer>>();
        Arrays.sort(num);
        return helper(num);
    }

    private List<List<Integer>> helper(int[] s) {

        List<List<Integer>> result = new ArrayList<List<Integer>>();

        if (s.length == 0) {
            result.add(new ArrayList<Integer>());
            preNewItems.clear();
            return result;
        } else {
            preNewItems.clear();

            // preNewItems will be populated after this call
            List<List<Integer>> tmpResult = helper(Arrays.copyOf(s, s.length - 1));

            // Now handle new elements
            List<List<Integer>> newPreNewItems = new ArrayList<List<Integer>>();
            
            
            if (s.length > 1 && s[s.length - 1] == s[s.length - 2]) {
                for (List<Integer> atmpResult : preNewItems) {
                    result.add(new ArrayList<Integer>(atmpResult));
                    atmpResult.add(s[s.length - 1]);
                    result.add(new ArrayList(atmpResult));
                    newPreNewItems.add(new ArrayList(atmpResult));
                }
            } else {
                for (List<Integer> atmpResult : tmpResult) {
                    result.add(new ArrayList<Integer>(atmpResult));
                    atmpResult.add(s[s.length - 1]);
                    result.add(new ArrayList(atmpResult));
                    newPreNewItems.add(new ArrayList(atmpResult));
                }
            }
            
            preNewItems.clear();
            preNewItems.addAll(newPreNewItems);

            return result;
        }

    }
}
