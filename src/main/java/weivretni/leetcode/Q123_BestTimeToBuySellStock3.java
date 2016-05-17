package weivretni.leetcode;

/**
 * Say you have an array for which the ith element is the price of a given stock on day i.
 * <p>
 * Design an algorithm to find the maximum profit. You may complete at most two transactions.
 * <p>
 * Note: You may not engage in multiple transactions at the same time (ie, you must sell the stock
 * before you buy again).
 * <p>
 * <pre>
 * http://blog.csdn.net/fightforyourdream/article/details/14503469
 *
 *
 * 看来以后碰到与2相关的问题，一定要想想能不能用二分法来做！
 *
 * 下面复制pickless的讲解，我觉得我不能比他讲的更好了
 * O(n^2)的算法很容易想到：
 * 找寻一个点j，将原来的price[0..n-1]分割为price[0..j]和price[j..n-1]，分别求两段的最大profit。
 * 进行优化：
 * 对于点j+1，求price[0..j+1]的最大profit时，很多工作是重复的，在求price[0..j]的最大profit中已经做过了。
 * 类似于Best Time to Buy and Sell Stock，可以在O(1)的时间从price[0..j]推出price[0..j+1]的最大profit。
 * 但是如何从price[j..n-1]推出price[j+1..n-1]？反过来思考，我们可以用O(1)的时间由price[j+1..n-1]推出price[j..n-1]。
 * 最终算法：
 * 数组l[i]记录了price[0..i]的最大profit，
 * 数组r[i]记录了price[i..n]的最大profit。
 * 已知l[i]，求l[i+1]是简单的，同样已知r[i]，求r[i-1]也很容易。
 * 最后，我们再用O(n)的时间找出最大的l[i]+r[i]，即为题目所求。
 *
 * </pre>
 *
 * @author gzhang
 */
public class Q123_BestTimeToBuySellStock3 {

    public int maxProfit(int[] prices) {
        int[] l = new int[prices.length];
        int[] r = new int[prices.length];

        // 数组l[i]记录了price[0..i]的最大profit，
        int minSoFar = prices[0];
        int maxProfitSoFar = 0;
        for (int i = 0; i < prices.length; i++) {
            minSoFar = Math.min(prices[i] ,minSoFar );
            int profitSoFar = prices[i] > minSoFar ? (prices[i] - minSoFar) : 0;
            maxProfitSoFar = Math.max(maxProfitSoFar, profitSoFar);
            l[i] = maxProfitSoFar;
        }

        // 数组r[i]记录了price[i..n]的最大profit
        int maxSoFar = prices[prices.length - 1];
        maxProfitSoFar = 0;
        for (int i = prices.length - 1; i >= 0 ;i --) {
            maxSoFar = Math.max(maxSoFar, prices[i]);
            int profitSoFar = prices[i] < maxSoFar ? maxSoFar - prices[i] : 0;
            maxProfitSoFar = Math.max(profitSoFar, maxProfitSoFar);
            r[i] = maxProfitSoFar;
        }


        // 最后，我们再用O(n)的时间找出最大的l[i]+r[i]，即为题目所求。
        maxSoFar = l[0] + r[0];
        for (int i = 1; i< prices.length ;i++) {
            maxSoFar = Math.max(maxSoFar , l[i] + r[i]);
        }
        return maxSoFar;
    }

}
