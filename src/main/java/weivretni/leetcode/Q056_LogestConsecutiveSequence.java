package weivretni.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * Given an unsorted array of integers, find the length of the longest consecutive elements
 * sequence.
 * 
 * For example, Given [100, 4, 200, 1, 3, 2], The longest consecutive elements
 * 
 * sequence is [1, 2, 3, 4]. Return its length: 4.
 * 
 * Your algorithm should run in O(n) complexity.
 * 
 * @author gzhang
 * 
 *         <pre>
 * http://www.acmerblog.com/leetcode-longest-consecutive-sequence-5846.html
 * 
 * 
 * 排序的话至少要O(nlgn) 的复杂度。O(n)的复杂度，目前只找到了使用hash来解决的方案，add, remove, 
 * contains 等方法的复杂度都是 O(1)，因此两次遍历的操作复杂度为 O(n)。
 * </pre>
 * 
 */
public class Q056_LogestConsecutiveSequence {

    public int longestConsecutive(int[] num) {
        if (num == null || num.length == 0) {
            return 0;
        } else {

            // Build the set
            Set<Integer> set = new HashSet<Integer>();

            for (int a : num) {
                set.add(a);
            }

            // For each num, keep trying to find adjacent numbers.
            int max = 1;
            for (int a : num) {

                set.remove(a);
                int currentMaxSequence = 1;

                int left = a - 1;
                while (set.contains(left)) {
                    set.remove(left);
                    currentMaxSequence++;
                    left--;

                }

                int right = a + 1;
                while (set.contains(right)) {
                    set.remove(right);
                    currentMaxSequence++;
                    right++;

                }

                max = Math.max(max, currentMaxSequence);
            }

            return max;
        }
    }
}
