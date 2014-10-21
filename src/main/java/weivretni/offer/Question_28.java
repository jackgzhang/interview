package weivretni.offer;

import java.util.HashSet;
import java.util.Set;

/**
 * <pre>
 * ��Ŀ������һ���ַ�������ӡ�����ַ������ַ����������С����������ַ���abc��
 * ��������ַ�a��b��c�������г����������ַ���abc��acb��bac��bca��cab��cba��
 * </pre>
 * 
 * @author gzhang
 * 
 */
public class Question_28 {

    public Set<String> doIt(String str) {
        Set<String> result = new HashSet<String>();

        if (str == null || str.length() == 0) {
            result.add("");
        } else {
            char initial = str.charAt(0);
            String rem = str.substring(1);
            Set<String> soFar = doIt(rem);
            for (String strNew : soFar) {
                for (int i = 0; i <= strNew.length(); i++) {
                    result.add(charInsert(strNew, initial, i));
                }
            }
        }

        return result;
    }

    private String charInsert(String str, char c, int j) {
        String begin = str.substring(0, j);
        String end = str.substring(j);
        return begin + c + end;
    }

}
