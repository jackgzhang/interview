package weivretni.leetcode;

/**
 * <pre>
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
 * 
 * For example,
 * "A man, a plan, a canal: Panama" is a palindrome.
 * "race a car" is not a palindrome.
 * 
 * Note:
 * Have you consider that the string might be empty? This is a good question to ask during an interview.
 * 
 * For the purpose of this problem, we define empty string as valid palindrome.
 * </pre>
 * 
 * @author gzhang
 *
 */
public class Q125_ValidPalindrome {

    boolean isChar(char c) {
        return ((c <= 'z' && c >= 'a') || (c <= 'Z' && c >= 'A') || (c >= '0' && c <= '9'));
    }

    public boolean isPalindrome(String s) {
        if (s.length() <= 1) {
            return true;
        } else {
            int i = 0;
            int j = s.length() - 1;
            while (i < j) {

                if (! isChar(s.charAt(i))) {
                    i++;
                } else if (!isChar(s.charAt(j))) {
                    j--;
                } else {
                    if (s.charAt(i) == s.charAt(j) || Math.abs(s.charAt(i) - s.charAt(j)) == Math.abs('Z' - 'z')) {
                        // continue
                        i++;
                        j--;
                    } else {
                        break;
                    }
                }

            }

            return (i >= j);
        }
    }
}
