package weivretni.geek4geek;

/**
 * http://www.geeksforgeeks.org/longest-palindrome-substring-set-1/
 * 
 * 
 * 
 * <pre>
 * Given a string, find the longest substring which is palindrome. 
 * For example, if the given string is �forgeeksskeegfor�, 
 * the output should be �geeksskeeg�.
 * </pre>
 * 
 * Transform following: Add special character to wrap each charcater
 * 
 * <pre>
 * 
 * abc -> #a#b#c#
 * 
 * </pre>
 * 
 * Then span from center.
 * 
 * @see http://www.felix021.com/blog/read.php?2040
 * @see http://leetcode.com/2011/11/longest-palindromic-substring-part-ii.html
 * 
 * 
 * 
 * @author gzhang
 * 
 */
public class Question_DP_LongestPalindromicSubstring {

    private String result = "";

    private String wrap(String s) {
        String result = "#";
        for (int i = 0; i < s.length(); i++) {
            result += s.charAt(i) + "#";
        }

        return result;
    }

    private int checkPalindromFromCenter(String str, int center) {
        int result = 0;

        if (center == 0 || center == str.length() - 1)
            return result;

        int leftPos = center;
        int rightPos = center;
        for (int i = 0; i < str.length() / 2; i++) {
            leftPos--;
            rightPos++;
            if (leftPos >= 0 && rightPos <= (str.length() - 1)) {
                if (str.charAt(leftPos) == str.charAt(rightPos)) {
                    result++;
                } else {
                    break;
                }
            } else {
                break;
            }
        }

        return result;
    }

    public String doIt(String str) {

        String str2 = wrap(str);

        int max = 0;
        int pos = 0;
        for (int i = 0; i < str2.length(); i++) {
            int maxSofar = checkPalindromFromCenter(str2, i);
            if (max < maxSofar) {
                max = maxSofar;
                pos = i;
            }
        }

        if (pos == pos / 2 * 2) {
            return str.substring(pos / 2 - max / 2, pos / 2 + max / 2);
        } else {
            return str.substring(pos / 2 - max / 2, pos / 2 + max / 2 + 1);
        }

    }
}
