package weivretni.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * <pre>
 * Given two words (start and end), and a dictionary, find all shortest transformation 
 * sequence(s) from start to end, such that:
 * 
 * Only one letter can be changed at a time
 * Each intermediate word must exist in the dictionary
 * For example,
 * 
 * Given:
 * start = "hit"
 * end = "cog"
 * dict = ["hot","dot","dog","lot","log"]
 * Return
 *   [
 *     ["hit","hot","dot","dog","cog"],
 *     ["hit","hot","lot","log","cog"]
 *   ]
 * </pre>
 *
 */
public class Q126_WordLadderII {

    List<List<String>> result = new ArrayList<List<String>>();

    public List<List<String>> findLadders(String start, String end, Set<String> dict) {
        result = new ArrayList<List<String>>();

        List<String> currPath = new ArrayList<String>();
        currPath.add(start);

        dict.add(end);
        helper(currPath, dict, end);

        return result;
    }

    private void helper(List<String> currPath, Set<String> currDict, String end) {
        // The last one of the path
        String currWord = currPath.get(currPath.size() - 1);
        Set<String> nextWords = getNextStepWord(currWord, currDict);
        if (nextWords.contains(end)) {
            // Found it
            currPath.add(end);
            result.add(new ArrayList<String>(currPath));
        } else {
            // Goto the next level
            for (String nextWord : nextWords) {
                currPath.add(nextWord);
                currDict.remove(nextWord);
                helper(currPath, currDict, end);
                currPath.remove(currPath.size() - 1);
                currDict.add(nextWord);
            }
        }

    }

    private Set<String> getNextStepWord(String word, Set<String> dict) {
        Set<String> words = new HashSet<String>();
        for (int i = 0; i < word.length(); i++) {
            char[] currCharArr = word.toCharArray();
            for (char c = 'a'; c <= 'z'; c++) {
                currCharArr[i] = c;
                String newWord = new String(currCharArr);
                if (dict.contains(newWord)) {
                    words.add(newWord);
                }
            }
        }

        return words;
    }
}
