package weivretni.leetcode;

/**
 * <pre>
 * Given two binary strings, return their sum (also a binary string).
 * 
 * For example,
 * a = "11"
 * b = "1"
 * Return "100".
 * </pre>
 * 
 * @author gzhang
 * 
 */
public class Q067_AddBinary {

    public String addBinary(String a, String b) {
        String result = "";
        String longer = (a.length() > b.length()) ? a : b;
        String shorter = (a.length() > b.length()) ? b : a;

        int i = longer.length() - 1;
        int j = shorter.length() - 1;
        int carriage = 0;
        while (i >= 0) {

            char char1 = longer.charAt(i);
            char char2 = ' ';
            if (j < 0) {
                char2 = '0';
            } else {
                char2 = shorter.charAt(j);
            }

            int currResult = (char1 - '0') + (char2 - '0') + carriage;
            if (currResult == 0) {
                carriage = 0;
                result = '0' + result;
            } else if (currResult == 1) {
                carriage = 0;
                result = '1' + result;
            } else if (currResult == 2) {
                carriage = 1;
                result = '0' + result;
            } else {
                carriage = 1;
                result = '1' + result;
            }

            i--;
            j--;

        }

        if (carriage == 1) {
            result = '1' + result;
        }

        return result;
    }
}
