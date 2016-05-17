package weivretni.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <pre>
 * You are given a string, S, and a list of words, L, that are all of the same length. Find all starting 
 * indices of substring(s) in S that is a concatenation of each word in L exactly once and without any 
 * intervening characters.
 * 
 * For example, given:
 * S: "barfoothefoobarman"
 * L: ["foo", "bar"]
 * 
 * You should return the indices: [0,9].
 * (order does not matter).
 * </pre>
 * 
 * @author gzhang
 *
 */
public class Q030_SubstringwithConcatenationofAllWords {

    public List<Integer> findSubstring(String S, String[] L) {

        List<Integer> result = new ArrayList<Integer>();

        if (S.length() <= 0 || L.length <= 0) {
            return result;
        } else {

            int wordLength = L[0].length();
            int wordCount = L.length;

            int start = S.length() - wordLength * wordCount;

            while (start >= 0) {
                Map<String, Integer> map = buildMap(L);

                int index = start;
                while (map.size() > 0 && (index >= 0 && (index) < S.length())) {
                    String currWord = S.substring(index, index + wordLength);
                    if (map.containsKey(currWord)) {
                        int wordAmt = map.get(currWord);
                        wordAmt--;
                        if (wordAmt > 0) {
                            map.put(currWord, wordAmt);
                        } else {
                            map.remove(currWord);
                        }
                    } else {
                        break;
                    }
                    index += wordLength;
                }

                if (map.size() == 0) {
                    result.add(start);
                }

                start -= wordLength;
            }

            return result;
        }
    }

    private Map<String, Integer> buildMap(String[] L) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (String l : L) {
            if (map.containsKey(l)) {
                map.put(l, map.get(l) + 1);
            } else {
                map.put(l, 1);
            }
        }

        return map;
    }
}
