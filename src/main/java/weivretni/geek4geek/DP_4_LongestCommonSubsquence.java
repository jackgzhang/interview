package weivretni.geek4geek;

import java.util.ArrayList;
import java.util.List;

/**
 * http://www.geeksforgeeks.org/dynamic-programming-set-4-longest-common-subsequence/
 * 
 * <pre>
 * 
 * We'll use bottom-up dynamic programming technique.
 * 
 *    LCS(X[0..m-1], Y[0..n-1]) = {
 *      1. if character X[m-1] == Y[n-1], then this character will be part of LCS found for X[0..n-2] and Y[0..m-2] 
 *              LCS(X[0..m-2], Y[0..n-2]) + 1
 *      2. if character X[m-1] != Y[n-1], then
 *              max(LCS(X[0..m-1], Y[0..n-2], LCS(X[0..m-2], Y[0..n-1])
 * 
 * @return list containing longest-common-subsequence for strings X and Y.
 * 
 * </pre>
 */
public class DP_4_LongestCommonSubsquence {

    private String maxString(String a, String b) {
        if (a.length() >= b.length())
            return a;
        else
            return b;
    }

    public String doIt(String x, String y) {
        return doIt(x, y, x.length(), y.length());
    }

    private String doIt(String x, String y, int m, int n) {
        if (m == 0 || n == 0)
            return "";

        if (x.charAt(m - 1) == y.charAt(n - 1)) {
            return doIt(x, y, m - 1, n - 1) + x.charAt(m - 1);
        }

        else
            // return Math.max(lcs(x,y,m, n-1), lcs(x,y,m-1,n));
            return maxString(doIt(x, y, m, n - 1), doIt(x, y, m - 1, n));

    }

}
