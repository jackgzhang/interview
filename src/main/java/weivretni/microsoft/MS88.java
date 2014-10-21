package weivretni.microsoft;

/**
 * <pre>
 * 88.2005 ��11 �½�ɽ�����⡣�����������Ĵ�������
 * �������ַ����е��ַ�'*'�Ƶ�����ǰ���֣�ǰ��ķ�'*'�ַ����ƣ�
 * �����ܸı��'*'�ַ����Ⱥ�˳�򣬺������ش����ַ�'*'����������ԭʼ��Ϊ��ab**cd**e*12��
 * �����Ϊ*****abcde12������������ֵΪ5����Ҫ��ʹ�þ����ٵ�ʱ��͸����ռ䣩
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
