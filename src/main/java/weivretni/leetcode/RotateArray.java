package weivretni.leetcode;

/**
 * Rotate an array of n elements to the right by k steps.
 *
 * For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].
 *
 * Note:
 * Try to come up as many solutions as you can, there are at least 3 different ways to solve this problem.
 *
 * [show hint]
 *
 * Hint:
 * Could you do it in-place with O(1) extra space?
 *
 * Related problem: Reverse Words in a String II
 */
public class RotateArray {
    public int[] rotate(int[] nums, int k) {
        int pivot = nums.length - k - 1;
        reverse(nums,0,pivot);
        reverse(nums,pivot+1,nums.length-1);
        reverse(nums,0,nums.length -1);
        return nums;
    }

    private void reverse(int[] nums, int st, int ed) {
        while (st < ed) {
            int k = nums[st];
            nums[st] = nums[ed];
            nums[ed] = k;
            st++;
            ed--;
        }
    }
}
