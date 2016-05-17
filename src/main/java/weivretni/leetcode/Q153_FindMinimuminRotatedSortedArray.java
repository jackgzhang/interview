package weivretni.leetcode;

/**
 * <pre>
 * Follow up for "Find Minimum in Rotated Sorted Array":
 * What if duplicates are allowed?
 * 
 * Would this affect the run-time complexity? How and why?
 * Suppose a sorted array is rotated at some pivot unknown to you beforehand.
 * 
 * (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).
 * 
 * Find the minimum element.
 * 
 * The array may contain duplicates.
 * </pre>
 * 
 * <pre>
 *  In a sorted array, the minimum is the first element. Now the array has been rotated, so we 
 *  
 *  need to search the minimum element. Binary search is usually a efficient way dealing with such problems where the "sub" array has the similar structure of the "parent" array.
 * In this problem, there is only 1 rotation, so that there are only limited cases when we split 
 * the array using the mid-element:
 * 
 *  1. the right part is ordered (A[mid] < A[ed])
 *  2. the right  part is unordered (A[mid] > A[ed])
 *  
 *  Some might say that what about the left part of the array? Note that there is only 1 rotation, 
 *  which indicates that if right part is unordered, the left part of array must be ordered.
 * Considering the above two cases, finding the minimum is now becoming a simple binary 
 * search with slight modifications. Details can be seen in the following code.
 * </pre>
 * 
 * 
 * 
 * @author gzhang
 * 
 */
public class Q153_FindMinimuminRotatedSortedArray {

    private int min = 0;

    public int findMin(int[] num) {
        if (num == null || num.length == 0) {
            return 0;
        } else {
            min = num[0];
            helper(num, 0, num.length - 1);
            return min;
        }
    }

    private void helper(int[] num, int left, int right) {

        if (left > right) {
            return;
        }

        int pivot = (left + right) / 2;
        if (num[pivot] < num[right]) { // right part ordered
            min = Math.min(min, num[pivot]);
            helper(num, left, pivot - 1); // search left part
        } else {
            min = Math.min(min, num[left]);
            helper(num, pivot + 1, right);
        }
    }
}
