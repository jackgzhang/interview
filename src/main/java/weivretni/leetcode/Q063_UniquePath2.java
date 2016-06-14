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
 *
 *   [0,0,0]
 *   [0,1,0]
 *   [0,0,0]
 *
 * The total number of unique paths is 2.
 *
 * Note: m and n will be at most 100.
 * </pre>
 * <p>
 * 思路: 和前一题类似,唯一的区别是如果 obstacleGrid[][] ==1,
 * set dp[][] = false
 *
 * Trick: 为防止 检查obstacleGrid 时出界, 应该从右下角向左上角 计算
 *
 *
 *   [0,0,0],0
 *   [0,1,0],0
 *   [0,0,0],0
 *    0,0,1, 0
 *
 * @author gzhang
 */
public class Q063_UniquePath2 {

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int row = obstacleGrid.length + 1;
        int column = obstacleGrid[0].length + 1;
        int dp[][] = new int[row][column];

        dp[row-2][column-1] = 1;

        for (int i = row - 2; i >= 0; i--) {
            for (int j = column - 2; j >= 0; j--) {
                if (obstacleGrid[i][j] == 1) {
                    dp[i][j] = 0;
                } else {
                    dp[i][j] = dp[i + 1][j] + dp[i][j + 1];
                }
            }
        }

        return dp[0][0];
    }
}
