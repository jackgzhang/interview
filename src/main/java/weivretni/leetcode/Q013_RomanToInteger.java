package weivretni.leetcode;

/**
 * Given a roman numeral, convert it to an integer.
 * 
 * Input is guaranteed to be within the range from 1 to 3999.
 * 
 * @author gzhang
 *
 */
public class Q013_RomanToInteger {

    public int romanToInt(String s) {
        String[] symbols = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
        int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };

        int value = 0;

        while (s.length() > 0) {
            for (int i = 0; i < symbols.length; i++) {
                if (s.startsWith(symbols[i])) {
                    value += values[i];
                    s = s.substring(symbols[i].length());
                }
            }
        }
        return value;
    }
}
