package weivretni.leetcode;

/**
 * <pre>
 * A message containing letters from A-Z is being encoded to numbers using the following mapping:
 * 
 * 'A' -> 1
 * 'B' -> 2
 * ...
 * 'Z' -> 26
 * Given an encoded message containing digits, determine the total number of ways to decode it.
 * 
 * For example,
 * Given encoded message "12", it could be decoded as "AB" (1 2) or "L" (12).
 * 
 * The number of ways decoding "12" is 2.
 * 
 * 典型的一维动态规划
 * 
 * 分析：需要注意的是，如果序列中有不能匹配的0，那么解码方法是0，比如序列012 、100（第二个0可以和1组成10，第三个0不能匹配）。
 * 
 * 递归的解法很容易，但是大集合会超时。转换成动态规划的方法，假设dp[i]表示序列s[0...i-1]的解码数目，动态规划方程如下：                                                                                                                                                               本文地址
 * 
 * dp[0] = 1;
 * dp[1] = (a) s[1] == 0  -> dp[0]
 *         (b) s[1] <> 0  -> isValid(s[0],s[1]) ? dp[0] + 1: dp[0]
 *         
 * dp[i] = (a) s[i] == 0  -> isValid(s[i-1],s[1]) ? dp[i-2] : 0
 *             s[i] <> 0  -> isValid(s[i-1],s[1]) ? dp[i-1] + dp[i-2] : dp[i-1];
 * 
 * </pre>
 * 
 * @author gzhang
 * 
 */
public class Q091_DecodeWays {

    public int numDecodings(String s) {
        if (s == null || s.length() == 0 || s.startsWith("0")) {
            return 0;
        } else {

            int result = 0;

            if (s.length() == 1) {
                return 1;
            }

            if (isValid(s.substring(0, 1))) {
                result += numDecodings(s.substring(1, s.length()));
            }

            if (s.length() >= 2 && isValid(s.substring(0, 2))) {
                result += numDecodings(s.substring(2, s.length()));
            }

            return result;
        }
    }

    private boolean isValid(String s) {
        return Integer.valueOf(s) <= 26 && Integer.valueOf(s) >= 1;
    }

}