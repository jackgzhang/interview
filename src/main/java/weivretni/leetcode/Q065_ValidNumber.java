package weivretni.leetcode;

/**
 * <pre>
 * Validate if a given string is numeric.
 * 
 * Some examples:
 * 
 * "0" => true
 * " 0.1 " => true
 * "abc" => false
 * "1 a" => false
 * "2e10" => true
 * 
 * Note: It is intended for the problem statement to be ambiguous. 
 * 
 * You should gather all requirements up 
 * 
 * front before implementing one.
 * 
 * 
 * </pre>
 * 
 * http://jelices.blogspot.com/2013/12/leetcode-valid-number.html
 * http://www.eecg.toronto.edu/~jzhu/csc467/readings/Lec4.pdf
 * 
 * @author gzhang
 *
 */
public class Q065_ValidNumber {

    public boolean isNumber(String s) {
        int i = 0;
        while (i < s.length() && (Character.isWhitespace(s.charAt(i)) || s.charAt(i) == '+' || s.charAt(i) == '-')) {
            i++;
        }

        int numberOfdots = 0;
        int numberOfe = 0;
        while (i < s.length() && !Character.isWhitespace(s.charAt(i))) {
            int c = s.charAt(i);
            if (c == '.') {

                // 2.2.2 is false
                if (numberOfdots > 1) {
                    return false;
                } else {
                    numberOfdots++;
                }

                // .23423 is false
                if (i == 0 || (i > 0 && !Character.isDigit(s.charAt(i - 1)))) {
                    return false;
                }
            }

            if (!Character.isDigit(c) && c != '.') {
                if (c != 'e') {
                    return false;
                } else {
                    if (numberOfe > 0) {
                        return false;
                    }

                    if (i == s.length() - 1 || (i > 0 && !Character.isDigit(s.charAt(i - 1)))) {
                        return false;
                    }

                    numberOfe++;
                }
            }
            i++;
        }

        while (i < s.length()) {
            if (!Character.isWhitespace(s.charAt(i++))) {
                return false;
            }
        }

        return true;
    }
}
