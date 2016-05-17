package weivretni.leetcode;

/**
 * <pre>
 * Given an array and a value, remove all instances of that value in place 
 * 
 * and return the new length.
 * 
 * The order of elements can be changed. It doesn't matter what you leave 
 * 
 * beyond the new length.
 * 
 * </pre>
 * 
 * @author gzhang
 * 
 */
public class Q027_RemoveElement {

    public int removeElement(int[] A, int elem) {
        if (A == null || A.length == 0) {
            return 0;
        } else {

            int curr = 0;
            int next = 0;
            int length = 0;

            while (next < A.length) {
                if (A[next] == elem) {
                    next++;
                } else {
                    A[curr] = A[next];
                    curr++;
                    next++;
                    length++;
                }
            }

            return length;
        }
    }
}
