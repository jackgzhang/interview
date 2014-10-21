package weivretni.microsoft;

/**
 * <pre>
 * ��17�⣺
 * ��Ŀ����һ���ַ������ҵ���һ��ֻ����һ�ε��ַ���������abaccdeff�������b��   
 * �������������2006��google��һ�������⡣
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
