package weivretni.leetcode;

/**
 * <pre>
 * Follow up for "Search in Rotated Sorted Array":
 * 
 * What if duplicates are allowed?
 * 
 * (i.e., 0 1 2 4 4 4 5 6 7 might become 4 4 4 5 6 7 0 1 2).
 * 
 * Would this affect the run-time complexity? How and why?
 * 
 * Write a function to determine if a given target is in the array.
 * </pre>
 * 
 * @author gzhang
 *
 */
public class Q081_SearchinRotatedSortedArrayII {

    public boolean search(int[] A, int target) {
        int l = 0;
        int r = A.length - 1;

        while (l <= r) {
            int m = (l + r) / 2;
            if (A[m] == target) {
                return true;
            } else {
                if (A[l] < A[m]) {
                    if (A[l] <= target && target < A[m]) {
                        r = m - 1;
                    } else {
                        l = m + 1;
                    }
                } else if ((A[l] > A[m])) {
                    if (A[m] < target && target <= A[r]) {
                        l = m + 1;
                    } else {
                        r = m - 1;
                    }
                } else {
                    l++;
                }
            }
        }

        return false;
    }
}
