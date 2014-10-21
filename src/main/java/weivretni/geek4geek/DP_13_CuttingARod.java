package weivretni.geek4geek;

import java.util.List;

/**
 * http://www.geeksforgeeks.org/dynamic-programming-set-13-cutting-a-rod/
 * 
 * <pre>
 *                           cR(4)
 *                   _____________________         
 *                  /        /      \     \
 *                 /        /        \      \
 *             cR(3)       cR(2)     cR(1)   cR(0)
 *            /  |  \       /  \       |
 *           /   |   \     /    \      |  
 *      cR(2) cR(1) cR(0) cR(1) cR(0) cR(0)
 *     / \       |          |
 *    /   \      |          |   
 *  cR(1) cR(0) cR(0)      cR(0)
 * </pre>
 * 
 * @author gzhang
 * 
 */
public class DP_13_CuttingARod {

    public int doIt(int[] prices, int length) {
        if (length <= 0) {
            return 0;
        }

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < length; i++) {
            max = Math.max(max, prices[i] + doIt(prices, length - i - 1));
        }

        return max;
    }
}
