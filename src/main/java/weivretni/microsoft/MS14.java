package weivretni.microsoft;

/**
 * <pre>
 * ��14�⣺
 * ��Ŀ������һ���Ѿ�������������������һ�����֣�
 * �������в�����������ʹ�����ǵĺ�������������Ǹ����֡�
 * Ҫ��ʱ�临�Ӷ���O(n)������ж�����ֵĺ͵�����������֣��������һ�Լ��ɡ�
 * ������������1��2��4��7��11��15������15������4+11=15��������4��11��
 * </pre>
 * 
 * @author gzhang
 * 
 */
public class MS14 {

    public void findit(int[] array, int sum) {
        int i = 0;
        int j = array.length - 1;

        while (i < j) {

            int tmpSum = array[i] + array[j];

            if (tmpSum == sum) {
                System.out.println(array[i] + " + " + array[j]);
                return;
            }

            if (tmpSum < sum) {
                i++;
            }

            if (tmpSum > sum) {
                j--;
            }
        }
    }
    
    
}
