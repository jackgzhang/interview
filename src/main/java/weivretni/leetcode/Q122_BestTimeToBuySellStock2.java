package weivretni.leetcode;

/**
 * Say you have an array for which the ith element is the price of a given stock on day i.
 * 
 * Design an algorithm to find the maximum profit. You may complete as many transactions as you like (ie, buy one and
 * sell one share of the stock multiple times). However, you may not engage in multiple transactions at the same time
 * (ie, you must sell the stock before you buy again).
 * 
 * 
 * <p/>
 * http://blog.unieagle.net/2012/12/04/leetcode%E9%A2%98%E7%9B%AE%EF%BC%9Abest-time-to-buy-and-sell-stock-ii/
 * 
 * <pre>
 * 这个更简单了，题目要求可以多次买卖，但是同一时间只能有一股在手里。
 * 这样就可以在每次上升子序列之前买入，在上升子序列结束的时候卖出。相当于能够获得所有的上升子序列的收益。
 * 而且，对于一个上升子序列，比如：5，1，2，3，4，0 中的1，2，3，4序列来说，对于两种操作方案：
 * 一，在1买入，4卖出；
 * 二，在1买入，2卖出同时买入，3卖出同时买入，4卖出；
 * 这两种操作下，收益是一样的。
 * </pre>
 * 
 * @author gzhang
 * 
 */
public class Q122_BestTimeToBuySellStock2 {

    public int maxProfit(int[] prices) {

        if (prices == null || prices.length == 0) {
            return 0;
        }

        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                maxProfit += (prices[i] - prices[i - 1]);
            }
        }

        return maxProfit;
    }
}
