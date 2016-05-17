package weivretni.leetcode;

/**
 * <pre>
 * Follow up for "Remove Duplicates":
 * What if duplicates are allowed at most twice?
 * 
 * For example,
 * Given sorted array A = [1,1,1,2,2,3],
 * 
 * Your function should return length = 5, and A is now [1,1,2,2,3].
 * </pre>
 * 
 * 
 */
public class Q080_RemoveDuplicatesfromSortedArrayII {

    public int removeDuplicates(int[] A) {
        if (A == null || A.length <= 1) {
            return A.length;
        } else {
            boolean exist = false;
            int counter = 1;

            for (int i = 1; i < A.length; i++) {
                if (A[i] == A[i - 1]) {
                    if (!exist) {
                        counter++;
                    }
                    exist = true;
                } else {
                    exist = false;
                    counter ++;
                }
            }

            return counter;
        }
    }
}
