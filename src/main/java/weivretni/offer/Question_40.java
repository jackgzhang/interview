package weivretni.offer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Question_40 {

    public int doIt(Integer[] numbers) {

        int result = 0;

        for (int number : numbers) {
            result = result ^ number;
        }

        return result;
    }

    public String doIt2(int[] numbers) {

        int result = 0;

        for (int number : numbers) {
            result = result ^ number;
        }

        int number1 = 1;
        while ((number1 & result) != 1) {
            number1 = number1 << 1;
        }

        List<Integer> list1 = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();

        for (int number : numbers) {
            if ((number & number1) == 1) {
                list1.add(number);
            } else {
                list2.add(number);
            }
        }

        int n1 = doIt(list1.toArray(new Integer[list1.size()]));
        int n2 = doIt(list2.toArray(new Integer[list2.size()]));

        return Math.min(n1, n2) + "," + Math.max(n1, n2);
    }
}
