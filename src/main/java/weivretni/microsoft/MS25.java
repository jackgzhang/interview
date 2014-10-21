package weivretni.microsoft;

/**
 * <pre>
 * 第25题：
 * 写一个函数,它的原形是int continumax(char *outputstr,char *intputstr)
 * 功能：
 * 在字符串中找出连续最长的数字串，并把这个串的长度返回，
 * 并把这个最长数字串付给其中一个函数参数outputstr所指内存。
 * 例如："abcd12345ed125ss123456789"的首地址传给intputstr后，函数将返回9，
 * outputstr所指的值为123456789
 * </pre>
 * 
 * @author gzhang
 * 
 */
public class MS25 {

    public String findMax(String str) {

        String result = "";

        int p0 = 0;
        int p1 = 0;

        do {
            while (!Character.isDigit(str.charAt(p0)) && p0 < str.length() - 1) {
                p0++;
            }

            if (p0 == str.length() - 1) {
                break;
            }

            p1 = p0 + 1;
            char p1char = str.charAt(p1);
            char p0char = str.charAt(p0);
            int p1charint = (int) p1char;
            int p0charint = (int) p0char;
            int ptmp = p0charint;
            while (Character.isDigit(p1char) && p1charint == ptmp + 1 && p1 < str.length() - 1) {
                p1++;
                ptmp = (int) str.charAt(p1 - 1);
                p1charint = (int) str.charAt(p1);
            }

            if (result.length() < (p1 - p0)) {
                result = str.substring(p0, p1);
            }

            p0 = p1;
        } while (p0 <= str.length() - 1);

        return result;
    }
}
