package weivretni.leetcode;

/**
 * <pre>
 * Given n non-negative integers a1, a2, ..., an, where each represents a point at coordinate (i, ai). 
 * 
 * n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). Find two lines, 
 * 
 * which together with x-axis forms a container, such that the container contains the most water.
 * 
 * Note: You may not slant the container.
 * 
 * 典型的2指针移动问题
 * 
 * http://blog.unieagle.net/2012/09/16/leetcode%E9%A2%98%E7%9B%AE%EF%BC%9Acontainer-with-most-water/
 * 
 * http://blog.xiaohuahua.org/2014/12/31/leetcode-container-with-most-water/
 * 
 * </pre>
 *
 */
public class Q011_ContainerWithMostWater {

    public int maxArea(int[] height) {
        if (height == null || height.length <= 1) {
            return 0;
        } else {

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
}
