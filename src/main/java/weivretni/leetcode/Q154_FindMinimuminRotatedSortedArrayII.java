package weivretni.leetcode;

/**
 * 
 * http://blog.csdn.net/linhuanmars/article/details/40449299
 * 
 * 这道题是Search in Rotated Sorted Array的扩展，思路在Find Minimum in Rotated Sorted Array中已经介绍过了，和Find
 * Minimum in Rotated Sorted
 * Array唯一的区别是这道题目中元素会有重复的情况出现。不过正是因为这个条件的出现，影响到了算法的时间复杂度。原来我们是依靠中间和边缘元素的大小关系
 * ，来判断哪一半是不受rotate影响，仍然有序的
 * 。而现在因为重复的出现，如果我们遇到中间和边缘相等的情况，我们就无法判断哪边有序，因为哪边都有可能有序。假设原数组是{1,2,3,3,3,3,3}，
 * 那么旋转之后有可能是{3,3,3,3,3,1,2
 * }，或者{3,1,2,3,3,3,3}，这样的我们判断左边缘和中心的时候都是3，我们并不知道应该截掉哪一半。解决的办法只能是对边缘移动一步，直到边缘和中间不在相等或者相遇
 * ，这就导致了会有不能切去一半的可能。所以最坏情况就会出现每次移动一步，总共移动n此，算法的时间复杂度变成O(n)
 * 
 * @author gzhang
 *
 */
public class Q154_FindMinimuminRotatedSortedArrayII {

    private int min = 0;

    public int findMin(int[] num) {
        if (num == null || num.length == 0) {
            return 0;
        } else {
            min = num[0];
            helper(num, 0, num.length - 1);
            return min;
        }
    }

    private void helper(int[] num, int left, int right) {

        if (left > right) {
            return;
        }

        int pivot = (left + right) / 2;
        if (num[pivot] < num[right]) { // right part ordered
            min = Math.min(min, num[pivot]);
            helper(num, left, pivot - 1); // search left part
        } else {
            min = Math.min(min, num[left]);
            helper(num, pivot + 1, right);
        }
    }
}
