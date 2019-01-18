package weivretni.common;

/**
 * Missing Number
 * Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.
 * <p>
 * For example,
 * Given nums = [0, 1, 3] return 2.
 */
public class FindMissingNumber {

    public int missingNumber(int[] nums) {
        int l = 0;
        int r = nums.length - 1;

        while (l < r) {
            int m = (l + r) / 2;
            if (nums[m] == m) {
                l = m + 1;
            } else {
                r = m ;
            }
        }

        return l;
    }
}
