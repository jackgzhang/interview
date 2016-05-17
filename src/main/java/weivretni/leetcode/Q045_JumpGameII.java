package weivretni.leetcode;

/**
 * <pre>
 * Given an array of non-negative integers, you are initially positioned at the first index of the array.
 * 
 * Each element in the array represents your maximum jump length at that position.
 * 
 * Your goal is to reach the last index in the minimum steps of jumps.
 * 
 * For example:
 * Given array A = [2,3,1,1,4]
 * 
 * The minimum steps of jumps to reach the last index is 2.
 *  (Jump 1 step from index 0 to 1, then 3 steps to the last index.)
 * </pre>
 * 
 * 
 * 二指针问题，最大覆盖区间。 从左往右扫描，维护一个覆盖区间，每扫过一个元素，就重新计算覆盖区间的边界。比如，开始时区间[start, end],
 * 遍历A数组的过程中，不断计算A[i]+i最大值（即从i坐标开始最大的覆盖坐标），并设置这个最大覆盖坐标为新的end边界。 而新的start边界则为原end+1。不断循环，直到end> n.
 * 
 * 
 * 依旧贪心去推，贪心的规则就是在能够到达的范围之内，选择一个能够到达最远距离的点，更新步数，和更新最远到达的范围。
 * 
 * </pre>
 * 
 * @author gzhang
 * 
 */
public class Q045_JumpGameII {

    public int jump(int[] A) {
        int maxx = A[0], curr = 0, steps = 0;

        while (maxx < A.length) {
            // Figure out how far I can go between [curr, maxx]
            int newMax = maxx;
            int newCurr = curr;
            for (int i = curr; i <= maxx; i++) {
                if (newMax < A[i] + i) {
                    newMax = A[i] + i;
                    newCurr = i;
                }
            }

            steps++;
            maxx = newMax;
            curr = newCurr;
        }
        return steps;
    }
}
