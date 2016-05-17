package weivretni.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * <pre>
 * Given an array of integers, find two numbers such that they add up to a specific target number.
 * 
 * The function twoSum should return indices of the two numbers such that they add up to the target, 
 * 
 * where index1 must be less than index2. Please note that your returned answers (both index1 and index2) 
 * 
 * are not zero-based. You may assume that each input would have exactly one solution.
 * 
 * Input: numbers={2, 7, 11, 15}, target=9
 * Output: index1=1, index2=2
 * </pre>
 * 
 * <pre>
 * 思路1：对于每一个元素，遍历寻找另一个元素使得和为target,时间复杂度O(n^2)。
 * 
 * 思路2：先排序，然后首尾两个指针向中间靠拢，两指针所指元素大于target，移动尾指针，
 * 小于target移动头指针，直至找到结果或者两个指针相遇。时间复杂度O(nlogn)。此方法可推广值3Sum，4Sum等，有待整理。
 * 
 * 思路3：利用hashmap，将每个元素值作为key，数组索引作为value存入hashmap，然后遍历数组元素，
 * 在hashmap中寻找与之和为target的元素。 时间复杂度O(n)，空间复杂度O(n)。
 * </pre>
 * 
 * @author gzhang
 *
 */
public class Q001_TwoSum {

    public int[] twoSum(int[] numbers, int target) {

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];

            if (map.containsKey(target - number)) {
                return new int[] { map.get(target - number) + 1, i + 1 };
            } else {
                map.put(numbers[i], i);
            }
        }

        throw new IllegalArgumentException("No two sum solution");
    }
}
