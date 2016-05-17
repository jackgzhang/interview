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
        if (A == null || A.length <= 1) {
            return true;
        }

        int canReach = 0;

        int i;
        for (i = 0; i < A.length; i++) {
            if (canReach >= A.length - 1)
                return true;

            if (i <= canReach) {

                if (A[i] + i > canReach) {
                    canReach = A[i] + i;
                }

            }

        }
        return false;
    }

}
