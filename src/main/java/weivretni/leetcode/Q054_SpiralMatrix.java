package weivretni.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 * Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.
 *
 * For example,
 * Given the following matrix:
 *
 * [
 *  [ 1, 2, 3 ],
 *  [ 4, 5, 6 ],
 *  [ 7, 8, 9 ]
 * ]
 * You should return [1,2,3,6,9,8,7,4,5].
 * </pre>
 *
 * @author gzhang
 */
public class Q054_SpiralMatrix {

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int row = 0, col = 0;
        int m = matrix.length;
        int n = matrix[0].length;

        while (true) {
            if (n == 0) break;
            for (int i = 0; i < n; i++) {
                result.add(matrix[row][col++]);
            }
            row++;
            col--;
            m--;

            if (m == 0) break;
            for (int i = 0; i < m; i++) {
                result.add(matrix[row++][col]);
            }
            row--;
            col--;
            n--;

            if (n == 0) break;
            for (int i = 0; i < n ; i++) {
                result.add(matrix[row][col--]);
            }
            col++;
            row--;
            m--;

            if (m ==0) break;
            for (int i=0;i<m; i++) {
                result.add(matrix[row--][col]);
            }
            row++;
            col++;
            n--;

        }

        return result;
    }
}
