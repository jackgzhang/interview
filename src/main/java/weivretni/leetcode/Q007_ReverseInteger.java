package weivretni.leetcode;

/**
 * <pre>
 * Reverse digits of an integer.
 * 
 * Example1: x = 123, return 321
 * Example2: x = -123, return -321
 * </pre>
 * 
 * <pre>
 * // -2147483648
 * //  2147483647
 * </pre>
 * 
 * @author gzhang
 * 
 */
public class Q007_ReverseInteger {

    public int reverse(int x) {

        int ret = 0;
        while (x != 0) {
            // handle overflow/underflow
            if (Math.abs(ret) > Integer.MAX_VALUE / 10) {
                return 0;
            }
            ret = ret * 10 + x % 10;
            x /= 10;
        }
        return ret;
    }
}
