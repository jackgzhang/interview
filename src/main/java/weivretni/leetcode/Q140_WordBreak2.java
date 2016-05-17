package weivretni.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * <pre>
 * Given a string s and a dictionary of words dict, add spaces in s to construct a sentence 
 * 
 * where each word is a valid dictionary word.
 * 
 * Return all such possible sentences.
 * 
 * For example, given
 * s = "catsanddog",
 * dict = ["cat", "cats", "and", "sand", "dog"].
 * 
 * A solution is ["cats and dog", "cat sand dog"].
 * </pre>
 * 
 * @author gzhang
 *
 */
public class Q140_WordBreak2 {

    private List<String> result = new ArrayList<String>();

    public List<String> wordBreak(String s, Set<String> dict) {
        if (s.length() > 0 && (dict == null || dict.size() == 0)) {
            return null;
        } else {
            result = new ArrayList<String>();

            breakable(s, dict, "");

            return result;
        }
    }

    private void breakable(String s, Set<String> dict, String currResult) {
        if (s.length() == 0) {
            result.add(currResult);
        } else {
            for (String word : dict) {
                if (s.startsWith(word)) {
                    String newResult = currResult + " " + word;
                    breakable(s.substring(word.length()), dict, newResult);
                }
            }
        }
    }
}
