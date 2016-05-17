package weivretni.leetcode;

/**
 * <pre>
 * Implement atoi to convert a string to an integer.
 * 
 * Hint: Carefully consider all possible input cases. If you want a challenge, 
 * 
 * please do not see below and ask yourself what are the possible input cases.
 * 
 * Notes: It is intended for this problem to be specified vaguely (ie, no given input specs). 
 * 
 * You are responsible to gather all the input requirements up front.
 * 
 * 
 * Requirements for atoi:
 * The function first discards as many whitespace characters as necessary until the 
 * 
 * first non-whitespace character is found. Then, starting from this character, 
 * 
 * takes an optional initial plus or minus sign followed by as many numerical 
 * 
 * digits as possible, and interprets them as a numerical value.
 * 
 * The string can contain additional characters after those that form the integral number, 
 * 
 * which are ignored and have no effect on the behavior of this function.
 * 
 * If the first sequence of non-whitespace characters in str is not a valid integral number, 
 * 
 * or if no such sequence exists because either str is empty or it contains only whitespace 
 * 
 * characters, no conversion is performed.
 * 
 * If no valid conversion could be performed, a zero value is returned. If the 
 * 
 * correct value is out of the range of representable values, INT_MAX (2147483647) or 
 * 
 * INT_MIN (-2147483648) is returned.
 * </pre>
 * 
 * <pre>
 * To deal with overflow, inspect the current number before multiplication. 
 * 
 * If the current number is greater than Integer.MAX_VALUE/10, we know it is going to overflow. On the other hand, 
 * 
 * if the current number is equal to 214748364, 
 * 
 * we know that it will overflow only when the current digit is greater than or equal to 8. *
 * </pre>
 * 
 * @author gzhang
 *
 */
public class Q008_StringToInteger {

    public int atoi(String str) {
        int i = 0;
        int result = 0;
        int sign = 1;
        while (i < str.length() && Character.isWhitespace(str.charAt(i))) {
            i++;
        }

        while (i < str.length() && !Character.isDigit(str.charAt(i))) {
            if (str.charAt(i) == '-') {
                sign = -1;
            }
            i++;
        }

        while (i < str.length() && Character.isDigit(str.charAt(i))) {
            int num = Character.getNumericValue(str.charAt(i));
            if (result > Integer.MAX_VALUE / 10 || result == Integer.MAX_VALUE / 10 && num >= 8) {
                return sign > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result * 10 + num;
            i++;
        }

        return result * sign;
    }
}
