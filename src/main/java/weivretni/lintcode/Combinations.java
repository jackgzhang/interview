package weivretni.lintcode;

import java.util.ArrayList;
import java.util.List;

public class Combinations {

    private List<List<Integer>> result = null;

    /**
     * @param n: Given the range of numbers
     * @param k: Given the numbers of combinations
     * @return: All the combinations of k numbers out of 1..n
     */
    public List<List<Integer>> combine(int n, int k) {
        // write your code here
        result = new ArrayList<List<Integer>>();

        helper(k, n, 1, new ArrayList<Integer>());
        return result;
    }

    private void helper(int k, int n, int currPosition, List<Integer> currList) {
        if (0 == k) {
            result.add(new ArrayList<Integer>(currList));
        } else {
            for (int i = currPosition; i <= n; i++) {
                currList.add(i);
                helper(k - 1, n, i + 1, currList);
                currList.remove(currList.size() - 1);
            }
        }
    }
}
