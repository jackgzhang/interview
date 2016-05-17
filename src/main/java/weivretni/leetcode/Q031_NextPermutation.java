package weivretni.leetcode;//package weivretni.leetcode;
//
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * <pre>
// * Implement next permutation, which rearranges numbers into the lexicographically
// *
// * next greater permutation of numbers.
// *
// * If such arrangement is not possible, it must rearrange it as the lowest
// *
// * possible order (ie, sorted in ascending order).
// *
// * The replacement must be in-place, do not allocate extra memory.
// *
// * Here are some examples. Inputs are in the left-hand column and its corresponding
// *
// * outputs are in the right-hand column.
// *
// * 1,2,3 → 1,3,2
// * 3,2,1 → 1,2,3
// * 1,1,5 → 1,5,1
// * </pre>
// *
// * http://fisherlei.blogspot.com/2012/12/leetcode-next-permutation.html
// */
//public class Q031_NextPermutation {
//
//    // =========== get next permutation =============//
//    public int[] nextPermutation(int[] num) {
//
//        if (num.length < 2) {
//            return num;
//        }
//
//        int i = num.length - 2;
//        while (i >= 0) {
//            if (num[i] < num[i + 1]) {
//                break;
//            } else {
//                i--;
//            }
//        }
//
//        if (i < 0) {
//            return num;
//        }
//
//        // From right to left, find the first number larger than the partition number
//        int partition = i;
//        i = num.length - 1;
//        while (i >= 0) {
//            if (num[i] > num[partition]) {
//                break;
//            }
//            i--;
//        }
//
//        // Swap the partition number and the target number
//        int tmp = num[i];
//        num[i] = num[partition];
//        num[partition] = tmp;
//
//        // reverse all the numbers right of partitionIndex.
//        i = partition + 1;
//        int j = num.length - 1;
//        while (i < j) {
//            tmp = num[i];
//            num[i] = num[j];
//            num[j] = tmp;
//            i++;
//            j--;
//        }
//
//        return num;
//    }
//
//    // =============== generate Kth permutation ==========//
//    public int[] getKthPermutation(int n, int k) {
//
//        List<Integer> avail = new ArrayList<Integer>();
//        for (int i = 1; i<=n;i++) {
//            avail.add(i);
//        }
//
//        int[] result = new int[n];
//        for (int i = n - 1; i >= 0; i--) {
//
//            int totalLevel = totalAtLevel(i);
//
//            int reminder = k / totalLevel;
//            result[n - i - 1] = avail.get(reminder - 1);
//
//            k = k / totalLevel;
//            avail.remove(reminder - 1);
//        }
//
//        return result;
//    }
//
//    private int totalAtLevel(int k) {
//        int result = 1;
//        for (int i = 1; i <= k; i++) {
//            result = result * i;
//        }
//        return result;
//    }
//
//    // =============== generate full permutation ==========//
//    int index = 1;
//
//    public void genPermutation(int n) {
//        if (n == 0) {
//            return;
//        } else {
//            List<Integer> avail = new ArrayList<Integer>();
//            for (int i = 1; i <= n; i++) {
//                avail.add(i);
//            }
//
//            genHelper(new ArrayList<Integer>(), avail);
//        }
//    }
//
//    private void genHelper(List<Integer> curr, List<Integer> avail) {
//        if (avail.size() == 0) {
//            System.out.println(index++ + "-" + curr);
//        } else {
//            for (int i = 0; i < avail.size(); i++) {
//
//                Integer number = avail.get(i);
//
//                curr.add(number);
//                avail.remove(i);
//
//
//                genHelper(curr, avail);
//
//                xx
//                curr.remove(curr.size() - 1);
//                avail.add(i, number);
//            }
//        }
//    }
//}
