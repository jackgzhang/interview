package weivretni.leetcode;

/**
 * <pre>
 * Given a sorted array of integers, find the starting and ending position of a given target value.
 * 
 * Your algorithm's runtime complexity must be in the order of O(log n).
 * 
 * If the target is not found in the array, return [-1, -1].
 * 
 * For example,
 * Given [5, 7, 7, 8, 8, 10] and target value 8,
 * return [3, 4].
 * </pre>
 * 
 * @author gzhang
 * 
 */
public class Q114_SearchforaRange {

    public int[] searchRange(int[] A, int target) {
        if (A.length == 0) {
            return null;
        } else {
            int[] result = new int[2];
            result[0] = -1;
            result[1] = -1;

            // 1st, find the starting location
            int i = 0, j = A.length - 1;
            while (i <= j) {
                int mid = (i + j) / 2;

                if (A[mid] < target) {
                    i = mid + 1;
                } else if (A[mid] > target) {
                    j = mid - 1;
                } else {
                    // A[mid] == target
                    if (mid == 0 || A[mid - 1] < A[mid]) {
                        // Found it
                        result[0] = mid;
                        break;
                    } else {
                        // Keep searching left
                        j = mid - 1;
                    }
                }
            }

            // 2nd, find the ending location
            i = 0;
            j = A.length - 1;
            while (i <= j) {
                int mid = (i + j) / 2;

                if (A[mid] < target) {
                    i = mid + 1;
                } else if (A[mid] > target) {
                    j = mid - 1;
                } else {
                    // A[mid] == target
                    if (mid == A.length - 1 || A[mid + 1] > A[mid]) {
                        // Found it
                        result[1] = mid;
                        break;
                    } else {
                        // Keep searching right
                        i = mid + 1;
                    }
                }
            }
            return result;
        }
    }
}
