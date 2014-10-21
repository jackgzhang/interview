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
public class Q004_AddBinary {

    public String addBinary(String a, String b) {
        int index = 0;

        int maxLength = Math.max(a.length(), b.length()) + 1;

        int[] result = new int[maxLength];

        while (a.length() < maxLength) {
            a = "0" + a;
        }

        while (b.length() < maxLength) {
            b = "0" + b;
        }

        int carry = 0;
        while (index < a.length() && index < b.length()) {
            int ac = a.charAt(a.length() - 1 - index) - 48;
            int bc = b.charAt(b.length() - 1 - index) - 48;

            int tmp = ac + bc + carry;
            if (tmp == 3) {
                result[result.length - index - 1] = 1;
                carry = 1;
            } else if (tmp == 2) {
                result[result.length - index - 1] = 0;
                carry = 1;
            } else {
                result[result.length - index - 1] = tmp;
                carry = 0;
            }

            index++;
        }

        StringBuffer sb = new StringBuffer();
        for (int value : result) {
            sb.append(value);
        }

        String results = sb.toString();
        if (results.startsWith("0")) {
            results = results.substring(1);
        }

        return results;

    }

}
