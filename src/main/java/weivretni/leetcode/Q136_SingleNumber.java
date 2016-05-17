package weivretni.leetcode;

/**
 * <pre>
 * Given an array of integers, every element appears twice except for one. 
 * 
 * Find that single one.
 * 
 * Note:
 * Your algorithm should have a linear runtime complexity. 
 * 
 * Could you implement it without using extra memory?
 * </pre>
 * 
 * 根据x^x=0以及x^y=y^x（交换律）,只要将所有数异或就完了。
 * 
 * @author gzhang
 *
 */
public class Q136_SingleNumber {

    public int singleNumber(int[] A) {
        if (A == null || A.length == 0) {
            return 0;
        } else {

            int result = 0;

            for (int a : A) {
                result = result ^ a;
            }

            return result;
        }
    }
}
