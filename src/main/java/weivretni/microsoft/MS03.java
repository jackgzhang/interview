package weivretni.microsoft;

/**
 * <pre>
 * 3.求子数组的最大和
 * 题目：
 * 输入一个整形数组，数组里有正数也有负数。
 * 数组中连续的一个或多个整数组成一个子数组，每个子数组都有一个和。
 * 求所有子数组的和的最大值。要求时间复杂度为O(n)。
 * 
 * 例如输入的数组为1, -2, 3, 10, -4, 7, 2, -5，和最大的子数组为3, 10, -4, 7, 2，
 * 因此输出为该子数组的和18。
 * </pre>
 * 
 * <pre>
 * 解释下：
 * 例如输入的数组为1, -2, 3, 10, -4, 7, 2, -5，
 * 那么最大的子数组为3, 10, -4, 7, 2，
 * 因此输出为该子数组的和18
 * 
 * 所有的东西都在以下俩行，
 * 即：        1, -2, 3, 10, -4,  7, 2,  -5
 *   b  ：  0  1  -1  3  13   9  16  18  13  
 * sum  ：  0  1   1  3  13  13  16  18  18
 * 
 * 其实算法很简单，当前面的几个数，加起来后，b<0后，
 * 把b重新赋值，置为下一个元素，b=a[i]。
 * 当b>sum，则更新sum=b;
 * 若b<sum，则sum保持原值，不更新。
 * </pre>
 * 
 * @author gzhang
 * 
 */
public class MS03 {

    public int getMaxSum(int[] numbers) {

        int b = numbers[0];
        int max = b;

        boolean resetB = false;
        for (int i = 1; i < numbers.length; i++) {

            if (resetB) {
                b = numbers[i];
                resetB = false;
            } else {
                b += numbers[i];
            }

            if (b > max) {
                max = b;
            }

            if (b < 0) {
                // reset b to the next
                resetB = true;
            }
        }

        return max;
    }
}
