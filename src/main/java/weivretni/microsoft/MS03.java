package weivretni.microsoft;

/**
 * <pre>
 * 3.�������������
 * ��Ŀ��
 * ����һ���������飬������������Ҳ�и�����
 * ������������һ�������������һ�������飬ÿ�������鶼��һ���͡�
 * ������������ĺ͵����ֵ��Ҫ��ʱ�临�Ӷ�ΪO(n)��
 * 
 * �������������Ϊ1, -2, 3, 10, -4, 7, 2, -5��������������Ϊ3, 10, -4, 7, 2��
 * ������Ϊ��������ĺ�18��
 * </pre>
 * 
 * <pre>
 * �����£�
 * �������������Ϊ1, -2, 3, 10, -4, 7, 2, -5��
 * ��ô����������Ϊ3, 10, -4, 7, 2��
 * ������Ϊ��������ĺ�18
 * 
 * ���еĶ��������������У�
 * ����        1, -2, 3, 10, -4,  7, 2,  -5
 *   b  ��  0  1  -1  3  13   9  16  18  13  
 * sum  ��  0  1   1  3  13  13  16  18  18
 * 
 * ��ʵ�㷨�ܼ򵥣���ǰ��ļ���������������b<0��
 * ��b���¸�ֵ����Ϊ��һ��Ԫ�أ�b=a[i]��
 * ��b>sum�������sum=b;
 * ��b<sum����sum����ԭֵ�������¡�
 * </pre>
 * 
 * @author gzhang
 * 
 */
public class MS03 {

    public int getMaxSum(int[] numbers) {

        int b = numbers[0];
        int max = b;

        boolean resetB = false;
        for (int i = 1; i < numbers.length; i++) {

            if (resetB) {
                b = numbers[i];
                resetB = false;
            } else {
                b += numbers[i];
            }

            if (b > max) {
                max = b;
            }

            if (b < 0) {
                // reset b to the next
                resetB = true;
            }
        }

        return max;
    }
}
