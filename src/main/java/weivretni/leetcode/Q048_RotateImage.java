package weivretni.leetcode;

/**
 * <pre>
 * You are given an n x n 2D matrix representing an image.
 * 
 * Rotate the image by 90 degrees (clockwise).
 * 
 * Follow up:
 * Could you do this in-place?
 * </pre>
 * 
 * 
 * <pre>
 * 如下图，首先沿逆对角线翻转一次，然后按x轴中线翻转一次。
 * 
 *   1 2        4 2      3 1
 *   3 4   -->  3 1  --> 4 2
 * 
 * </pre>
 * 
 * @author gzhang
 * 
 */
public class Q048_RotateImage {

    public void rotate(int[][] matrix) {

        if (matrix == null || matrix.length == 0) {
            return;
        } else {
            int n = matrix.length;

            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i; j++) {
                    int tmp = matrix[i][j];
                    matrix[i][j] = matrix[n - j - 1][n - i - 1];
                    matrix[n - j - 1][n - i - 1] = tmp;
                }
            }

            for (int i = 0; i < n / 2; i++) {
                for (int j = 0; j < n; j++) {
                    int tmp = matrix[i][j];
                    matrix[i][j] = matrix[n - i - 1][j];
                    matrix[n - i - 1][j] = tmp;
                }
            }
        }
    }
}
