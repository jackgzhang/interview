package weivretni.microsoft;

/**
 * <pre>
 * 第17题：
 * 题目：在一个字符串中找到第一个只出现一次的字符。如输入abaccdeff，则输出b。   
 * 分析：这道题是2006年google的一道笔试题。
 * </pre>
 * 
 * @author gzhang
 * 
 */
public class MS17 {

    public char find(char[] input) {
        int[] location = new int[256];

        for (char a : input) {
            int loc = Character.getNumericValue(a);
            location[loc]++;
        }

        for (char a : input) {
            int loc = Character.getNumericValue(a);
            if (location[loc] == 1) {
                return a;
            }
        }

        return ' ';
    }
}
