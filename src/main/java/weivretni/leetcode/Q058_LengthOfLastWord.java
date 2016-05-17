package weivretni.leetcode;

/**
 * <pre>
 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ', 
 * 
 * return the length of last word in the string.
 * 
 * If the last word does not exist, return 0.
 * 
 * Note: A word is defined as a character sequence consists of non-space characters only.
 * 
 * For example, 
 * Given s = "Hello World",
 * return 5.
 * </pre>
 * 
 * @author gzhang
 * 
 */
public class Q058_LengthOfLastWord {

    public int lengthOfLastWord(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        // First, remove the right most space
        int lastEnd = s.length() - 1;
        while (lastEnd >= 0 && s.charAt(lastEnd) == ' ') {
            lastEnd--;
        }

        int lastStart = -1;
        for (int i = lastEnd; i >= 0; i--) {
            char c = s.charAt(i);
            if (c == ' ') {
                lastStart = i;
                break;
            }
        }

        return lastEnd - lastStart;
    }
}
