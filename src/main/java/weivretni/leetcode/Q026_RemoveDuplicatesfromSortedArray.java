package weivretni.leetcode;

/**
 * <pre>
 * Given a sorted array, remove the duplicates in place such that each 
 * 
 * element appear only once and return the new length.
 * 
 * Do not allocate extra space for another array, you must do this in place with 
 * 
 * constant memory.
 * 
 * For example,
 * Given input array A = [1,1,2],
 * 
 * Your function should return length = 2, and A is now [1,2].
 * </pre>
 * 
 * http://fisherlei.blogspot.com/2012/12/leetcode-remove-duplicates-from-sorted.html
 * 
 */
public class Q026_RemoveDuplicatesfromSortedArray {

    public int removeDuplicates(int[] nums) {

        if (nums == null) {
            return -1;
        }
        if (nums.length < 2) {
            return nums.length;
        }
        int len = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[len] != nums[i]) {
                nums[++len] = nums[i];
            }
        }
        return len + 1;

    }
}
