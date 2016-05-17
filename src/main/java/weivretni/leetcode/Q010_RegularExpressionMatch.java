package weivretni.leetcode;

/**
 * http://leetcode.com/2011/09/regular-expression-matching.html
 * 
 * <pre>
 * Implement regular expression matching with support for '.' and '*'.
 * 
 * '.' Matches any single character.
 * '*' Matches zero or more of the preceding element.
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
 * isMatch("aa", "a*") → true
 * isMatch("aa", ".*") → true
 * isMatch("ab", ".*") → true
 * isMatch("aab", "c*a*b") → true
 * 
 * 
 * </pre>
 * 
 * @author gzhang
 * 
 */
public class Q010_RegularExpressionMatch {

    public boolean isMatch(String s, String p) {
        if (p.length() == 0) {
            return s.length() == 0;
        } else {

            if (p.length() == 1) {
                return s.length() == 1 && (s.charAt(0) == p.charAt(0) || p.charAt(0) == '.');
            } else {

                // next char is not '*': must match current character
                if (p.charAt(1) != '*') {
                    return (s.length() > 0 && (s.charAt(0) == p.charAt(0) || p.charAt(0) == '.')) && isMatch(s.substring(1), p.substring(1));
                } else {
                    // next char is '*', also s[0] = p[0];
                    int index = 1;
                    while (s.length() > 0 && s.length()>=index && (s.charAt(0) == p.charAt(0) || p.charAt(0) == '.')) {
                       if (isMatch(s.substring(index++), p.substring(2))) {
                           return true;
                       }
                    }

                    // next char is '*', but s[0] != p[0]; so skip this
                    return isMatch(s, p.substring(2));
                }
            }
        }
    }
}
