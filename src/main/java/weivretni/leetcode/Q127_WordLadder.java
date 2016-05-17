package weivretni.leetcode;

import java.util.*;

/**
 * <pre>
 * Given two words (start and end), and a dictionary, find the length of shortest transformation sequence
 * 
 *  from start to end, such that:
 * 
 * Only one letter can be changed at a time
 * Each intermediate word must exist in the dictionary
 * For example,
 * 
 * Given:
 * start = "hit"
 * end = "cog"
 * dict = ["hot","dot","dog","lot","log"]
 * As one shortest transformation is "hit" -> "hot" -> "dot" -> "dog" -> "cog",
 * return its length 5.
 * 
 * Note:
 * Return 0 if there is no such transformation sequence.
 * All words have the same length.
 * All words contain only lowercase alphabetic characters.
 * </pre>
 * 
 * @author gzhang
 *
 */
public class Q127_WordLadder {

    class Node {
        List<String> path = new ArrayList<>();
        Set<String> remains = new HashSet<>();
    }

    public int ladderLength(String beginWord, String endWord, Set<String> wordList) {
        wordList.add(endWord);
        Node node = new Node();
        node.path.add(beginWord);
        node.remains.addAll(wordList);

        Queue<Node> queue = new LinkedList<>();
        queue.add(node);

        while (!queue.isEmpty()) {
            node = queue.remove();
            Set<String> remains = node.remains;
            for (String word : remains) {
                String lastPath = node.path.get(node.path.size() - 1);

                if (isChangeable(lastPath, word)) {
                    // Create a new node
                    Node newNode = new Node();
                    newNode.path.addAll(node.path);
                    newNode.path.add(word);
                    newNode.remains.addAll(remains);
                    newNode.remains.remove(word);

                    queue.add(newNode);

                    // Found it !
                    if (word.equals(endWord)) {
                        return node.path.size();
                    }
                }
            }
        }

        return 0;
    }

    private boolean isChangeable(String s1, String s2) {
        if (s1.length() == s2.length()) {
            int diffCount = 0;
            for (int i = 0 ;i < s1.length() ; i++) {
                if (s1.charAt(i) != s2.charAt(i)) {
                    diffCount ++;
                }
            }
            return diffCount == 1;
        }else{
            return false;
        }
    }
}
