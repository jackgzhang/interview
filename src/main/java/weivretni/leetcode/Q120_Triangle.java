package weivretni.leetcode;

import java.util.List;

/**
 * <pre>
 * Given a triangle, find the minimum path sum from top to bottom. 
 * Each step you may move to adjacent numbers on the row below.
 * 
 * For example, given the following triangle
 * [
 *      [2],
 *     [3,4],
 *    [6,5,7],
 *   [4,1,8,3]
 * ]
 * The minimum path sum from top to bottom is 11 (i.e., 2 + 3 + 5 + 1 = 11).
 * 
 * Note:
 * Bonus point if you are able to do this using only O(n) extra space, 
 * where n is the total number of rows in the triangle.
 * </pre>
 * 
 * @author gzhang
 *
 */
public class Q120_Triangle {

    public int minimumTotal(List<List<Integer>> triangle) {
        if (triangle == null || triangle.size() == 0) {
            return 0;
        }

        // declare an int[] pathSum with length of triangle.size(), witch used to record the current
        // path sum from bottom to up

        int[] pathSum = new int[triangle.size()];

        // calculate minimum path sum from bottom to up
        int rowNum = triangle.size();
        for (int row = rowNum - 1; row >= 0; row--) {
            int colNum = triangle.get(row).size();

            for (int col = 0; col < colNum; col++) {
                if (row == rowNum - 1) {

                    // from bottom to up, current is bottom level
                    pathSum[col] = triangle.get(row).get(col);
                } else {
                    // if not bottom level, so from previous level wich are store in pathSum find
                    // smaller value can access current point,
                    // then update it
                    pathSum[col] = Math.min(pathSum[col], pathSum[col + 1]) + triangle.get(row).get(col);
                }
            }

        }
        // right no, the pathSum[0] contains the minimum path sum
        return pathSum[0];
    }
}
