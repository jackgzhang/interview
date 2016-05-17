package weivretni.leetcode;

/**
 * <pre>
 * There are N children standing in a line. Each child is assigned a rating value.
 * 
 * You are giving candies to these children subjected to the following requirements:
 * 
 * Each child must have at least one candy.
 * Children with a higher rating get more candies than their neighbors.
 * What is the minimum candies you must give?
 * </pre>
 * 
 * <pre>
 * 一些例子：
 * 1 2 3 3 3  =》 8  因为candy数可以是
 * 1 2 3 1 1
 * 1 2 3 2 3 =》9  因为candy数可以是
 * 1 2 3 1 2
 * </pre>
 * 
 * 
 * http://blog.sina.com.cn/s/blog_672f71fc0101q6z6.html
 * 
 * <pre>
 * 顺序模拟，假设第一个小朋友拿一个，如果后面的小朋友比他排名低，显然后面的小朋友拿后一个，前一个小朋友升一个。
 * 可以考虑到，需要记录，每个小朋友前面有多少个比他“连续一直”排名高的。
 * 如果后面的小朋友排名比他高，后面的小朋友比前一个小朋友多拿一个
 * </pre>
 * 
 * @author gzhang
 * 
 */
public class Q135_Candy {

    public int candy(int[] ratings) {
        if (ratings.length == 0)
            return 0;
        int[] candies = new int[ratings.length];

        for (int i = 1; i < ratings.length; i++) {
            if (ratings[i] > ratings[i - 1])
                candies[i] = candies[i - 1] + 1;
        }
        for (int i = ratings.length - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1])
                candies[i] = Math.max(candies[i], candies[i + 1] + 1);
        }
        int ret = ratings.length;
        for (int i : candies) {
            ret += i;
        }
        return ret;
    }
}
