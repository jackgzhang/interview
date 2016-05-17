package weivretni.leetcode;

/**
 * <pre>
 * Follow up for "Unique Paths":
 * 
 * Now consider if some obstacles are added to the grids. How many unique paths would there be?
 * 
 * An obstacle and empty space is marked as 1 and 0 respectively in the grid.
 * 
 * For example,
 * There is one obstacle in the middle of a 3x3 grid as illustrated below.
 * 
 * [
 *   [0,0,0],
 *   [0,1,0],
 *   [0,0,0]
 * ]
 * The total number of unique paths is 2.
 * 
 * Note: m and n will be at most 100.
 * </pre>
 * 
 * @author gzhang
 *
 */
public class Q063_UniquePath2 {

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if (obstacleGrid.length <= 0) {
            return 0;
        } else {
            int[][] result = new int[obstacleGrid.length][obstacleGrid[0].length];

            // Init first row
            boolean hasObstacle = false;
            for (int i = 0; i < obstacleGrid.length; i++) {
                if (obstacleGrid[i][0] == 0) {
                    if (!hasObstacle) {
                        result[i][0] = 1;
                    } else {
                        result[i][0] = 0;
                    }
                } else {
                    hasObstacle = true;
                    result[i][0] = 0;
                }
            }

            // Init first column
            hasObstacle = false;
            for (int i = 0; i < obstacleGrid[0].length; i++) {
                if (obstacleGrid[0][i] == 0) {
                    if (!hasObstacle) {
                        result[0][i] = 1;
                    } else {
                        result[0][i] = 0;
                    }
                } else {
                    hasObstacle = true;
                    result[0][i] = 0;
                }
            }

            // Now start
            for (int i = 1; i < obstacleGrid.length; i++) {
                for (int j = 1; j < obstacleGrid[0].length; j++) {
                    if (obstacleGrid[i][j] == 1) {
                        result[i][j] = 0;
                    } else if (obstacleGrid[i - 1][j] == 1 && obstacleGrid[i][j - 1] == 1) {
                        result[i][j] = 0;
                    } else {
                        int aResult = 0;
                        if (obstacleGrid[i - 1][j] != 1) {
                            aResult += result[i - 1][j];
                        }

                        if (obstacleGrid[i][j - 1] != 1) {
                            aResult += result[i][j - 1];
                        }

                        result[i][j] = aResult;
                    }
                }
            }

            // result
            return result[obstacleGrid.length - 1][obstacleGrid[0].length - 1];
        }
    }
}
