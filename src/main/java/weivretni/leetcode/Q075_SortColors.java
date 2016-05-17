package weivretni.leetcode;

/**
 * <pre>
 * Given an array with n objects colored red, white or blue,
 * 
 *  sort them so that objects of the same color are adjacent, with the colors in 
 *  
 *  the order red, white and blue.
 * 
 * Here, we will use the integers 0, 1, and 2 to represent the color red, white, 
 * 
 * and blue respectively.
 * 
 * Note:
 * You are not suppose to use the library's sort function for this problem.
 * 
 * 
 * Follow up:
 * A rather straight forward solution is a two-pass algorithm using counting sort.
 * First, iterate the array counting number of 0's, 1's, and 2's, then overwrite array 
 * 
 * with total number of 0's, then 1's and followed by 2's.
 * 
 * Could you come up with an one-pass algorithm using only constant space?
 * </pre>
 * 
 * 
 * <pre>
 * 一开始想到的就是计数排序，但是计数排序需要两边扫描，第一遍统计红，白，蓝的数目，第二遍生成新数组。
 * 
 * 考虑到题目要求one pass。这就意味着类似于链表的双指针问题，这里也要track两个index，一个是red的index，一个是blue的index，两边往中间走。
 * 
 * i从0到blue index扫描，
 * 遇到0，放在red index位置，red index后移；
 * 遇到2，放在blue index位置，blue index前移；
 * 遇到1，i后移。
 * 扫描一遍得到排好序的数组。时间O(n)，空间O(1)，
 * </pre>
 * 
 * @author gzhang
 *
 */
public class Q075_SortColors {

    public int[] sortColors(int[] A) {
        if (A == null || A.length == 0) {
            return A;
        } else {
            int p0 = 0;
            int p2 = A.length - 1;

            // Now start moving p1
            int i = 0;
            while (i < p2 + 1) {
                if (A[i] == 0) {
                    int tmp = A[i];
                    A[i] = A[p0];
                    A[p0] = tmp;
                    i++;
                    p0++;
                } else if (A[i] == 2) {
                    int tmp = A[i];
                    A[i] = A[p2];
                    A[p2] = tmp;
                    p2--;
                } else {
                    i++;
                }
            }
            return A;
        }
    }
}
