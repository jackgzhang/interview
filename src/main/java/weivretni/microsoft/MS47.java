package weivretni.microsoft;

import java.util.LinkedList;
import java.util.List;

/**
 * <pre>
 * 求一个数组的最长递减子序列 比如{9，4，3，2，5，4，3，2}的最长递减子序列为{9，5，4，3，2}
 * </pre>
 * 
 * @author gzhang
 * 
 */
public class MS47 {

    private List<Integer> helper(List<Integer> input) {

        List<Integer> result = null;
        int maxSize = 0;

        if (input.size() == 1) {
            result = new LinkedList<Integer>();
            result.add(input.get(0));
            return result;
        }

        for (int i = 1; i < input.size(); i++) {
            List<Integer> tmp = helper(input.subList(0, i));

            int toCompare = input.get(i);

            if (tmp.get(tmp.size() - 1) >= toCompare) {
                tmp = clone(tmp, toCompare);
            } else {
                tmp = new LinkedList<Integer>();
                tmp.add(toCompare);
            }

            if (tmp.size() > maxSize) {
                result = tmp;
                maxSize = result.size();
                System.out.println(result);
            }
        }

        return result;
    }

    private List<Integer> clone(List<Integer> l, int add) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        for (int i : l) {
            list.add(i);
        }
        list.add(add);
        return list;
    }

    public List<Integer> find(List<Integer> input) {
        return helper(input);
    }
}
