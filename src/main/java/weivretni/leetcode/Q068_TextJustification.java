package weivretni.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <pre>
 * Given an array of words and a length L, format the text such that each line has exactly L characters and
 * 
 * is fully (left and right) justified.
 * 
 * You should pack your words in a greedy approach; that is, pack as many words as you can in each line. 
 * 
 * Pad extra spaces ' ' when necessary so that each line has exactly L characters.
 * 
 * Extra spaces between words should be distributed as evenly as possible. If the number of spaces on a 
 * 
 * line do not divide evenly between words, the empty slots on the left will be assigned more spaces than 
 * 
 * the slots on the right.
 * 
 * For the last line of text, it should be left justified and no extra space is inserted between words.
 * 
 * For example,
 * words: ["This", "is", "an", "example", "of", "text", "justification."]
 * L: 16.
 * 
 * Return the formatted lines as:
 * [
 *    "This    is    an",
 *    "example  of text",
 *    "justification.  "
 * ]
 * </pre>
 *
 */
public class Q068_TextJustification {

    public List<String> fullJustify(String[] words, int L) {
        List<String> result = new ArrayList<String>();
        if (L == 0) {
            return Arrays.asList(words);
        } else {
            List<String> currLine = new ArrayList<String>();

            for (String word : words) {

                currLine.add(word);

                if (getCurrLength(currLine) > L) {
                    currLine.remove(currLine.size() - 1);
                    result.add(tweak(currLine, false, L));

                    currLine.clear();
                    currLine.add(word);
                }
            }

            if (currLine.size() > 0) {
                result.add(tweak(currLine, true, L));
            }

            return result;
        }
    }

    private String tweak(List<String> words, boolean lastLine, int L) {
        int spaceLength = 1;
        if (!lastLine) {
            int length = 0;
            for (String word : words) {
                length += word.length();
            }

            if (words.size() == 1) {
                spaceLength = 0;
            } else {
                spaceLength = (L - length) / (words.size() - 1);
            }
        }

        int totalLength = words.get(0).length();

        StringBuilder sb = new StringBuilder(words.get(0));
        for (int i = 1; i < words.size(); i++) {
            if (i == words.size() - 1) {
                sb.append(generateSpaces(L - totalLength - words.get(i).length()));
            } else {
                sb.append(generateSpaces(spaceLength));
                totalLength += spaceLength;
            }
            sb.append(words.get(i));
            totalLength += words.get(i).length();
        }

        sb.append(generateSpaces(L - totalLength));

        return sb.toString();
    }

    private int getCurrLength(List<String> words) {
        int length = 0;
        for (String word : words) {
            length += word.length();
        }
        length += words.size() - 1;
        return length;
    }

    private String generateSpaces(int length) {
        if (length < 1)
            return "";
        StringBuilder res = new StringBuilder();
        while (length > 0) {
            res.append(" ");
            length--;
        }
        return res.toString();
    }
}
