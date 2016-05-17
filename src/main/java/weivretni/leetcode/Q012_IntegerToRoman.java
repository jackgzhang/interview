package weivretni.leetcode;

/**
 * <pre>
 * Given an integer, convert it to a roman numeral.
 * 
 * Input is guaranteed to be within the range from 1 to 3999.
 * 
 * Rules:
 * 
 * (1) 
 * Symbol  Value
 * I   1
 * V   5
 * X   10
 * L   50
 * C   100
 * D   500
 * M   1,000
 * 
 * (2) the numeral I can be placed before V and X to make 4 units (IV) and 9 units (IX) respectively
 * (3) X can be placed before L and C to make 40 (XL) and 90 (XC) respectively
 * (4) C can be placed before D and M to make 400 (CD) and 900 (CM) according to the same pattern[5]
 * 
 * 
 * 对老中来说，不熟悉罗马数字的规律是个问题。其实就是那么几个符号，然后规律就是1,4,5,9,10然后每次十倍循环。
 * 算法就是给一个数，大于1000的时候就写上一个M, 还大于1000，再写一个M… 终于小于1000了，看看大于900不？，大于500不…如此类推。
 * 
 * /*
 * I = 1;
 * V = 5;
 * X = 10;
 * L = 50;
 * C = 100;
 * D = 500;
 * M = 1000;
 * 
 * </pre>
 * 
 * https://stupidcodergoodluck.wordpress.com/2014/03/31/leetcode-integer-to-roman/
 * 
 * @author gzhang
 *
 */
public class Q012_IntegerToRoman {

    public String intToRoman(int num) {
        String[] symbols = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
        int[] values =     { 1000, 900,  500, 400,  100, 90,   50,  40,   10,  9,    5,   4,    1 };

        StringBuilder ret = new StringBuilder();
        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                ret.append(symbols[i]);
                num -= values[i];
            }
        }
        return new String(ret);
    }
}
