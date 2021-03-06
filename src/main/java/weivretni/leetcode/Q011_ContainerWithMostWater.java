package weivretni.leetcode;

/**
 * <pre>
 *
 * 最大盛水容器.
 *
 * Given n non-negative integers a1, a2, ..., an, where each represents a point at coordinate (i, ai). 
 * 
 * n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). Find two lines, 
 * 
 * which together with x-axis forms a container, such that the container contains the most water.
 * 
 * Note: You may not slant the container.
 *
 * For Example:  We have [1,2,4,5], the answer is 4.   [1,2,4,5,3], the answer is 6
 *
 *           |                       |
 *        |  |                    |  |
 *        |  |                    |  |  |
 *     |  |  |                 |  |  |  |
 *  |  |  |  |              |  |  |  |  |
 *  -----------            ---------------
 *  1  2  3  4              1  2  3  4  5
 *
 * [1,4]x1 = 4               [1,5]x1 = 5
 * [2,4]x2 = 4               [2,5]x2 = 6
 * [3,4]x4 = 4               [3,4]x1 = 4
 *                           [3,5]x3 = 6
 *
 * 最大盛水量取决于两边中较短的那条边，而且如果将较短的边换为更短边的话，
 * 盛水量只会变少。所以我们可以用两个头尾指针，计算出当前最大的盛水量后，
 * 将较短的边向中间移，因为我们想看看能不能把较短的边换长一点。
 * 这样一直计算到左边大于右边为止就行了。
 *
 * @see Q042_TrappingRainWater
 *
 * </pre>
 *
 */
public class Q011_ContainerWithMostWater {

    public int maxArea(int[] height) {

        int max = 0;

        int i = 0;
        int j = height.length - 1;

        while (i < j) {
            max = Math.max(max, (j - i) * Math.min(height[i], height[j]));

            if (height[i] < height[j]) {
                // 因为i是短板，所以如果无论j往前移动到什么位置，都不可能产生比area更大的面积
                // 换句话所，i能形成的最大面积已经找到了，所以可以将i向前移。
                i++;
            } else {
                j--;
            }
        }

        return max;

    }
}
