package weivretni.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * http://leetcode.com/2011/09/regular-expression-matching.html
 * 
 * Implement regular expression matching with support for Ô.Õ and Ô*Õ.
 * 
 * Ô.Õ Matches any single character. Ô*Õ Matches zero or more of the preceding element. The matching
 * should cover the entire input string (not partial).
 * 
 * The function prototype should be: bool isMatch(const char *s, const char *p)
 * 
 * <pre>
 * 
 * Some examples:
 * isMatch(ÒaaÓ,ÓaÓ) -> false
 * isMatch(ÒaaÓ,ÓaaÓ) -> true
 * isMatch(ÒaaaÓ,ÓaaÓ) -> false
 * isMatch(ÒaaÓ, Òa*Ó)-> true
 * isMatch(ÒaaÓ, Ò.*Ó) -> true
 * isMatch(ÒabÓ, Ò.*Ó) -> true
 * isMatch(ÒaabÓ, Òc*a*bÓ) -> true
 * 
 * 
 * </pre>
 * 
 * @author gzhang
 * 
 */
public class RegularExpressionMatch {

    /*
     * Scan from left to right and try to find possible matches
     */
    private Map<String, String> findMatchingSmallerPaires(String s, String p) {
        Map<String, String> result = new HashMap<String, String>();

        int i = 0;
        int j = 0;

        char a = s.charAt(i);
        char b = p.charAt(j);

        if (b == '.') {

            if (j + 1 < p.length()) {
                char bNext = p.charAt(j + 1);
                if (bNext == '*') {
                    // Most complex. .*
                    result.put(s, p.substring(j + 2));

                    while (i < s.length()) {
                        result.put(s.substring(++i), p.substring(j + 2));
                    }
                } else {
                    result.put(s, p.substring(j + 2));
                }
            } else {
                result.put(s.substring(i + 1), p.substring(j + 1));
            }
        } else {
            if (j + 1 < p.length()) {
                char bNext = p.charAt(j + 1);

                if (bNext == '*') {
                    if (a == b) {
                        // Most complex one (aaaab, a*b)
                        result.put(s, p.substring(j + 2));

                        while (i < s.length()) {
                            result.put(s.substring(++i), p);
                        }
                    } else {
                        result.put(s, p.substring(j + 2));
                    }
                } else {
                    if (a == b) {
                        result.put(s.substring(i + 1), p.substring(j + 1));
                    }
                }
            } else {
                // p only has 1 character, and it is not .
                if (a == b) {
                    result.put(s.substring(i + 1), p.substring(j + 1));
                }
            }
        }

        return result;
    }

    public boolean isMatch(String s, String p) {

        if (s.length() == 0 && p.length() == 0) {
            return true;
        }

        if (s.length() == 0) {
            if (p.equals(".*")) {
                return true;
            } else {
                return false;
            }
        }

        if (s.length() > 0 && p.length() == 0) {
            return false;
        }

        Map<String, String> results = findMatchingSmallerPaires(s, p);
        if (results.size() == 0) {
            return false;
        } else {

            boolean result = false;

            for (Map.Entry<String, String> entry : results.entrySet()) {
                result = result || isMatch(entry.getKey(), entry.getValue());
            }
            return result;
        }
    }

}
