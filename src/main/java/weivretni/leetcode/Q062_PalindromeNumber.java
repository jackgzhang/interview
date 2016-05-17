package weivretni.leetcode;

/**
 * Determine whether an integer is a palindrome. Do this without extra space.
 * 
 * 
 * @author gzhang
 *
 */
public class Q062_PalindromeNumber {

    public boolean isPalindrome(int x) {
        if (x < 0)
            return false;

        int div = 1;
        while (x / div >= 10) {
            div *= 10;
        }

        while (x != 0) {
            int l = x / div;
            int r = x % 10;
            if (l != r)
                return false;

            x = (x % div) / 10;
            div = div / 100;
        }

        return true;
    }
}
