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
 * http://fisherlei.blogspot.com/2012/12/leetcode-distinct-subsequences_19.html
 *
 * A DP problem.
 * [解题方法]
 * 关键是如何得到递推关系，可以这样想，设母串的长度为 j，
 * 子串的长度为 i，我们要求的就是长度为 i 的字串在长度为 j 的母串中出现的次数，设为 t[i][j]，
 *
 * (1) 若母串的最后一个字符与子串的最后一个字符不同，则长度为 i 的子串在长度为 j 的母串中出现的次数就是母串的前 j - 1 个字符中子串出现的次数，
 *     即 t[i][j] = t[i][j - 1]，
 *
 * (2) 若母串的最后一个字符与子串的最后一个字符相同，那么除了前 j - 1 个字符出现字串的次数外，
 *     还要加上子串的前 i - 1 个字符在母串的前 j - 1 个字符中出现的次数，即 t[i][j] = t[i][j - 1] + t[i - 1][j - 1]。
 *
 *
 *
 *
 *
 * 也可以用二维数组，这里图省事，直接用滚动数组了。
 *
 */
public class Q302_DistinctSubsequences {

    // dp

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


    // recursive

    int result = 0;
    public int numDistinct2(String s, String t) {
        if (s.length() < t.length()) {
            return result;
        }
        if ( t.length() == 0) {
            result ++;
        }else {
            int i = 0;
            while (s.charAt(i) != t.charAt(0) && s.length() - i > t.length() ) {
                i++;
            }
            if (s.charAt(i) == t.charAt(0)) {
                numDistinct2(s.substring(i+1), t.substring(1));
                numDistinct2(s.substring(i+1), t);
            }
        }
        return result;
    }
}
