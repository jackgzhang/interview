package weivretni.leetcode;

/**
 * Given a string S and a string T, count the number of distinct sequences of T in S.
 * <p>
 * A sequence of a string is a new string which is formed from the original string by deleting some (can be none) of the characters without
 * disturbing the relative positions of the remaining characters. (ie, "ACE" is a subsequence of "ABCDE" while "AEC" is not).
 * <p>
 * Here is an example:
 * S = "rabbbit", T = "rabbit"
 * <p>
 * Return 3.
 *
 *
 * http://www.cnblogs.com/springfor/p/3896152.html
 * 没看懂
 *
 */
public class Q302_DistinctSubsequences {


    public int numDistinct(String s, String t) {
        int[][] dp = new int[s.length() + 1][t.length() + 1];
        dp[0][0] = 1;//initial
        for (int j = 1; j <= t.length(); j++)//S is empty
            dp[0][j] = 0;

        for (int i = 1; i <= s.length(); i++)//T is empty
            dp[i][0] = 1;

        for (int i = 1; i <= s.length(); i++) {
            for (int j = 1; j <= t.length(); j++) {
                dp[i][j] = dp[i - 1][j];
                if (s.charAt(i - 1) == t.charAt(j - 1))
                    dp[i][j] += dp[i - 1][j - 1];
            }
        }
        return dp[s.length()][t.length()];
    }
}
