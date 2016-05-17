package weivretni.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <pre>
 *  Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0? 
 *  
 *  Find all unique triplets in the array which gives the sum of zero.
 *  
 *  Note:
 *  Elements in a triplet (a,b,c) must be in non-descending order. (ie, a <=b <= c)
 *  The solution set must not contain duplicate triplets.
 *     
 *  For example, given array S = {-1 0 1 2 -1 -4},
 *  
 *      A solution set is:
 *      (-1, 0, 1)
 *      (-1, -1, 2)
 * </pre>
 * 
 * 
 * <pre>
 * 
 * 
 * 
 * 
 * 先排序，然后对每一个位置：取左右两个点，根据其和进行移动。
 * 遍历位置为O(n)，移动左右点累积移动也是O(n)，所以时间复杂度为O(n^2)
 * 总的时间复杂度为O(nlgn) + O(n^2)=O(n^2)
 * </pre>
 * 
 * @author gzhang
 * 
 */

public class Q015_ThreeSum {

    public List<List<Integer>> threeSum(int[] num) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();

        if (num.length <= 2) {
            return result;
        } else {

            // Sort
            Arrays.sort(num);

            // Remove dup
            List<Integer> numbers = new ArrayList<Integer>();
            for (int number : num) {
                if (numbers.size() == 0 || numbers.get(numbers.size() - 1) != number) {
                    numbers.add(number);
                }
            }

            // Start iterate
            for (int i = 1; i < numbers.size() - 1; i++) {

                // Start from middle
                int leftIndex = i - 1;
                int rightIndex = i + 1;

                while (leftIndex >= 0 && rightIndex < numbers.size()) {
                    int sum = numbers.get(leftIndex) + numbers.get(i) + numbers.get(rightIndex);
                    if (sum == 0) {
                        // Add to the result
                        result.add(Arrays.asList(new Integer[] { numbers.get(leftIndex), numbers.get(i), numbers.get(rightIndex) }));
                        // Move to the next pair
                        if (leftIndex == 0 && rightIndex == numbers.size() - 1) {
                            break;
                        }
                        leftIndex = (leftIndex == 0) ? leftIndex : leftIndex - 1;
                        rightIndex = (rightIndex == numbers.size() - 1) ? rightIndex : rightIndex + 1;
                    } else if (sum < 0) {
                        rightIndex++;
                    } else {
                        leftIndex--;
                    }
                }
            }

            return result;
        }
    }
}
