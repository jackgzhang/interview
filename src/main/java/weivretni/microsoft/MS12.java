package weivretni.microsoft;

/**
 * <pre>
 * ��Ŀ����1+2+��+n��Ҫ����ʹ�ó˳�����for��while��if��else��switch��case
 * �ȹؼ����Լ������ж���䣨A?B:C����
 * </pre>
 * 
 * @author gzhang
 * 
 */
public class MS12 {

    public int solve(int n) {
        int i = 1;

        boolean result = (n > 1) && (i = solve(n - 1) + n) > 0;
        return i;
    }
}
