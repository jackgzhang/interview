package weivretni.leetcode;

import java.util.Arrays;
import java.util.List;

/**
 * <pre>
 * Given an index k, return the kth row of the Pascal's triangle.
 *
 * For example, given k = 3,
 * Return [1,3,3,1].
 *
 * Note:  从后望前算
 * </pre>
 *
 */
public class Q119_PascalsTriangleII {

    public List<Integer> getRow(int rowIndex) {

        Integer[] row = new Integer[rowIndex + 1];
        Arrays.fill(row, 1);

        for (int i = 0; i < rowIndex - 1; i++) {
            for (int j = i + 1; j >= 1; j--) {
                row[j] = row[j] + row[j - 1];
            }
        }

        return Arrays.asList(row);
    }
}
