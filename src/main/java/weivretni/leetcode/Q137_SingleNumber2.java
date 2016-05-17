package weivretni.leetcode;

/**
 * <pre>
 * Given an array of integers, every element appears three times except for one. 
 * 
 * Find that single one.
 * 
 * Note:
 * Your algorithm should have a linear runtime complexity. 
 * 
 * Could you implement it without using extra memory?
 * </pre>
 * 
 * <pre>
 * http://fisherlei.blogspot.com/2013/11/leetcode-single-number-ii-solution.html
 * 
 * 现在的解法是比较普通的。因为题目已经说了，除了一个数字以外，其他的都出现了3次，如果我们把那个特殊的数剔除，
 * 并把剩下的数于每一位来加和的话，每一位上1出现的次数必然都是3的倍数。所以，解法就在这里，将每一位数字分解到32个bit上，
 * 统计每一个bit上1出现的次数。最后对于每一个bit上1出现的个数对3取模，剩下的就是结果。
 * 
 * 
 * </pre>
 * 
 * @author gzhang
 *
 */
public class Q137_SingleNumber2 {

    public int singleNumber(int[] A) {
        int[] digits = new int[32];
        for (int i = 0; i < 32; i++) {
            for (int j = 0; j < A.length; j++) {
                digits[i] += (A[j] >> i) & 1;
            }
        }
        int res = 0;
        for (int i = 0; i < 32; i++) {
            res += (digits[i] % 3) << i;
        }
        return res;
    }
}
