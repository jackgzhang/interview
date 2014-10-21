package weivretni.geek4geek;

import java.util.ArrayList;
import java.util.List;

import weivretni.Utils;

/**
 * http://www.geeksforgeeks.org/dynamic-programming-set-18-partition-problem/
 * 
 * @author gzhang
 * 
 */
public class DP_18_Partition {

    class result {

        List<Integer> first  = new ArrayList<Integer>();
        List<Integer> second = new ArrayList<Integer>();

        public void addFirst(int number) {
            first.add(number);
        }

        public void addSecond(int number) {
            second.add(number);
        }

        public List<Integer> getFirst() {
            return first;
        }

        public List<Integer> getSecond() {
            return second;
        }
    }

    public boolean isSubsetSum(int[] arr, int sum) {

        if (sum == 0) {
            return true;
        }

        if (arr.length == 0 && sum != 0) {
            return false;
        }

        int[] subArray = Utils.subArray(arr, 0, arr.length - 2);

        return isSubsetSum(subArray, sum) || isSubsetSum(subArray, sum - arr[arr.length - 1]);
    }

    // Returns true if arr[] can be partitioned in two subsets of
    // equal sum, otherwise false
    public boolean doIt(int arr[]) {
        // Calculate sum of the elements in array
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
            sum += arr[i];

        // If sum is odd, there cannot be two subsets with equal sum
        if (sum % 2 != 0)
            return false;

        // Find if there is subset with sum equal to half of total sum
        return isSubsetSum(arr, sum / 2);
    }
}
