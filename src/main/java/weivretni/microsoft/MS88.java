package weivretni.microsoft;

/**
 * <pre>
 * 88.2005 年11 月金山笔试题。编码完成下面的处理函数。
 * 函数将字符串中的字符'*'移到串的前部分，前面的非'*'字符后移，
 * 但不能改变非'*'字符的先后顺序，函数返回串中字符'*'的数量。如原始串为：ab**cd**e*12，
 * 处理后为*****abcde12，函数并返回值为5。（要求使用尽量少的时间和辅助空间）
 * </pre>
 * 
 * @author gzhang
 * 
 */
public class MS88 {

    private void swap(char[] a, int i, int j) {
        char tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

    public int count(char[] input) {
        int count = 0;

        int i = input.length - 1; // point to non-*
        int j = i; // point to *

        while (i >= 0) {
            if (input[i] == '*') {
                i--;
                count++;
            } else {
                swap(input, i--, j--);
            }
        }
        return count;

    }
}
