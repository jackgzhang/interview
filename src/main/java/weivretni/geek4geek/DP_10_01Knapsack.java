package weivretni.geek4geek;

/**
 * http://www.geeksforgeeks.org/dynamic-programming-set-10-0-1-knapsack-problem/
 * 
 * @author gzhang
 * 
 */
public class DP_10_01Knapsack {

    public int doIt(int maxWeight, int[] values, int[] weights, int n) {
        if (n == 0 || maxWeight == 0) {
            return 0;
        }

        if (weights[n - 1] > maxWeight) {
            return doIt(maxWeight, weights, values, n - 1);
        } else {
            return Math.max(values[n - 1] + doIt(maxWeight - weights[n - 1], weights, values, n - 1), doIt(maxWeight, weights, values, n - 1));
        }
    }
}
