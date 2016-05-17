package weivretni.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 * Given a collection of numbers, return all possible permutations.
 * 
 * For example,
 * [1,2,3] have the following permutations:
 * [1,2,3], [1,3,2], [2,1,3], [2,3,1], [3,1,2], and [3,2,1].
 * </pre>
 * 
 * http://blog.csdn.net/u010500263/article/details/18178243
 * 
 */
public class Q046_Permutations {

    private List<List<Integer>> result = new ArrayList<List<Integer>>();

    public List<List<Integer>> permute(int[] num) {

        if (num == null || num.length == 0) {
            return result;
        } else {
            helper(num, new ArrayList<Integer>());
            return result;
        }
    }

    private void helper(int[] num, List<Integer> currPath) {
        if (num.length == 0) {
            result.add(new ArrayList<Integer>(currPath));
        } else {

            for (int i = 0; i < num.length; i++) {
                currPath.add(num[i]);
                helper(remove(num, i), currPath);
                currPath.remove(currPath.size() - 1);
            }

        }
    }

    private int[] remove(int[] num, int index) {
        int[] result = new int[num.length - 1];

        int resultIndex = 0;
        for (int i = 0; i < num.length; i++) {
            if (i != index) {
                result[resultIndex++] = num[i];
            }
        }

        return result;
    }
}
