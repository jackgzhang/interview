package weivretni.geek4geek;

import java.util.List;

/**
 * http://www.youtube.com/watch?v=GafjS0FfAC0
 * 
 * @author gzhang
 * 
 */
public class DP_7_CoinChange_Min {

    public int doIt(List<Integer> changes, int total) {
        int min = Integer.MAX_VALUE;

        if (changes.contains(total)) {
            return 1;
        } else if (changes.get(changes.size() - 1) > total) {
            return 0;
        }

        for (int i = 0; i < changes.size(); i++) {
            int count = doIt(changes, total - changes.get(i));

            if (min > count) {
                min = count;
            }
        }
        System.out.println(changes + " : " + total + " : " + min);
        return min + 1;
    }
}
