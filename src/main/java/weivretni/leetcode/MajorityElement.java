package weivretni.leetcode;

/**
 * Majority Element
 * Given an array of size n, find the majority element.
 * The majority element is the element that appears more than ⌊ n/2 ⌋ times.
 *
 * You may assume that the array is non-empty and the majority element always exist in the array.
 */
public class MajorityElement {
    public int majorityElement(int[] nums) {
        int num=0;
        int count = 0;

        for (int number : nums) {
            if (number == num) {
                count ++;
            }else{
                if (count==0) {
                    num = number;
                    count = 1;
                }else{
                    count--;
                }
            }
        }

        return num;
    }
}
