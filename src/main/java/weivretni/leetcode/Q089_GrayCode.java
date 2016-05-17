package weivretni.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 * The gray code is a binary numeral system where two successive values differ in only one bit.
 * 
 * Given a non-negative integer n representing the total number of bits in the code, print the sequence of gray code. A gray code sequence must begin with 0.
 * 
 * For example, given n = 2, return [0,1,3,2]. Its gray code sequence is:
 * 
 * 00 - 0
 * 01 - 1
 * 11 - 3
 * 10 - 2
 * Note:
 * For a given n, a gray code sequence is not uniquely defined.
 * 
 * For example, [0,2,3,1] is also a valid gray code sequence according to the above definition.
 * 
 * For now, the judge is able to judge based on one instance of gray code sequence. Sorry about that.
 * </pre>
 * 
 * <pre>
 *              0
 *          0   1
 *      0           
 *          1   1
 *              0
 *              0
 *          1   1
 *      1     
 *          0   1
 *              0
 * 
 * 
 * </pre>
 * 
 * 
 * 
 * @author gzhang
 * 
 */
public class Q089_GrayCode {

    public List<Integer> grayCode(int n) {
        if (n <= 0) {
            List<Integer> current = new ArrayList<Integer>();
            current.add(0);
            return current;
        } else {
            return helper(n);
        }
    }

    private List<Integer> helper(int n) {

        List<Integer> current = new ArrayList<Integer>();

        if (n == 1) {

            current.add(0);
            current.add(1);
        } else {

            List<Integer> previous = helper(n - 1);

            boolean addZeroFirst = true;
            for (Integer i : previous) {
                i = i << 1;

                if (addZeroFirst) {
                    current.add(i);
                    current.add(i + 1);
                } else {
                    current.add(i + 1);
                    current.add(i);
                }

                addZeroFirst = !addZeroFirst;

            }
        }
        return current;
    }

}
