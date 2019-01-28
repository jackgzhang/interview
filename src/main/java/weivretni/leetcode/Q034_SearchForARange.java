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
        int r = A.length ;
        int[] result = new int[]{-1,-1};

        while (l < r) {
           int m = (l + r) / 2;

           if (A[m] == target) {
               l = m;
               r = m;
               while (l > 0 && A[l-1] == target) {
                   l--;
               }
               while (r < A.length-1 && A[r+1] == target) {
                   r++;
               }
               return new int[]{l ,r};
           }else if (A[m] < target) {
               l = m + 1;
           }else{
               r = m;
           }
        }

        return result;
    }
}
