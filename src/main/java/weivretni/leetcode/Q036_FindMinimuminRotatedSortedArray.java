package weivretni.leetcode;

/**
 * <pre>
 * Suppose a sorted array is rotated at some pivot unknown to you beforehand.
 * 
 * (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).
 * 
 * Find the minimum element.
 * 
 * You may assume no duplicate exists in the array.
 * 
 * </pre>
 * 
 * <pre>
 * We can do it in O(Logn) using Binary Search. If we take a closer look at above examples, 
 * we can easily figure out following pattern: 
 * The minimum element is the only element whose previous element is greater than it. 
 * If there is no such element, then there is no rotation and first element is the minimum element. 
 * Therefore, we do binary search for an element which is smaller than the previous element.
 * </pre>
 * 
 * @author gzhang
 * 
 */
public class Q036_FindMinimuminRotatedSortedArray {

    public int findMin(int[] num) {
        if (num == null || num.length == 0) {
            return 0;
        }

        if (num.length == 1) {
            return num[0];
        }

        int l = 0;
        int r = num.length - 1;
        while (l <= r) {
            int pivot = (l + r) / 2;
            if (pivot >= 1 && num[pivot - 1] > num[pivot]) {
                return num[pivot];
            } else {
                if (num[pivot] < num[r]) {
                    // search left
                    r = pivot - 1;
                }else{
                    l = pivot + 1;
                }
            }
        }

        // Cannot find it 
        return num[0];
    }

}
