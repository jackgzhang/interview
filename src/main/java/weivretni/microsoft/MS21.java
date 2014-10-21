package weivretni.microsoft;

import java.util.LinkedList;
import java.util.List;

/**
 * <pre>
 * 第21题
 * 2010年中兴面试题
 * 编程求解：
 * 输入两个整数 n 和 m，从数列1，2，3.......n 中 随意取几个数,
 * 使其和等于 m ,要求将其中所有的可能组合列出来.
 * </pre>
 * 
 * 
 * http://blog.csdn.net/randyjiawenjie/article/details/6335208
 * 
 * @author gzhang
 * 
 */
public class MS21 {

    private static LinkedList<Integer> list = new LinkedList<Integer>();

    /**
     * <pre>
     *  求解思路： 
     *  1.首先判断，如果n>m,则n中大于m的数不可能参与组合，此时置n=m； 
     *  2.将最大的数n加入且n==m，则满足条件，输出； 
     *  3.将n分两种情况求解：n没有加入，取n=n-1,m=m,递归； 
     *  4.n加入，取n=n-1,m=m-n,递归。 
     *  5.结束。
     * </pre>
     * 
     * @param sum
     * @param n
     */

    public void findSum(int n, int sum) {

        if (n < 1 || sum < 1)
            return;
        if (sum > n) {
            list.add(n);
            findSum(n - 1, sum - n);// n加入，取n=n-1,m=m-n
            list.pop();
            findSum(n - 1, sum); // n没有加入，取n=n-1,m=m
        } else {
            System.out.print(sum); // sum < n ,直接输出n就可以满足了
            for (int i = 0; i < list.size(); i++)
                System.out.print("  " + list.get(i));
            System.out.println();
        }
    }
}
