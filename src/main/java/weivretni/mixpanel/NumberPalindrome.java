package weivretni.mixpanel;

/**
 * http://leetcode.com/2012/01/palindrome-number.html
 * 
 * <p>
 * 
 * test if an integer is a "number palindrome"
 * 
 * @author gzhang
 * 
 */
public class NumberPalindrome {

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int maxDigit = 1;
        while (x / maxDigit >= 10) {
            maxDigit *= 10;
        }

        // / 595, 100

        while (x >= 10) {
            int left = x / maxDigit; // 5
            int right = x % 10; // 5

            if (left != right) {
                return false;
            } else {
                x = x - (x / maxDigit * maxDigit);
                x = x / 10;
                maxDigit = maxDigit / 100;
            }
        }

        return true;
    }
}
