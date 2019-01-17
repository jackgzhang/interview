package weivretni.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Majority Element II
 * Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.
 * The algorithm should run in linear time and in O(1) space.
 *
 * Hint:
 *
 * How many majority elements could it possibly have?
 * Do you have a better hint? Suggest it!
 */
public class MajorityElement2 {
    public List<Integer> majorityElement(int[] nums) {
        int num1 = 0;
        int count1 = 0;
        int num2 = 0;
        int count2 = 0;

        for (int number : nums) {
            if (number == num1) {
                count1 ++;
            }else if (number == num2){
                count2 ++;
            }else{
                if (count1==0) {
                    num1 = number;
                    count1 = 1;
                }else if (count2==0) {
                    num2 = number;
                    count2 = 1;
                }else{
                    count1--;
                    count2--;
                }
            }
        }

        List<Integer> result = new ArrayList<>();

        count1 = 0;
        count2 = 0;
        for (int number: nums) {
            if (number == num1) {
                count1++;
            }else if (number == num2) {
                count2++;
            }
        }

        if (count1 > nums.length / 3) {
            result.add(num1);
        }

        if (count2 > nums.length / 3) {
            result.add(num2);
        }

        return result;
    }
}
