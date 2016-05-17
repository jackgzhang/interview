package weivretni.leetcode;

import java.util.Set;

/**
 * <pre>
 * Given a string s and a dictionary of words dict, determine if s can be segmented into a
 * space-separated sequence of one or more dictionary words.
 *
 * For example, given
 * s = "leetcode",
 * dict = ["leet", "code"].
 *
 * Return true because "leetcode" can be segmented as "leet code".
 * </pre>
 * <p/>
 * http://www.programcreek.com/2012/12/leetcode-solution-word-break/
 * http://fisherlei.blogspot.com/2013/11/leetcode-word-break-solution.html
 * <p/>
 * <pre>
 * 一个DP问题。定义possible[i] 为S字符串上[0,i]的子串是否可以被segmented by dictionary.
 *
 * 那么
 *
 * possible[i] = true      if  S[0,i]在dictionary里面
 *
 *                 = true      if   possible[k] == true 并且 S[k+1,j]在dictionary里面， 0<k<i
 *
 *                = false      if    no such k exist.
 * </pre>
 *
 * @author gzhang
 */
public class Q139_WordBreak {

    public boolean wordBreak(String s, Set<String> dict) {
        boolean t[] = new boolean[s.length() + 1];
        t[0] = true;

        for (int i = 0; i < s.length(); i++) {
            if (! t[i]) continue;   // Skip whatever is false

            for (String word: dict) {
                int len = word.length();
                int end = i + len;
                if (end <= s.length()) {
                    if (s.substring(i, end).equals(word)) {
                        t[end] = true;
                    }
                }
            }
        }

        return t[s.length()];
    }

}
