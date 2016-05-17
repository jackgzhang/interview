package weivretni.leetcode;


/**
 * <pre>
 * Given s1, s2, s3, find whether s3 is formed by the interleaving of s1 and s2.
 * 
 * For example,
 * Given:
 * s1 = "aabcc",
 * s2 = "dbbca",
 * 
 * When s3 = "aadbbcbcac", return true.
 * When s3 = "aadbbbaccc", return false.
 * </pre>
 * 
 * <pre>
 * http://blog.csdn.net/u011095253/article/details/9248073
 * 
 * 
 * 这道题，可以用Recursion和DP两种方法解，我们先来看比较直观的Recursion的解法。
 * 
 * t[i][j] = t[i-1][j] && (s2[i-1] == s3[i+j-1])  
 *              OR
 *           t[i][j-1] && (s1[j-1] == s3[i+j -1) 
 * </pre>
 * 
 */
public class Q097_InterleavingString {

    // ============ DP ============//
    public boolean isInterleave(String s1, String s2, String s3) {
        if (s1.length() == 0 && s2.length() == 0 && s3.length() == 0) {
            return true;
        } else if (s1.length() + s2.length() != s3.length()) {
            return false;
        } else {
            boolean dp[][] = new boolean[s1.length() + 1][s2.length() + 1];
            dp[0][0] = true;

            // init,  suppose s2=''
            for (int i = 1; i < s1.length() + 1; i++) {
                dp[i][0] = (dp[i - 1][0] == true) && s1.charAt(i - 1) == s3.charAt(i - 1);
            }

            // init,  suppose s1=''
            for (int i = 1; i < s2.length() + 1; i++) {
                dp[0][i] = (dp[0][i - 1] == true) && s2.charAt(i - 1) == s2.charAt(i - 1);
            }

            // now start
            for (int i = 1; i < s1.length() + 1; i++) {
                for (int j = 1; j < s2.length() + 1; j++) {
                    boolean reachable = false;
                    if (dp[i - 1][j]) {
                        reachable = s1.charAt(i - 1) == s3.charAt(i + j - 1);
                    }
                    if (!reachable && dp[i][j - 1]) {
                        reachable = s2.charAt(j - 1) == s3.charAt(i + j - 1);
                    }

                    dp[i][j] = reachable;
                }
            }

            return dp[s1.length()][s2.length()];
        }
    }

    // ========== Recursive ==========//
    public boolean isInterleave2(String s1, String s2, String s3) {
        if (s1.length() == 0 && s2.length() == 0 && s3.length() == 0) {
            return true;
        } else {
            boolean result = false;
            if (s1.length() > 0 && s3.length() > 0 && s1.charAt(0) == s3.charAt(0)) {
                result = result || isInterleave(s1.substring(1), s2, s3.substring(1));
            }
            if (!result && s2.length() > 0 && s3.length() > 0 && s2.charAt(0) == s3.charAt(0)) {
                result = result || isInterleave(s1, s2.substring(1), s3.substring(1));
            }
            return result;
        }
    }
}
