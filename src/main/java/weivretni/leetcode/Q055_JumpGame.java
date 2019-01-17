package weivretni.leetcode;

/**
 * <pre>
 * Given an array of non-negative integers, you are initially positioned at 
 * 
 * the first index of the array.
 * 
 * Each element in the array represents your maximum jump length at 
 * 
 * that position.
 * 
 * Determine if you are able to reach the last index.
 * 
 * For example:
 * A = [2,3,1,1,4], return true.
 * 
 * A = [3,2,1,0,4], return false.
 * </pre>
 * 
 * 
 * Accepted.
 * http://www.cnphp6.com/archives/30102
 * 
 * </pre>
 * 
 * @author gzhang
 * 
 */
public class Q055_JumpGame {

    public boolean canJump(int[] A) {
        int max = 0;

        int i = 0;
        while (i <= max && max < A.length) {
            int soFar = A[i] + i;
            if (soFar > max) {
                max = soFar;
            }
            i++;
        }

        return max >= A.length;
    }

}
