package weivretni.microsoft;

/**
 * <pre>
 * 28.�����Ķ����Ʊ�ʾ��1�ĸ���
 * ��Ŀ������һ����������������Ķ����Ʊ�����ж��ٸ�1��
 * ��������10������������Ʊ�ʾΪ1010��������1��������2��
 * 
 * </pre>
 * 
 * http://zhedahht.blog.163.com/blog/static/2541117420073118945734/
 * 
 * @author gzhang
 * 
 */
public class MS28 {

    public int find(int x) {
        int result = 0;
        int flag = 1;
        while (flag != 0) {
            if ((x & flag) > 0) {
                result++;
            }
            flag = flag << 1;
        }

        return result;
    }
}
