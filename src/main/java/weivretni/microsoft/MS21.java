package weivretni.microsoft;

import java.util.LinkedList;
import java.util.List;

/**
 * <pre>
 * ��21��
 * 2010������������
 * �����⣺
 * ������������ n �� m��������1��2��3.......n �� ����ȡ������,
 * ʹ��͵��� m ,Ҫ���������еĿ�������г���.
 * </pre>
 * 
 * 
 * http://blog.csdn.net/randyjiawenjie/article/details/6335208
 * 
 * @author gzhang
 * 
 */
public class MS21 {

    private static LinkedList<Integer> list = new LinkedList<Integer>();

    /**
     * <pre>
     *  ���˼·�� 
     *  1.�����жϣ����n>m,��n�д���m���������ܲ�����ϣ���ʱ��n=m�� 
     *  2.��������n������n==m������������������� 
     *  3.��n�����������⣺nû�м��룬ȡn=n-1,m=m,�ݹ飻 
     *  4.n���룬ȡn=n-1,m=m-n,�ݹ顣 
     *  5.������
     * </pre>
     * 
     * @param sum
     * @param n
     */

    public void findSum(int n, int sum) {

        if (n < 1 || sum < 1)
            return;
        if (sum > n) {
            list.add(n);
            findSum(n - 1, sum - n);// n���룬ȡn=n-1,m=m-n
            list.pop();
            findSum(n - 1, sum); // nû�м��룬ȡn=n-1,m=m
        } else {
            System.out.print(sum); // sum < n ,ֱ�����n�Ϳ���������
            for (int i = 0; i < list.size(); i++)
                System.out.print("  " + list.get(i));
            System.out.println();
        }
    }
}
