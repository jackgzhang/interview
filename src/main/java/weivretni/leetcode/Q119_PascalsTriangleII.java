package weivretni.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 * Given an index k, return the kth row of the Pascal's triangle.
 * 
 * For example, given k = 3,
 * Return [1,3,3,1].
 * 
 * Note:
 * Could you optimize your algorithm to use only O(k) extra space?
 * </pre>
 * 
 * @author gzhang
 * 
 */
public class Q119_PascalsTriangleII {

    public List<Integer> getRow(int rowIndex) {

        List<Integer> result = new ArrayList<Integer>(rowIndex + 1);

        // Init
        for (int i = 0; i <= rowIndex; i++) {
            result.add(0);
        }

        result.set(0, 1);
        // now start
        for (int i = 1; i <= rowIndex; i++) {
            result.set(i, 1);
            for (int j = i - 1; j >= 1; j--) {
                result.set(j, result.get(j) + result.get(j - 1));
            }
        }

        return result;
    }
}
