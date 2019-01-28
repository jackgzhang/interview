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
 * <p>
 * 解法-:
 * O(m+n)
 * <pre>
 * 从左下角或右上角开始:
 * (1) 如果target = 左下角, 返回
 * (2) 如果target > 左下角, target 位于矩阵左下角的右边  m[0..n-1][1..m-1],
 *     比如 target = 27
 *
 *   [-,  3,  5,  7],
 *   [-, 11, 16, 20],
 *   [-, 30, 34, 50]
 *
 *
 * (3) 如果target < 左下角, target 位于矩阵左下角的上边  m[0..n-2][0..m-1]
 *     比如 target = 16
 *
 *   [1,  3,  5,  7],
 *   [10, 11, 16, 20],
 *   [- , -,  -,  -]
 *
 * 解法=:
 * O(log(m+n))
 * Convert corrdinate (x,y) into array index and use binary search
 * </pre>
 */
public class Q074_Search2DMatrix {

    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;

        int i = row - 1;
        int j = 0;

        while (i >= 0 && j < col) {
            if (matrix[i][j] == target) return true;
            else if (matrix[i][j] > target) i--;
            else j++;
        }
        return false;
    }

    public boolean binarySearch(int[][] A, int target) {

        int mx = A.length;
        int my = A[0].length;

        int l = 0;
        int r = mx * my;

        while (l < r) {
            int m = (l + r) / 2;

            int row = m / my;
            int column = m % my;

            if (A[row][column] == target) {
                return true;
            }else if (A[row][column] < target) {
                l = m + 1;
            }else {
                r = m;
            }
        }

        return false;
    }
}
