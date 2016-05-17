package weivretni.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 * Given numRows, generate the first numRows of Pascal's triangle.
 * 
 * For example, given numRows = 6,
 * Return
 * 
 * [
 *      [1],
 *     [1,1],
 *    [1,2,1],
 *   [1,3,3,1],
 *  [1,4,6,4,1],
 * [1,5,10,10,5,1]
 * ]
 * </pre>
 * 
 * 
 */
public class Q118_PascalsTriangle {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();

        if (numRows == 0) {
            return ans;
        } else {
            // init
            List<Integer> first = new ArrayList<Integer>();
            first.add(1);
            ans.add(first);
            for (int i = 1; i < numRows; i++) {
                List<Integer> row = new ArrayList<Integer>();
                row.add(1); // first element

                // Get the previous row
                List<Integer> pre = ans.get(i - 1);
                for (int j = 1; j <= i - 1; j++) {
                    row.add(pre.get(j - 1) + pre.get(j));
                }

                row.add(1); // last element;
                ans.add(row);
            }

            return ans;
        }
    }
}
