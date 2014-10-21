package other;

import junit.framework.Assert;

/**
 * http://www.leetcode.com/2012/01/palindrome-number.html
 * 
 * 
 * 
 * @author gzhang
 * 
 */
public class Palindrome {

    public static void main(String[] args) {
        Palindrome p = new Palindrome();
        Assert.assertEquals(true, p.isPalindrome(""));
        Assert.assertEquals(true, p.isPalindrome("a"));
        Assert.assertEquals(false, p.isPalindrome("ab"));
        Assert.assertEquals(true, p.isPalindrome("aba"));
        Assert.assertEquals(false, p.isPalindrome("abac"));
    }

    /**
     * Determine whether an integer is a palindrome. Do this without extra space.
     * 
     * @param x
     * @return
     */
    public boolean isPalindrome(int x) {
        return false;
    }

    /**
     * Determine whether a string is a palindrome. Do this without extra space.
     * 
     * @param x
     * @return
     */
    public boolean isPalindrome(String s) {
        boolean isPalindrome = true;
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                isPalindrome = false;
            }
        }

        return isPalindrome;
    }

}
