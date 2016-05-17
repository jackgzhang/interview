package weivretni.leetcode;

/**
 * <pre>
 * Given a string s, partition s such that every substring of the partition is a palindrome.
 * 
 * Return the minimum cuts needed for a palindrome partitioning of s.
 * 
 * For example, given s = "aab",
 * Return 1 since the palindrome partitioning ["aa","b"] could be produced using 1 cut.
 * 
 * 
 * </pre>
 * 
 * <pre>
 * http://www.acmerblog.com/palindrome-partitioning-ii-6148.html
 * 
 * 此题可以用动态规划求解。isPal[i][j]表示字符串s的子串s[i...j]是否为回文串，cut[j]表示子串s[0...j]所需要的最小分割数。
 * </pre>
 */
public class Q132_PalindromePartitioningII {

    public int minCut(String s) {
        int n = s.length();

        boolean isPal[][] = new boolean[n][n]; // 表示字符串s的子串s[i...j]是否为回文串
        int cut[] = new int[n]; // cut[j]表示子串s[0...j]所需要的最小分割数。

        for (int j = 0; j < n; j++) {

            cut[j] = j;   // 每个字符切一刀都符合

            for (int i = 0; i <= j; i++) {

                // 如果子串 s[i...j]是回文串
                if (s.charAt(i) == s.charAt(j) && (j - i <= 1 || isPal[i + 1][j - 1])) {
                    
                    isPal[i][j] = true;
                    
                    if (i > 0)
                        // 因为子串 s[i...j]已经是回文串了， 
                        cut[j] = Math.min(cut[j], cut[i - 1] + 1); // 
                    else
                        cut[j] = 0; // 如果 s[0...j]是回文串，则说明不需要切割
                }
            }
        }
        return cut[n - 1];
    }
}
