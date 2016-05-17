package weivretni.lintcode;

import java.util.ArrayList;

/**
 * <pre>
 * Given n items with size A[i], an integer m denotes the size of a backpack. How full you can fill this backpack? 
 * 
 * Note
 * You can not divide any item into small pieces.
 * 
 * Example
 * If we have 4 items with size [2, 3, 5, 7], the backpack size is 11, we can select 2, 3 and 5, so that the max size we can fill this backpack is 10. If the backpack size is 12. we can select [2, 3, 7] so that we can fulfill the backpack.
 * You function should return the max size we can fill in the given backpack.
 * 
 * <pre>
 *
 */
public class Backpack {

    private int max = 0;

    /**
     * @param m: An integer m denotes the size of a backpack
     * @param A: Given n items with size A[i]
     * @return: The maximum size
     */
    public int backPack(int m, int[] A) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int a : A) {
            list.add(a);
        }

        max = 0;
        helper(0, m, list);
        return max;
    }

    private void helper(int current, int target, ArrayList<Integer> A) {

        //System.out.println(current + ", " + target + "," + A);

        // can we fit more ?
        int remainning = target - current;
        if (current > max) {
            max = current;
        }

        if (A.size() == 0 || remainning == 0) {
            return;
        } else {

            for (Integer a : A) {
                if (a <= remainning) {
                    ArrayList<Integer> newList = new ArrayList<Integer>(A);
                    newList.remove(a);

                    helper(current + a, target, newList);
                }
            }
        }
    }
}
