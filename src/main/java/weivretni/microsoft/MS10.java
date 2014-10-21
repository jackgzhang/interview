package weivretni.microsoft;

/**
 * <pre>
 * 第10题
 * ---------------------------------
 * 翻转句子中单词的顺序。
 * 题目：输入一个英文句子，翻转句子中单词的顺序，但单词内字符的顺序不变。句子中单词以空格符隔开。
 * 为简单起见，标点符号和普通字母一样处理。
 * 例如输入“I am a student.”，则输出“student. a am I”。
 * </pre>
 * 
 * @author gzhang
 * 
 */
public class MS10 {

    private void reverse(char[] str, int i, int j) {
        while (i < j) {
            char tmp = str[i];
            str[i] = str[j];
            str[j] = tmp;

            i++;
            j--;
        }
    }

    public char[] reverse(char[] str) {
        // reverse whole thing
        reverse(str, 0, str.length - 1);

        // reverse word
        int i = 0;
        int j = 0;
        while (j < str.length) {
            while (j < str.length && str[j] != ' '  ) {
                j++;
            }

            reverse(str, i, j - 1);
            j++;
            i = j;
        }

        return str;
    }
}
