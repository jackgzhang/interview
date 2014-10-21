package weivretni.geek4geek;

/**
 * http://www.geeksforgeeks.org/dynamic-programming-set-12-longest-palindromic-subsequence/
 * 
 * @author gzhang
 * 
 */
public class DP_12_LongestPalindromicSubsequence {

    public int doIt(String str) {
        if (str.length() == 0) {
            return 0;
        } else if (str.length() == 1) {
            return 1;
        } else {
            if (str.charAt(0) == str.charAt(str.length() - 1)) {
                
                int tmp = doIt(str.substring(1, str.length() - 1));
                if (tmp == 0) {
                    return 0;
                }else{
                    return 2 + tmp;
                }
                
            } else {
                return Math.max(doIt(str.substring(1)), doIt(str.substring(0, str.length() - 1)));
            }
        }
    }
}
