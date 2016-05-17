package weivretni.leetcode;

import java.util.*;

/**
 * <pre>
 * Given an array S of n integers, are there elements a, b, c, and d in S 
 * such that a + b + c + d = target? Find all unique quadruplets in the array which gives the sum of target.
 * 
 * Note:
 * Elements in a quadruplet (a,b,c,d) must be in non-descending order. (ie, a ≤ b ≤ c ≤ d)
 * The solution set must not contain duplicate quadruplets.
 *     For example, given array S = {1 0 -1 0 -2 2}, and target = 0.
 * 
 *     A solution set is:
 *     (-1,  0, 0, 1)
 *     (-2, -1, 1, 2)
 *     (-2,  0, 0, 2)
 * </pre>
 * 
 *
 * <pre>
 * http://tech-wonderland.net/blog/summary-of-ksum-problems.html
 * 
 * K Sum求解方法, 适用leetcode 2Sum, 3Sum, 4Sum：
 * 
 * 
 * </pre>
 */
public class Q018_FourSum {

    public List<List<Integer>> fourSum(int[] num, int target) {

        
        
        Map<String, String> map = new HashMap<String, String>();
        
        
        List<List<Integer>> results = new ArrayList<List<Integer>>();

        if (num.length < 4) {
            return results;
        } else {

            Arrays.sort(num);

            for (int i = 0; i < num.length - 2; i++) {
                List<List<Integer>> result = threeSum(num, target - num[i], i + 1);
                if (result.size() > 0) {
                    for (List<Integer> aresult : result) {
                        aresult.add(0, num[i]);
                        
                        // Check duplicate
                        String key = "";
                        for (Integer a : aresult) {
                            key += "-" + a;
                        }
                        if (!map.containsKey(key)) {
                            results.add(aresult);
                            map.put(key, key);
                        }
                        
                    }
                }
            }
            return results;
        }
    }

    private List<List<Integer>> threeSum(int[] num, int target, int start) {

        List<List<Integer>> results = new ArrayList<List<Integer>>();

        for (int i = start; i < num.length - 1; i++) {
            List<List<Integer>> result = twoSum(num, target - num[i], i + 1);
            if (result.size() > 0) {
                for (List<Integer> aresult : result) {
                    aresult.add(0, num[i]);
                    results.add(aresult);
                }
            }
        }
        return results;
    }

    private List<List<Integer>> twoSum(int[] num, int target, int start) {
        int l = start;
        int r = num.length - 1;

        List<List<Integer>> results = new ArrayList<List<Integer>>();

        while (l < r) {
            if (num[l] + num[r] == target) {
                List<Integer> result = new ArrayList<Integer>();
                result.add(num[l]);
                result.add(num[r]);
                results.add(result);
            }
            if (num[l] + num[r] > target) {
                r--;
            } else {
                l++;
            }
        }
        return results;
    }
}
