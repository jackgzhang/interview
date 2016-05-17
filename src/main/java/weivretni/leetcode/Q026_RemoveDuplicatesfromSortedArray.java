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

    public int removeDuplicates(int[] A) {
        if (A == null || A.length <= 1) {
            return A.length;
        } else {
            int dup = 0;

            int curr = 1;
            int pre = 1;
            while (curr < A.length) {
                if (A[curr] == A[curr - 1]) {
                    curr++;
                    dup++;
                } else {
                    A[pre] = A[curr];
                    pre++;
                    curr++;
                }
            }

            return A.length - dup;

        }
    }
}
