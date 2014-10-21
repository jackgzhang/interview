package weivretni.geek4geek;

/**
 * http://www.geeksforgeeks.org/dynamic-programming-set-6-min-cost-path/
 * 
 * 
 * 
 * @author gzhang
 * 
 */
public class DP_6_MinCostPath {

    public int doIt(int[][] matrix, int i, int j) {
        if (i == 0 && j == 0) {
            return matrix[0][0];
        } else if (i == 0 && j != 0) {
            return doIt(matrix, i, j - 1) + matrix[i][j];
        } else if (i != 0 && j == 0) {
            return doIt(matrix, i - 1, j) + matrix[i][j];
        } else {
            int cost1 = doIt(matrix, i - 1, j);
            int cost2 = doIt(matrix, i, j - 1);
            int cost3 = doIt(matrix, i - 1, j - 1);

            return Math.min(cost1, Math.min(cost2, cost3)) + matrix[i][j];
        }
    }
}
