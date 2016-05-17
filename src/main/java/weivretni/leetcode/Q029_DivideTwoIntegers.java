package weivretni.leetcode;//package weivretni.leetcode;
//
///**
// * Divide two integers without using multiplication, division and mod operator.
// *
// * 注意： 1. 用 加法 会 超时。只能用 位运算 2.
// *
// * @author gzhang
// *
// */
//public class Q029_DivideTwoIntegers {
//
//    public int divide(int dividend, int divisor) {
//
//        if (dividend == 0) {
//            return 0;
//        }
//
//        boolean negative = false;
//
//        if ((dividend < 0 && divisor > 0) || (dividend > 0 && divisor < 0)) {
//            negative = true;
//        }
//x
//        long result = 0;
//        long large = convertToLong(dividend);
//        long small = convertToLong(divisor);
//
//        if (small == large) {
//            return negative ? -1 : 1;
//        }
//
//        long remainning = large;
//
//        while (remainning >= small) {
//
//            if (remainning <= (small + small)) {
//                result += 1l;
//                break;
//            }
//
//            while (remainning > small) {
//                result += 2l;
//                small <<= 1;
//            }
//
//            result -= 2;
//            small >>= 1;
//
//            remainning = remainning - small;
//            small = convertToLong(divisor);
//        }
//
//        int resultInt = result > Integer.MAX_VALUE ?  Integer.MAX_VALUE : (int)result;
//
//        return negative ? resultInt * -1 : resultInt;
//    }
//
//    private long convertToLong(int i) {
//        long result = (long) i;
//        if (result < 0) {
//            result = result * -1;
//        }
//
//        return result;
//    }
//
//}
