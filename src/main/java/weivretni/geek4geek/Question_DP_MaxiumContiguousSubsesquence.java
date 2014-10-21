package weivretni.geek4geek;

/**
 * 
 * Dynamic Programming problem:
 * 
 * <p>
 * <b> Maximum Value Contiguous Subsequence.</b>
 * <p>
 * Given a sequence of n real numbers A(1) ... A(n), determine a contiguous subsequence A(i) ...
 * A(j) for which the sum of elements in the subsequence is maximized.
 * 
 * http://people.csail.mit.edu/bdean/6.046/dp/
 * 
 * @author gzhang
 * 
 */
public class Question_DP_MaxiumContiguousSubsesquence {

    // ============ No range print , just get max =========

    private int helper(int[] array, int index) {

        if (index == 0) {
            return array[0];
        } else {
            // get sub array
            return Math.max(helper(array, index - 1) + array[index], array[index]);
        }

    }

    public int getMaxContigousSubsequence(int[] array) {
        return helper(array, array.length - 1);
    }

    // ================ Print range ============

    private int start, end;

    private int helper2(int[] array, int index) {

        if (index == 0) {
            start = end = 0;
            return array[0];
        } else {
            // get sub array
            if ((helper2(array, index - 1) + array[index] > array[index])) {
                end = index;
            } else {
                start = end = index;
            }

            return Math.max(helper(array, index - 1) + array[index], array[index]);
        }

    }

    public int getMaxContigousSubsequencePrintRange(int[] array) {

        start = end = 0;
        int result = helper2(array, array.length - 1);

        System.out.println(start + ", " + end);
        return result;
    }
}
