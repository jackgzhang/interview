package weivretni.leetcode;

/**
 * <pre>
 * Given a sorted array and a target value, return the index if the target is found. 
 * 
 * If not, return the index where it would be if it were inserted in order.
 * 
 * You may assume no duplicates in the array.
 * 
 * Here are few examples.
 * [1,3,5,6], 5 → 2
 * [1,3,5,6], 2 → 1
 * [1,3,5,6], 7 → 4
 * [1,3,5,6], 0 → 0
 * </pre>
 * 
 * 其实就是二分查找。 最后的l就是结果
 * 
 * @author gzhang
 *
 */
public class Q035_SearchInsertPosition {

    public int searchInsert(int[] A, int target) {
        int left = 0;
        int right = A.length - 1;

        while (left < right) {
            int mid = (left + right) / 2;
            if (A[mid] == target) {
                left = mid;  // found it
                break;
            }else if (A[mid] < target) {
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }

        return A[left] < target ? left + 1: left;
    }

}
