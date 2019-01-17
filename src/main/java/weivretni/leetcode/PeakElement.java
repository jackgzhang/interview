package weivretni.leetcode;

/**
 * Find Peak Element
 * A peak element is an element that is greater than its neighbors.
 *
 * Given an input array where num[i] ≠ num[i+1], find a peak element and return its index.
 *
 * The array may contain multiple peaks, in that case return the index to any one of the peaks is fine.
 *
 * You may imagine that num[-1] = num[n] = -∞.
 *
 * For example, in array [1, 2, 3, 1], 3 is a peak element and your function should return the index number 2.
 *
 * Note:
 *
 * Your solution should be in logarithmic complexity.
 *
 * 解释如下：
 * https://leetcode.com/problems/find-peak-element/discuss/192138/A-simple-reason-why-binary-search-works
 */
public class PeakElement {
    public int findPeakElement(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] > nums[mid + 1]) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}
