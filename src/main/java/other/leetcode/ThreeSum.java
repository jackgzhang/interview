package other.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ThreeSum {

    public ArrayList<ArrayList<Integer>> threeSum(int[] num) {
        Map<String, ArrayList<Integer>> map = new HashMap<String, ArrayList<Integer>>();
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                if (j == i)
                    continue;

                for (int k = 0; k < num.length; k++) {
                    if (k == i || k == j) {
                        continue;
                    }

                    if ((num[i] + num[j] + num[k]) == 0) {

                        ArrayList<Integer> result = new ArrayList<Integer>();
                        result.add(num[i]);
                        result.add(num[j]);
                        result.add(num[k]);

                        Collections.sort(result);
                        String key = result.toString();

                        if (!map.containsKey(key)) {
                            map.put(key, result);
                        }
                    }
                }
            }
        }
        
        ArrayList<ArrayList<Integer>> result = new  ArrayList<ArrayList<Integer>>();
        result.addAll(map.values());

        return result;
    }

    public static void main(String[] args) {
        
        int[] s = new int[] { -13,10,11,-3,8,11,-4,8,12,-13,5,-6,-4,-2,12,11,7,-7,-3,10,12,13,-3,-2,6,-1,14,7,-13,8,14,-10,-4,10,-6,11,-2,-3,4,-13,0,-14,-3,3,-9,-6,-9,13,-6,3,1,-9,-6,13,-4,-15,-11,-12,7,-9,3,-2,-12,6,-15,-10,2,-2,-6,13,1,9,14,5,-11,-10,14,-5,11,-6,6,-3,-8,-15,-13,-4,7,13,-1,-9,11,-13,-4,-15,9,-4,12,-4,1,-9,-5,9,8,-14,-1,4,14};
        ThreeSum ss = new ThreeSum();
        ArrayList<ArrayList<Integer>> result = ss.threeSum(s);

        System.out.println(result);
    }

}
