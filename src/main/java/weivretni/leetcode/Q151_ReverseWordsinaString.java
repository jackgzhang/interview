package weivretni.leetcode;

/**
 * <pre>
 * Given an input string, reverse the string word by word.
 * 
 * For example,
 * Given s = "the sky is blue",
 * return "blue is sky the".
 * 
 * click to show clarification.
 * 
 * Clarification:
 * What constitutes a word?  A sequence of non-space characters constitutes a word.
 * Could the input string contain leading or trailing spaces?   Yes. However, your reversed string should not contain leading or trailing spaces.
 * How about multiple spaces between two words?   Reduce them to a single space in the reversed string.
 * </pre>
 * 
 * @author gzhang
 * 
 */
public class Q151_ReverseWordsinaString {

    public String reverseWords(String s) {
        if (s != null && s.length() == 0) {
            return "";
        } else {

            StringBuilder result = new StringBuilder();
            String currWord = "";

            int i = s.length() - 1;
            while (i >= 0) {
                while (i >= 0 && s.charAt(i) == ' ') {
                    i--;
                }

                if (currWord.length() > 0) {
                    if (result.length() > 0) {
                        result.append(" ");
                    }
                    result.append(currWord);
                    currWord = "";
                }

                while (i >= 0 && s.charAt(i) != ' ') {
                    currWord = s.charAt(i--) + currWord;
                }
            }

            if (currWord.length() > 0) {
                result.append(" ").append(currWord);
            }

            return result.toString();
        }
    }

    public String reverseWords2(String s) {
        StringBuilder reversed = new StringBuilder();
        int j = s.length();
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                j = i;
            } else if (i == 0 || s.charAt(i - 1) == ' ') {
                if (reversed.length() != 0) {
                    reversed.append(' ');
                }
                reversed.append(s.substring(i, j));
            }
        }
        return reversed.toString();
    }
}
