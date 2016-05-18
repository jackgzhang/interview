package weivretni.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 *  Source: https://leetcode.com/problems/3sum/
 *
 *  Given an array S of n integers, are there elements a, b, c in S
 *  such that a + b + c = 0?
 *
 *
 *  Find all unique triplets in the array which
 *  gives the sum of zero.
 *
 *  Note:
 *  Elements in a triplet (a,b,c) must be in non-descending order. (ie, a <=b <= c)
 *  The solution set must not contain duplicate triplets.
 *
 *  For example, given array S = {-1 0 1 2 -1 -4},
 *
 *      A solution set is:
 *      (-1, 0, 1)
 *      (-1, -1, 2)
 *
 *  解法:
 *
 *  (1) 暴力解法, 3个循环. O(n^3)
 *  (2) 3个指针法: 对每一个位置, 取左右两个点, 根据其和进行移动。
 *      遍历位置为O(n)，移动左右点累积移动也是O(n)，所以时间复杂度为O(n^2)
 *      总的时间复杂度为O(nlgn) + O(n^2)=O(n^2)
 *
 *      注意 line 88, 找到后要move left 指针 (或move right 指针)
 *
 * </pre>
 *
 * @author gzhang
 */

public class Q001_ThreeSum {

    /**
     * (1) 暴力解法, 3个循环. O(n^3)
     */
    public List<List<Integer>> threeSum_1(int[] num) {
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                for (int k = j + 1; k < num.length; k++) {
                    if (num[i] + num[j] + num[k] == 0) {

                        List<Integer> tuple = new ArrayList<>();
                        tuple.add(num[i]);
                        tuple.add(num[j]);
                        tuple.add(num[k]);

                        result.add(tuple);
                    }
                }
            }
        }
        return result;
    }

    /**
     * (2) 3个指针法:
     */
    public List<List<Integer>> threeSum_2(int[] num) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 1; i < num.length - 1; i++) {
            int left = i - 1;
            int right = i + 1;

            while (left >= 0 && right < num.length) {
                int currSum = num[left] + num[i] + num[right];

                if (currSum == 0) {
                    // found it
                    List<Integer> tuple = new ArrayList<>();
                    tuple.add(num[left]);
                    tuple.add(num[i]);
                    tuple.add(num[right]);

                    result.add(tuple);

                    // Move to the next, it could either direction  // <-- 非常重要, 不然会无限循环
                    left--;
                } else if (currSum < 0) {
                    right++;
                } else {
                    left--;
                }
            }
        }
        return result;
    }

}
