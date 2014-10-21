package weivretni.leetcode;

/**
 * 
 * http://leetcode.com/2011/09/regular-expression-matching.html
 * 
 * <pre>
 * 
 * bool isMatch(const char *s, const char *p) {
 *   assert(s && p);
 *   if (*p == '\0') return *s == '\0';
 *  
 *   // next char is not '*': must match current character
 *   if (*(p+1) != '*') {
 *     assert(*p != '*');
 *     return ((*p == *s) || (*p == '.' && *s != '\0')) && isMatch(s+1, p+1);
 *   }
 *   // next char is '*'
 *   while ((*p == *s) || (*p == '.' && *s != '\0')) {
 *     if (isMatch(s, p+2)) return true;
 *     s++;
 *   }
 *   return isMatch(s, p+2);
 * }
 * </pre>
 * 
 * @author gzhang
 * 
 */
public class RegularExpressionMatch2 {

    public boolean isMatch(String s, String p) {

        if (p.length() == 0 && p.length() == s.length()) {
            return true;
        }

        if (p.charAt(1) != '*') {
            if (p.charAt(0) == s.charAt(0)) {
                return isMatch(s.substring(2), p.substring(2));
            } else {
                return false;
            }
        }
        return false;

    }
}
