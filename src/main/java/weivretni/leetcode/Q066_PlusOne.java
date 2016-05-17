package weivretni.leetcode;

/**
 * Given a non-negative number represented as an array of digits, plus one to the number.
 * 
 * The digits are stored such that the most significant digit is at the head of the list.
 * 
 * @author gzhang
 * 
 */
public class Q066_PlusOne {

    public int[] plusOne(int[] digits) {
        if (digits == null || digits.length == 0) {
            return null;
        } else {
            int[] ans = new int[digits.length + 1];

            int carriage = 1;
            for (int i = digits.length - 1; i >= 0; i--) {
                int result = digits[i] + carriage;
                carriage = result >= 10 ? 1 : 0;
                ans[i + 1] = result >= 10 ? result - 10 : result;
            }
            ans[0] = carriage;

            if (ans[0] > 0) {
                return ans;
            } else {
                int[] ans1 = new int[digits.length];
                System.arraycopy(ans, 1, ans1, 0, digits.length);
                return ans1;
            }
        }
    }
}
