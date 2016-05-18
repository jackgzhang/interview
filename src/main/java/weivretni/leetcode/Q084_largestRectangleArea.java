package weivretni.leetcode;

import java.util.Stack;

/**
 *
 * Source: https://leetcode.com/problems/largest-rectangle-in-histogram/
 * <p/>
 * Given n non-negative integers representing the histogram's bar
 * height where the width of each bar is 1,
 * find the area of largest rectangle in the histogram.
 *
 * <p/>
 * Below is a histogram where width of each bar is 1, given height = [2,1,5,6,2,3].
 * The largest rectangle is shown in the shaded area, which has area = 10 unit.
 * <pre>
 *          +--+                        +--+
 *          |  |                        |  |
 *       +--+  |                     +--+  |
 *       |  |  |                     |//|//|
 *       |  |  |  +--+               |//|//|  +--+
 *       |  |  |  |  |               |//|//|  |  |
 * +--+  |  |  +--+  |         +--+  |//|//+--+  |
 * |  |  |  |  |  |  |         |  |  |//|//|  |  |
 * |  +--+  |  |  |  |         |  +--+//|//|  |  |
 * |  |  |  |  |  |  |         |  |  |//|//|  |  |
 * +--+--+--+--+--+--+         +--+--+--+--+--+--+
 *  2  1  5  6  2  3            2  1  5  6  2  3
 * </pre>
 *
 * 解法:
 * 最优解在 http://blog.csdn.net/linhuanmars/article/details/20524507
 *
 * (1)  比较容易理解的思路，就是从每一个bar往两边走，以自己的高度为标准，
 *      直到两边低于自己的高度为止，然后用自己的高度乘以两边走的宽度得到矩阵面积。
 *      因为我们对于任意一个bar都计算了以自己为目标高度的最大矩阵，
 *      所以最好的结果一定会被取到。每次往两边走的复杂度是O(n)，总共有n个bar，所以时间复杂度是O(n^2)
 *
 * (2)  最优的解法，思路跟Longest Valid Parentheses比较类似，
 *      我们要维护一个栈，这个栈从低向上的高度是依次递增的. (栈里放的是index, 而不是高度)
 *      如果遇到当前bar高度比栈顶元素低，那么就出栈直到栈顶元素比当前bar低;
 *      在出栈过程中 计算出栈元素的面积.
 *      关键问题就在于在出栈时如何确定当前出栈元素的所对应的高度的最大范围是多少?
 *      答案跟Longest Valid Parentheses中括号的范围相似，
 *      (a) 就是如果栈已经为空，
 *          说明到目前为止所有元素（当前下标元素除外）都比出栈元素高度要大（否则栈中肯定还有元素），
 *          所以矩阵面积就是高度乘以当前下标i。
 *      (b) 如果栈不为空，
 *          就是栈顶元素和当前元素的距离差
 *          （因为栈顶元素第一个比当前出栈元素小的）
 *
 * 举例说明: [2,1,5,6,2,3]
 *
 *      2 -> [2        (栈里应该放的是index, 而不是高度, 第一个2的index是0, 用高度比较直观)
 *      1 -> [1        (1 比 2 低, 把 2 出栈, 同时计算 2 的面积.
 *                      注意到现在 2 的 左边比自己低的, 和右边比自己低的 都知道)  Area:2x1=2  参见2(a)
 *      5 -> [1 5      (5 比 1 高, 入栈)
 *      6 -> [1 5 6    (6 比 5 高, 入栈)
 *      2 -> [1 2      (2 比 6 低, 出栈 6,  Area : 6x1=6   参见2(b)  1 是栈顶元素和当前元素的距离
 *                      2 比 5 低, 出栈 5,  Area : 5x2=10  参见2(b)  2 是栈顶元素和当前元素的距离
 *      3 -> [1 2 3    (3 比 2 高, 入栈)
 *
 *      然后栈不为空,接着处理栈 [1 2 3.  这个比较容易.
 *      [1,2 -> 出栈 3  (Area: 3x1 = 3)  高度为3 的可以有 1 挌
 *      [1   -> 出栈 2  (Area: 2x4 = 8)  高度为2 的可以有 4 挌
 *      [    -> 出栈 1  (Area: 1x5 = 5)  高度为2 的可以有 5 挌
 *
 *       最后答案是10
 *
  @author gzhang
 */
public class Q084_largestRectangleArea {

    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int result = 0;
        for (int i = 0 ;i < heights.length ; i++) {
            if (stack.isEmpty() || heights[stack.peek()] < heights[i]) {
                stack.add(i);   // Push index into the stack
            }else{
                while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                    int index = stack.pop();
                    // 计算出栈元素所代表的面积
                    int width = stack.isEmpty()? index + 1: i- index;
                    int currArea = heights[index] * width;
                    result = Math.max(result, currArea);
                }
                stack.add(i);
            }
        }

        // 栈不为空吗
        if (! stack.isEmpty()) {
            int maxIndex = stack.peek();
            while (! stack.isEmpty()) {
                int index = stack.pop();
                int height = heights[index];
                int width = maxIndex - index + 1;
                int currArea = height * width;
                result = Math.max(result, currArea);
            }
        }

        return result;
    }

}
