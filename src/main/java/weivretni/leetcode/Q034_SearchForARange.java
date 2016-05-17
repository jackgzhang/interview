package weivretni.leetcode;

/**
 * Given a sorted array of integers, find the starting and ending position of a given target value.
 * 
 * Your algorithm's runtime complexity must be in the order of O(log n).
 * 
 * If the target is not found in the array, return [-1, -1].
 * 
 * For example, Given [5, 7, 7, 8, 8, 10] and target value 8, return [3, 4].
 * 
 * @author gzhang
 *
 */
public class Q034_SearchForARange {

    public int[] searchRange(int[] A, int target) {
        int l = 0;
        int r = A.length - 1;
        int[] result = new int[2];
        result[0] = -1;
        result[1] = -1;

        while (l <= r) {
            int pivot = (l + r) / 2;
            if (A[pivot] == target) {
                // Now search left and right
                l = pivot;
                r = pivot;
                while (l >= 1 && A[l - 1] == target) {
                    l--;
                }
                while (r <= A.length - 2 && A[r + 1] == target) {
                    r++;
                }

                result[0] = l;
                result[1] = r;
                break;
            } else {
                if (A[pivot] < target) {
                    // search right
                    l = pivot + 1;
                } else {
                    r = pivot - 1;
                }
            }
        }

        return result;
    }
}
