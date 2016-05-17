package weivretni.leetcode;

/**
 * <pre>
 * Given an integer n, generate a square matrix filled with elements from 1 to n2 in spiral order.
 * 
 * For example,
 * Given n = 3,
 * 
 * You should return the following matrix:
 * [
 *  [ 1, 2, 3 ],
 *  [ 8, 9, 4 ],
 *  [ 7, 6, 5 ]
 * ]
 * </pre>
 * 
 * @author gzhang
 *
 */
public class Q059_SpiralMatrix2 {

    public int[][] generateMatrix(int n) {
        
        int[][] result = new int[n][n];
        
        if (n <= 0) {
            return result;
        } else {
            

            int startX = 0;
            int startY = 0;
            int endX = n - 1;
            int endY = n - 1;

            int counter = 1;
            while (true) {
                // ->
                for (int i = startY; i <= endY; i++) {
                    result[startX][i] = counter++;
                }
                startX++;

                // down

                for (int i = startX; i <= endX; i++) {
                    result[i][endY] = counter++;
                }
                endY--;

                // <-
                for (int i = endY; i >= startY; i--) {
                    result[endX][i] = counter++;
                }
                endX--;

                // Up
                for (int i = endX; i >= startX; i--) {
                    result[i][startY] = counter++;
                }
                startY++;

                if (endX < startX || endY < startY) {
                    break;
                }
            }

            return result;
        }
    }
}
