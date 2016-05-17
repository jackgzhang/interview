package weivretni.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 * Given two integers n and k, return all possiblilties of pick k numbers out of 1 ... n.
 * 
 * For example,
 * If n = 4 and k = 2, a solution is:
 * 
 * [
 *   [2,4],
 *   [3,4],
 *   [2,3],
 *   [1,2],
 *   [1,3],
 *   [1,4],
 * ]
 * </pre>
 * 
 * 典型的DFS算法
 * 
 * http://blog.csdn.net/u010500263/article/details/18435495
 * 
 * <pre>
 * 
 * 注意到后排的数字大于前面的
 * 
 *                1
 *          2     3     4
 *        3  4    4
 * </pre>
 * 
 * @author gzhang
 * 
 */
public class Q077_Combinations {

    List<List<Integer>> result = new ArrayList<List<Integer>>();

    public List<List<Integer>> combine(int n, int k) {
        result = new ArrayList<List<Integer>>();
        helper(1, n, k, new ArrayList<Integer>());
        return result;
    }

    private void helper(int index, int n, int k, List<Integer> currPath) {
        if (currPath.size() == k) {
            result.add(new ArrayList<Integer>(currPath));
        } else {
            for (int i = index; i <= n; i++) {
                currPath.add(i);
                helper(i + 1, n, k, currPath);
                currPath.remove(currPath.size() - 1);
            }
        }
    }

}
