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
 * 
 * Solution
 * 
 * <pre>
 * O(n*n)。对于每一个字符，以之作为中间元素往左右寻找。注意处理奇偶两种模式：
 * 1. aba
 * 2. abba
 * </pre>
 * 
 * OR
 * 
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
 * 
 * 
 * 解法二
 * 
 * O(n2) runtime, O(1) space – Simpler solution
 * 
 */
public class Q005_LongestPalindromicSubstring {

    public String longestPalindrome(String s) {
        if (s.length() == 0) {
            return "";
        } else {
            boolean dp[][] = new boolean[s.length()][s.length()];
            int maxi = 0;
            int maxj = 0;

            for (int i = 0; i < s.length(); i++) {
                for (int j = 0; j <= i; j++) {

                    boolean value = false;

                    if (i == j) {
                        value = true;
                    } else if (i - j == 1) {
                        value = (s.charAt(i) == s.charAt(j));
                    } else {
                        value = dp[i - 1][j + 1] && (s.charAt(i) == s.charAt(j));
                    }

                    dp[i][j] = value;

                    if (value && (i - j) > (maxi - maxj)) {
                        maxi = i;
                        maxj = j;
                    }
                }
            }

            return s.substring(maxj, maxi + 1); // the last one is exclusive
        }
    }


    // ========== 解法三 =============
    /**
     * O(n2) runtime,  O(1) space
     */
    public String longestPalindrome2(String s) {
        String result = "";
        int start = 0, end = 0;
        while (end < s.length()) {
            while (end < s.length() && s.charAt(start) == s.charAt(end)) {
                end ++;
            }
            String currentResult = expand(s, start, end - 1);
            System.out.println(currentResult);
            if (result.length() < currentResult.length()) {
                result = currentResult;
            }
            start = end;
        }
        return result;
    }

    private String expand(String s, int start, int end) {
        while (start >=0 && end < s.length() && s.charAt(start) == s.charAt(end)) {
            start--;
            end++;
        }

        return s.substring(start+1,end);
    }

}
