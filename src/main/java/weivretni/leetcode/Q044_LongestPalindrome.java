package weivretni.leetcode;

public class Q044_LongestPalindrome {

    public String longestPalindrome(String s) {

        if (s.length() <= 1) {
            return s;
        }

        String middle = "";
        if (s.charAt(0) == s.charAt(s.length() - 1)) {
            String isPalindrome = longestPalindrome(s.substring(1, s.length() - 1));
            if (isPalindrome.equals(s.substring(1, s.length() - 1))) {
                middle = s.charAt(0) + isPalindrome + s.charAt(0);
            }
        }
        String left = longestPalindrome(s.substring(0, s.length() - 1));
        String right = longestPalindrome(s.substring(1, s.length()));

        return getMax(left, right, middle);
    }

    private String getMax(String s1, String s2, String s3) {
        if (s1.length() >= s2.length() && s1.length() >= s3.length()) {
            return s1;
        }

        if (s2.length() >= s1.length() && s2.length() >= s3.length()) {
            return s2;
        }
        return s3;
    }
}
