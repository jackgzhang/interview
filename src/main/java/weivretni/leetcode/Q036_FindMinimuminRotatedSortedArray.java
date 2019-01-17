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
        int left = 0;
        int right = num.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (num[mid] < num[right]) {
                right = mid;
            }else{
                left = mid + 1;
            }
        }

        return left;
    }

}
