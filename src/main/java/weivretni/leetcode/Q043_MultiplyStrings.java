package weivretni.leetcode;//package weivretni.leetcode;
//
///**
// * <pre>
// * Given two numbers represented as strings, return multiplication of the numbers as a string.
// *
// * Note: The numbers can be arbitrarily large and are non-negative.
// * </pre>
// *
// * https://leetcodenotes.wordpress.com/2013/10/20/leetcode-multiply-strings-%E5%A4%A7%E6%95%B4%E6%95
// * %B0%E7%9A%84%E5%AD%97%E7%AC%A6%E4%B8%B2%E4%B9%98%E6%B3%95/comment-page-1/#comment-122
// *
// * @author gzhang
// *
// */
//public class Q043_MultiplyStrings {
//
//    public String multiply(String num1, String num2) {
//        num1 = new StringBuilder(num1).reverse().toString();
//        num2 = new StringBuilder(num2).reverse().toString();
//
//        x
//        // even 99 * 99 is < 10000, so maximaly 4 digits
//        int[] d = new int[num1.length() + num2.length()];
//
//        // calc
//        for (int i = 0; i < num1.length(); i++) {
//            int a = num1.charAt(i) - '0';
//            for (int j = 0; j < num2.length(); j++) {
//                int b = num2.charAt(j) - '0';
//                d[i + j] += a * b;
//            }
//        }
//
//        // format result
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < d.length; i++) {
//            int digit = d[i] % 10;
//            int carry = d[i] / 10;
//            sb.insert(0, digit);
//            if (i < d.length - 1)
//                d[i + 1] += carry;
//        }
//        // trim starting zeros
//        while (sb.length() > 0 && sb.charAt(0) == '0') {
//            sb.deleteCharAt(0);
//        }
//        return sb.length() == 0 ? "0" : sb.toString();
//    }
//}
