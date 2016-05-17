package weivretni.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <pre>
 * Given a collection of numbers that might contain duplicates, return all possible unique permutations.
 * 
 * For example,
 * [1,1,2] have the following unique permutations:
 * [1,1,2], [1,2,1], and [2,1,1].
 * </pre>
 * 
 * @author gzhang
 * 
 */
public class Q047_PermutationsII {

    private List<List<Integer>> result = null;

    public List<List<Integer>> permuteUnique(int[] num) {

        result = new ArrayList<List<Integer>>();

        if (num == null || num.length == 0) {
            return result;
        } else {
            Arrays.sort(num);
            helper(num, new ArrayList<Integer>());
            return result;
        }

    }

    private void helper(int[] num, List<Integer> currList) {
        if (num.length == 0) {
            result.add(new ArrayList<Integer>(currList));
        } else {
            for (int i = 0; i < num.length; i++) {
                if (i == 0 || num[i] != num[i - 1]) {
                    currList.add(num[i]);
                    helper(remove(num, i), currList);
                    currList.remove(currList.size() - 1);
                }
            }
        }
    }

    private int[] remove(int[] num, int index) {
        int[] tmp = new int[num.length - 1];
        int currIndex = 0;
        for (int i = 0; i < num.length; i++) {
            if (i != index) {
                tmp[currIndex++] = num[i];
            }
        }
        return tmp;
    }
}
