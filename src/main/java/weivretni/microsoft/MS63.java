package weivretni.microsoft;

/**
 * <pre>
 * 在字符串中删除特定的字符
 * 
 * http://www.cnblogs.com/python27/archive/2011/12/13/2286844.html
 * </pre>
 * 
 * @author gzhang
 * 
 */
public class MS63 {

    private boolean exist(char c, char[] remove) {
        for (char i : remove) {
            if (c == i) {
                return true;
            }
        }

        return false;
    }

    public char[] replace(char[] input, char[] remove) {
        int i = 0;
        int j = 0;

        while (j < input.length) {
            while (exist(input[j], remove) && j < input.length) {
                j++;
            }
            
            input[i] = input[j];
            i++;
            j++;
        }
        
        while (i < input.length) {
            input[i] = ' ';
            i++;
        }
        
        return input;
    }
}
