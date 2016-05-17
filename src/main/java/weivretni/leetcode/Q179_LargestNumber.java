package weivretni.leetcode;

import java.util.Arrays;
import java.util.Comparator;

/**
 * <pre>
 * Given a list of non negative integers, arrange them such that they form the largest number.
 * 
 * For example, given [3, 30, 34, 5, 9], the largest formed number is 9534330.
 * 
 * Note: The result may be very large, so you need to return a string instead of an integer.
 * </pre>
 * 
 * @author gzhang
 *
 */
public class Q179_LargestNumber {

    public String largestNumber(int[] num) {
        String result = "";
        if (num == null || num.length == 0) {
            return result;
        } else {

            Integer[] nums = new Integer[num.length];
            for (int i = 0; i < nums.length; i++) {
                nums[i] = num[i];
            }

            Arrays.sort(nums, new Comparators());

            StringBuilder sb = new StringBuilder();
            for (int i = nums.length - 1; i >= 0; i--) {
                sb.append(nums[i]);
            }

            return sb.toString();
        }
    }

    class Comparators implements Comparator<Integer> {

        public int compare(Integer o1, Integer o2) {
            String str1 = o1 + "" + o2;
            String str2 = o2 + "" + o1;

            for (int i = 0; i < str1.length(); i++) {
                if (str1.charAt(i) != str2.charAt(i)) {
                    if (str1.charAt(i) > str2.charAt(i)) {
                        return 1;
                    } else {
                        return -1;
                    }
                }
            }

            return 0;
        }

    }
}
