package weivretni.leetcode;

/**
 * <pre>
 *
 * Given a string S, find the longest palindromic substring in S.
 *
 * You may assume that the maximum length of S is 1000, and there exists one unique longest
 *
 * palindromic substring.
 *
 * </pre>
 * <p>
 * Solution
 * <p>
 * <pre>
 * O(n*n)。对于每一个字符，以之作为中间元素往左右寻找。注意处理奇偶两种模式：
 * 1. aba
 * 2. abba
 * </pre>
 * <p>
 * OR
 * <p>
 * <pre>
 * 解法一
 * O(n2) runtime, O(n2) space
 *
 * P[i,j] = 字符串区间[i,j]是否为palindrome.
 *
 * 首先找个例子，比如S="abccb",
 *     S=    a  b  c  c  b
 * Index =   0  1  2  3  4
 * P[0,1] =S[0] == S[1]    , P[1,1] =1
 * P[0,2] = S[0] == S[2] && P[1,1], P[1,2] = S[1] == S[2
 *
 * P[i,i] =1  //each char is a palindrome] , P[2,2] = 1
 * P[0,3] = S[0] == S[3] && P[1,2], P[1,3] = S[1] == S[3] && P[2,2] , P[2,3] =S[2] ==S[3],  P[3,3]=1
 * ......................
 * 由此就可以推导出规律
 *
 * P[i,j] = 1  if i ==j
 *         =  S[i] ==S[j]   if j = i+1
 *         =  S[i] == S[j] && P[i+1][j-1]  if j>i+1
 * </pre>
 * <p>
 * <p>
 * 解法二
 */
public class Q005_LongestPalindromicSubstring {

    /**
     * ========== 解法1 =============
     * <pre>
     * P[i,j] = 1  if i ==j
     *        =  S[i] ==S[j]   if j = i+1
     *        =  S[i] == S[j] && P[i+1][j-1]  if j>i+1
     * </pre>
     * <p>
     * 从右下角开始计算, 只计算 dp 矩阵的 一半即可
     * <p>
     * O(n^2) runtime, O(n^2) space
     */
    public String longestPalindrome(String s) {
        String result = "";

        int len = s.length();
        boolean dp[][] = new boolean[len][len];

        for (int i = len - 1; i >= 0; i--) {
            for (int j = i; j <= len - 1; j++) {
                if (j - i == 0) dp[i][j] = true;  // same character
                if (j - i == 1) dp[i][j] = s.charAt(j) == s.charAt(i);  // neighbours
                if (j - i > 1) dp[i][j] = s.charAt(j) == s.charAt(i) && dp[i + 1][j - 1]; // more than 1 distance away

                if (dp[i][j] && result.length() < (j - i + 1)) {
                    result = s.substring(i, j + 1);
                }
            }
        }

        return result;
    }


    // ========== 解法2 =============

    /**
     * We observe that a palindrome mirrors around its center. Therefore,
     * a palindrome can be expanded from its center, and there are only 2n – 1 such centers.
     * You might be asking why there are 2n – 1 but not n centers? The reason is the center
     * of a palindrome can be in between two letters.
     * <p>
     * Such palindromes have even number of letters (such as “abba”)
     * and its center are between the two ‘b’s.
     * <p>
     * O(n^2) runtime,  O(1) space,
     */
    public String longestPalindrome2(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            String s1 = expand(s, i, i);
            String s2 = expand(s, i, i + 1);

            result = s1.length() > result.length() || s2.length() > result.length() ? (s1.length() > s2.length() ? s1 : s2) : result;
        }
        return result;
    }

    private String expand(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }

        return s.substring(left + 1, right);
    }

}
