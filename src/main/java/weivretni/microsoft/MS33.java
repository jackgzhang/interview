package weivretni.microsoft;

import java.util.HashMap;
import java.util.Map;

/**
 * <pre>
 * http://blog.csdn.net/tli600605/article/details/10446765
 * 
 * 
 * 题目：给一个很长的字符串str ，还有一个字符集比如"abc" ，找出str 里包含"abc"的最短子串。要求O(n)。
 * 
 * 例如：字符串str：abdcaabcx，字符集dest：abc，那么最短子串就是abc。
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
        int min = Integer.MAX_VALUE;// 找最短子串
        int minfront = 0;// 最短子串开始位置
        int minrear = 0;// 最短子串结束位置
        int front, rear;
        front = rear = 0;
        int count = 0;
        int hashtable[] = new int[256];
        int cnt[] = new int[256];
        for (int i = 0; i < dest.length(); i++) {
            hashtable[dest.charAt(i)] = 1;
        }
        while (rear < src.length()) {
            if (hashtable[src.charAt(rear)] == 1) {// rear当前字符在字符集中
                // 判断是否是本子串中第一次检索到此字符，由count统计字符集中已出现的字符数
                if (cnt[src.charAt(rear)] == 0) {
                    count++;
                    cnt[src.charAt(rear)]++;
                    if (count == dest.length()) {// 字符集中的字符在本子串中都已检索到
                        while (true) {
                            if (hashtable[src.charAt(front)] == 1) {// front当前字符在字符集中
                                cnt[src.charAt(front)]--;
                                // 字符集中某个字符为0，此时front到rear所指字符串即为符合条件的子串
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
                                    // count不需要清空（赋0），cnt数组也不需要任何操作
                                    count--;// 因为某个字符为出现次数已经减为0了，所以count--
                                    front++;// 这个不可少
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
            System.out.println("没有找到需要和谐的字符串");

            return null;
        } else {

            System.out.println("最短字符串是：");
            for (int i = minfront; i <= minrear; i++) {
                System.out.print(src.charAt(i));
            }
            System.out.println();

            return src.substring(minfront, minrear + 1);
        }
    }
}
