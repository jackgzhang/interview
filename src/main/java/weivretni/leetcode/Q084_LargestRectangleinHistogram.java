package weivretni.leetcode;

import java.util.LinkedList;

/**
 * <pre>
 * Given n non-negative integers representing the histogram's bar
 * height where the width of each bar is 1,
 * find the area of largest rectangle in the histogram.
 *
 *
 * Above is a histogram where width of each bar is 1, given height = [2,1,5,6,2,3].
 *
 *
 * The largest rectangle is shown in the shaded area, which has area = 10 unit.
 *
 * For example,
 * Given height = [2,1,5,6,2,3],
 * return 10.
 * </pre>
 * <p>
 * 最优解在 http://codeganker.blogspot.com/2014/03/largest-rectangle-in-histogram-leetcode.html
 * https://siddontang.gitbooks.io/leetcode-solution/content/array/largest_rectangle_in_histogram.html
 *
 * @author gzhang
 */
public class Q084_LargestRectangleinHistogram {

    public int largestRectangleArea(int[] height) {
        if (height == null || height.length == 0)
            return 0;


        int max = 0;
        LinkedList<Integer> stack = new LinkedList<>();
        for (int i = 0; i < height.length; i++) {
            while (!stack.isEmpty() && height[i] <= height[stack.peek()]) {
                int index = stack.pop();
                int curArea = stack.isEmpty() ? i * height[index] : (i - stack.peek() - 1) * height[index];
                max = Math.max(max, curArea);
            }
            stack.push(i);
        }
        while (!stack.isEmpty()) {
            int index = stack.pop();
            int curArea = stack.isEmpty() ? height.length * height[index] : (height.length - stack.peek() - 1) * height[index];
            max = Math.max(max, curArea);
        }
        return max;
    }

}
