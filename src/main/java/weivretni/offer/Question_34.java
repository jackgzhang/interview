package weivretni.offer;

import java.util.ArrayList;
import java.util.List;

public class Question_34 {

    private List<Integer> list      = new ArrayList<Integer>();
    private int           position2 = 0;
    private int           position3 = 0;
    private int           position5 = 0;

    private void init() {
        position2 = 0;
        position3 = 0;
        position5 = 0;
    }

    private void helper(int index) {
        if (index == 1) {
            list.add(1);
        } else {

            int currentMax = list.get(index - 2);

            // Do max2 calc
            int max2 = list.get(position2) * 2;
            while (max2 <= currentMax) {
                position2++;
                max2 = 2 * list.get(position2);
            }

            // Do max3 calc
            int max3 = list.get(position3) * 3;
            while (max3 <= currentMax) {
                position3++;
                max3 = 3 * list.get(position3);
            }

            // Do max5 calc
            int max5 = list.get(position5) * 5;
            while (max5 <= currentMax) {
                position5++;
                max5 = 5 * list.get(position5);
            }

            if (max2 <= max3 && max2 <= max5) {
                list.add(max2);
            } else if (max3 <= max2 && max3 <= max5) {
                list.add(max3);
            } else if (max5 <= max2 && max5 <= max3) {
                list.add(max5);
            }

        }
    }

    public List<Integer> doIt(int total) {
        init();

        for (int i = 1; i <= total; i++) {
            helper(i);
        }

        return list;
    }
}
