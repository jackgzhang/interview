package weivretni.microsoft;

import java.util.HashMap;
import java.util.Map;

/**
 * <pre>
 * http://blog.csdn.net/tli600605/article/details/10446765
 * 
 * 
 * ��Ŀ����һ���ܳ����ַ���str ������һ���ַ�������"abc" ���ҳ�str �����"abc"������Ӵ���Ҫ��O(n)��
 * 
 * ���磺�ַ���str��abdcaabcx���ַ���dest��abc����ô����Ӵ�����abc��
 * 
 * 
 * </pre>
 * 
 * @author gzhang
 * 
 */
public class MS33 {

    /**
     * This is my way
     * 
     * @param src
     * @param dest
     * @return
     */
    public String find2(String src, String dest) {
        HashMap<Character, Integer> counter = new HashMap();
        int i = 0;
        int j = 0;
        String result = src;

        // init
        for (i = 0; i < dest.length(); i++) {
            counter.put(dest.charAt(i), 0);
        }

        i = 0;

        while (i < src.length() && j < src.length()) {

            // Increase j till every entry in the counter map > 0
            do {
                Character c = src.charAt(j++);
                Integer value = counter.get(c);
                value++;
                counter.put(c, value);
            } while (!allGreaterThanZero(counter) && j < src.length());

            // Now find another one
            if (j - i < result.length()) {
                result = src.substring(i, j);
            }

            // Now increase i till some entry become 0;
            do {
                Character c = src.charAt(i);
                Integer value = counter.get(c);
                value--;
                counter.put(c, value);

                // Now find another one
                if (value == 0) {
                    if (j - i < result.length()) {
                        result = src.substring(i, j);
                    }
                }

                i++;

            } while (allGreaterThanZero(counter) && i < src.length());

        }

        return result;

    }

    private boolean allGreaterThanZero(HashMap<Character, Integer> map) {
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            int value = entry.getValue();
            if (value == 0) {
                return false;
            }
        }

        return true;
    }

    public String find(String src, String dest) {
        int min = Integer.MAX_VALUE;// ������Ӵ�
        int minfront = 0;// ����Ӵ���ʼλ��
        int minrear = 0;// ����Ӵ�����λ��
        int front, rear;
        front = rear = 0;
        int count = 0;
        int hashtable[] = new int[256];
        int cnt[] = new int[256];
        for (int i = 0; i < dest.length(); i++) {
            hashtable[dest.charAt(i)] = 1;
        }
        while (rear < src.length()) {
            if (hashtable[src.charAt(rear)] == 1) {// rear��ǰ�ַ����ַ�����
                // �ж��Ƿ��Ǳ��Ӵ��е�һ�μ��������ַ�����countͳ���ַ������ѳ��ֵ��ַ���
                if (cnt[src.charAt(rear)] == 0) {
                    count++;
                    cnt[src.charAt(rear)]++;
                    if (count == dest.length()) {// �ַ����е��ַ��ڱ��Ӵ��ж��Ѽ�����
                        while (true) {
                            if (hashtable[src.charAt(front)] == 1) {// front��ǰ�ַ����ַ�����
                                cnt[src.charAt(front)]--;
                                // �ַ�����ĳ���ַ�Ϊ0����ʱfront��rear��ָ�ַ�����Ϊ�����������Ӵ�
                                if (cnt[src.charAt(front)] == 0) {
                                    for (int i = front; i <= rear; i++) {
                                        System.out.print(src.charAt(i));
                                    }
                                    System.out.println();
                                    if (rear - front + 1 < min) {
                                        min = rear - front + 1;
                                        minrear = rear;
                                        minfront = front;
                                    }
                                    // count����Ҫ��գ���0����cnt����Ҳ����Ҫ�κβ���
                                    count--;// ��Ϊĳ���ַ�Ϊ���ִ����Ѿ���Ϊ0�ˣ�����count--
                                    front++;// ���������
                                    break;
                                }
                            }
                            front++;
                        }
                    }
                } else {
                    cnt[src.charAt(rear)]++;
                }
            }
            rear++;
        }

        if (min == Integer.MAX_VALUE) {
            System.out.println("û���ҵ���Ҫ��г���ַ���");

            return null;
        } else {

            System.out.println("����ַ����ǣ�");
            for (int i = minfront; i <= minrear; i++) {
                System.out.print(src.charAt(i));
            }
            System.out.println();

            return src.substring(minfront, minrear + 1);
        }
    }
}
