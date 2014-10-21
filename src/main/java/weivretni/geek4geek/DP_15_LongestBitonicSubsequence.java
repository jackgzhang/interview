package weivretni.geek4geek;

import java.util.ArrayList;
import java.util.List;

import weivretni.Utils;

/**
 * http://www.geeksforgeeks.org/dynamic-programming-set-15-longest-bitonic-subsequence/
 * 
 * <pre>
 * Input arr[] = {1, 11, 2, 10, 4, 5, 2, 1}; 
 * Output: 6 (A Longest Bitonic Subsequence of length 6 is  1, 2, 10, 4, 2, 1)
 * 
 * Input arr[] = {12, 11, 40, 5, 3, 1} Output: 5 
 * (A Longest Bitonic Subsequence of length 5 is 12, 11, 5, 3, 1)
 * </pre>
 * 
 * @author gzhang
 * 
 */
public class DP_15_LongestBitonicSubsequence {

    private boolean isPartOfList(List<Integer> numbers, int number) {

        boolean result = true;

        // check weather the numbber is bigger than all the previous
        for (int i = 0; i < numbers.size() - 1; i++) {
            if (numbers.get(i + 1) < numbers.get(i)  || number < numbers.get(i + 1)) {
                result = false;
            }
        }

        if (result) {
            return result;
        } else {
            if (numbers.get(numbers.size() - 1) > number) {
                return true;
            } else {
                return false;
            }
        }

    }

    public List<Integer> doIt(int[] numbers) {

        List<Integer> result = new ArrayList<Integer>();

        if (numbers.length == 1) {
            result.add(numbers[0]);
        } else {

            List<Integer> max = new ArrayList<Integer>();

            for (int i = 0; i < numbers.length - 1; i++) {
                List<Integer> soFar = doIt(Utils.subArray(numbers, 0, i));

                if (isPartOfList(soFar, numbers[numbers.length - 1])) {
                    soFar.add(numbers[numbers.length - 1]);
                }

                if (soFar.size() > max.size()) {
                    max = soFar;
                }

            }

            result = max;
        }
        System.out.println(result);
        return result;
    }
}
