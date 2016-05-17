package weivretni.leetcode;//package weivretni.leetcode;
//
//import java.util.HashMap;
//import java.util.Map;
//
///**
// * <pre>
// * '?' Matches any single character.
// * '*' Matches any sequence of characters (including the empty sequence).
// *
// * The matching should cover the entire input string (not partial).
// *
// * The function prototype should be:
// * bool isMatch(const char *s, const char *p)
// *
// * Some examples:
// * isMatch("aa","a") → false
// * isMatch("aa","aa") → true
// * isMatch("aaa","aa") → false
// * isMatch("aa", "*") → true
// * isMatch("aa", "a*") → true
// * isMatch("ab", "?*") → true
// * isMatch("aab", "c*a*b") → false
// * </pre>
// *
// * http://shmilyaw-hotmail-com.iteye.com/blog/2154716
// *
// * 解法一
// *
// * DP,  fast
// *
// * 解法二
// *
// * recursive.  Slow
// *
// */
//public class Q044_WildcardMatching {
//
//    Map<String, Boolean> dp = new HashMap<String, Boolean>();
//
//    public boolean isMatch(String s, String p) {
//        dp = new HashMap<String, Boolean>();
//        return helper(s, p);
//    }
//x
//    public boolean helper(String s, String p) {
//        if (s.equals("") && p.equals("")) {
//            return true;
//        } else if ((s.equals("") && !p.equals("") || (!s.equals("") && p.equals("")))) {
//            return false;
//        } else {
//
//            if (dp.containsKey(getKey(s, p))) {
//                return dp.get(getKey(s, p));
//            }
//
//            boolean result = false;
//
//            if (p.startsWith("?")) {
//                result = helper(s.substring(1), p.substring(1));
//            } else if (p.startsWith("*")) {
//                for (int i = 0; i <= s.length(); i++) {
//
//                    if (helper(s.substring(i), p.substring(1))) {
//                        result = true;
//                        break;
//                    }
//
//                }
//
//            } else {
//                result = s.charAt(0) == p.charAt(0) && helper(s.substring(1), p.substring(1));
//            }
//
//            dp.put(getKey(s, p), result);
//            return result;
//        }
//    }
//
//    private String getKey(String s, String p) {
//        return s + "-" + p;
//    }
//
//
//    // ============== 解法二 ==============
//    public boolean isMatch2(String s, String p) {
//        if (p.length() == 0) {
//            return !(s.length() > 0);
//        } else {
//            if (p.equals("*")) {
//                return true;
//            } else if (p.equals("?")) {
//                return p.length() == 1;
//            } else {
//                if (p.startsWith("?")) {
//                    if (s.length() > 0) {
//                        return isMatch(s.substring(1), p.substring(1));
//                    } else {
//                        return false;
//                    }
//                } else if (p.startsWith("*")) {
//
//                    boolean isMatch = false;
//
//                    for (int i = 0; i < s.length(); i++) {
//                        isMatch = isMatch(s.substring(i), p.substring(1)) || isMatch ;
//                    }
//
//                    return isMatch;
//
//                } else {
//                    if (p.charAt(0) == s.charAt(0)) {
//                        return isMatch(s.substring(1), p.substring(1));
//                    } else {
//                        return false;
//                    }
//                }
//            }
//        }
//    }
//}
