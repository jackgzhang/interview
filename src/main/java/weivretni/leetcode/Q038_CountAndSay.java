package weivretni.leetcode;

/**
 * <pre>
 * The count-and-say sequence is the sequence of integers beginning as follows:
 * 1, 11, 21, 1211, 111221, ...
 * 
 * 1 is read off as "one 1" or 11.
 * 11 is read off as "two 1s" or 21.
 * 21 is read off as "one 2, then one 1" or 1211.
 * Given an integer n, generate the nth sequence.
 * 
 * Note: The sequence of integers will be represented as a string.
 * </pre>
 * 
 * 
 * <pre>
 * 
 * 题目说的实在是太不明白了。。。
 * 
 * 解释一下就是，输入n，那么我就打出第n行的字符串。
 * 
 * 怎么确定第n行字符串呢？他的这个是有规律的。
 * 
 * n = 1时，打印一个1。
 * 
 * n = 2时，看n=1那一行，念：1个1，所以打印：11。
 * 
 * n = 3时，看n=2那一行，念：2个1，所以打印：21。
 * 
 * n = 4时，看n=3那一行，念：一个2一个1，所以打印：1211。
 * 
 * 以此类推。(注意这里n是从1开始的）
 * </pre>
 * 
 * 
 * @author gzhang
 * 
 */
public class Q038_CountAndSay {

    public String countAndSay(int n) {
        if (n <= 0) {
            return null;
        }

        if (n == 1) {
            return "1";
        }

        String currResult = "1";

        for (int i = 1; i < n; i++) {
            currResult = readIt(currResult);
        }

        return currResult;

    }

    private String readIt(String n) {

        String result = "";

        String str = String.valueOf(n);
        str += "a";

        int counter = 1;
        char counterValue = str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == counterValue) {
                counter++;
            } else {
                result += counter + "" + counterValue;
                counter = 1;
                counterValue = str.charAt(i);
            }
        }

        return result;
    }
}
