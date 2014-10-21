package weivretni.leetcode;

/**
 * Implement wildcard pattern matching with support for '?' and '*'.
 * 
 * <pre>
 * 
 * '?' Matches any single character.
 * '*' Matches any sequence of characters (including the empty sequence).
 * 
 * The matching should cover the entire input string (not partial).
 * 
 * The function prototype should be:
 * bool isMatch(const char *s, const char *p)
 * 
 * Some examples:
 * isMatch("aa","a") → false
 * isMatch("aa","aa") → true
 * isMatch("aaa","aa") → false
 * isMatch("aa", "*") → true
 * isMatch("aa", "a*") → true
 * isMatch("ab", "?*") → true
 * isMatch("aab", "c*a*b") → false
 * </pre>
 * 
 * @author gzhang
 * 
 */
public class Q123_WildCardMatch {

    public boolean isMatch(String s, String p) {
        // Start typing your Java solution below
        // DO NOT write main() function

        int i = 0, j = 0;

        // the following is a recursive one, it timed out on large input
        if (p.length() == 0) {
            return s.length() == 0;
        }
        if (s.length() == 0) {
            return p.equals("") || allStar(p);
        }

        if (s.charAt(0) == p.charAt(0) || p.charAt(0) == '?') {
            return isMatch(s.substring(1), p.substring(1));
        }

        if (p.charAt(0) == '*') {
            return isMatch(s.substring(1), p) || isMatch(s, p.substring(1));
        }

        return false;
    }

    public boolean allStar(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '*') {
                return false;
            }
        }

        return true;
    }

}
