package weivretni.leetcode;

/**
 * <pre>
 * Write an efficient algorithm that searches for a value in an m x n matrix. 
 * This matrix has the following properties:
 * 
 * Integers in each row are sorted from left to right.
 * The first integer of each row is greater than the last integer of the previous row.
 * For example,
 * 
 * Consider the following matrix:
 * 
 * [
 *   [1,   3,  5,  7],
 *   [10, 11, 16, 20],
 *   [23, 30, 34, 50]
 * ]
 * Given target = 3, return true.
 * </pre>
 * 
 * 
 * 两次二分就好了，首先二分第一列，找出target所在的行，然后二分该行
 * 
 * 
 */
public class Q074_Search2DMatrix {

    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null) {
            return false;
        } else {
            // locate row
            int l = 0, r = matrix.length - 1;
            while (l < r) {
                int mid = (l + r) / 2;
                if (matrix[mid][0] == target) {
                    return true;
                } else if (matrix[mid][0] < target) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            }

            int row = l;
            // locate column
            l = 0;
            r = matrix[0].length - 1;
            while (l < r) {
                int mid = (l + r) / 2;
                if (matrix[row][mid] == target) {
                    return true;
                } else if (matrix[row][mid] < target) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            }

            return false;
        }
    }
}
