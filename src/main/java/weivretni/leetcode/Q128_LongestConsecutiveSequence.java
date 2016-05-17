package weivretni.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * Given an unsorted array of integers, find the length of the longest consecutive elements
 * sequence.
 * 
 * For example, Given [100, 4, 200, 1, 3, 2], The longest consecutive elements sequence is [1, 2, 3,
 * 4]. Return its length: 4.
 * 
 * Your algorithm should run in O(n) complexity.
 * 
 * @author gzhang
 *
 */
public class Q128_LongestConsecutiveSequence {

    public int longestConsecutive(int[] num) {
        if (num.length == 0) {
            return 0;
        } else {

            int result = 0;

            Set<Integer> set = new HashSet<Integer>();
            for (int anum : num) {
                set.add(anum);
            }

            // Now do it
            for (int anum : num) {

                int counter = 0;

                int next = anum;
                while (set.contains(next)) {
                    set.remove(next);
                    next--;
                    counter++;
                }

                next = anum + 1;
                while (set.contains(next)) {
                    set.remove(next);
                    next++;
                    counter++;
                }

                if (counter > result) {
                    result = counter;
                }
            }

            return result;
        }
    }
}
