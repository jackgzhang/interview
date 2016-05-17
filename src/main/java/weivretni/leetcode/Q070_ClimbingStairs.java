package weivretni.leetcode;

/**
 * You are climbing a stair case. It takes n steps to reach to the top.
 * 
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 * 
 * 
 * @author gzhang
 * 
 */

public class Q070_ClimbingStairs {

    public int climbStairs(int n) {
        if (n <= 1) {
            return 1;
        }

        int[] unique_ways = new int[n + 1];

        unique_ways[0] = 1;
        unique_ways[1] = 1;

        for (int i = 2; i < n + 1; i++) {
            unique_ways[i] = unique_ways[i - 1] + unique_ways[i - 2];
        }

        return unique_ways[n];
    }
}
