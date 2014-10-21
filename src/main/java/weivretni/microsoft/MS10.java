package weivretni.microsoft;

/**
 * <pre>
 * ��10��
 * ---------------------------------
 * ��ת�����е��ʵ�˳��
 * ��Ŀ������һ��Ӣ�ľ��ӣ���ת�����е��ʵ�˳�򣬵��������ַ���˳�򲻱䡣�����е����Կո��������
 * Ϊ������������ź���ͨ��ĸһ������
 * �������롰I am a student.�����������student. a am I����
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
