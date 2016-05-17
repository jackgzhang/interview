package weivretni.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 * The set [1,2,3,…,n] contains a total of n! unique permutations.
 * 
 * By listing and labeling all of the permutations in order,
 * We get the following sequence (ie, for n = 3):
 * 
 * 1. "123"
 * 2. "132"
 * 3. "213"
 * 4. "231"
 * 5. "312"
 * 6. "321"
 * 
 * Given n and k, return the kth permutation sequence.
 * 
 * Note: Given n will be between 1 and 9 inclusive.
 * </pre>
 * 
 * http://blog.csdn.net/u013027996/article/details/18405735
 * 
 * <pre>
 * 发现数学规律。
 * 
 * 首先先捋捋这道题要干啥，给了我们n还有k，在数列 1，2，3，... , n构建的全排列中，返回第k个排列。
 * 
 * 题目告诉我们：对于n个数可以有n!种排列；那么n-1个数就有(n-1)!种排列。
 * 
 * 那么对于n位数来说，如果除去最高位不看，后面的n-1位就有 (n-1)!种排列。
 * 
 * 所以，还是对于n位数来说，每一个不同的最高位数，后面可以拼接(n-1)!种排列。
 * 
 * 所以你就可以看成是按照每组(n-1)!个这样分组。 
 * 
 * 利用 k/(n-1)! 可以取得最高位在数列中的index。这样第k个排列的最高位就能从数列中的index位取得，此时还要把这个数从数列中删除。
 * 
 * 然后，新的k就可以有k%(n-1)!获得。循环n次即可。
 * 
 *  同时，为了可以跟数组坐标对其，令k先--。
 * </pre>
 * 
 * @author gzhang
 * 
 */
public class Q060_PermutationSequence {

    public String getPermutation(int n, int k) {

        // getPermutation2(n, k);

        List<Integer> candidates = new ArrayList<Integer>();
        for (int i = 1; i <= n; i++) {
            candidates.add(i);
        }

        StringBuilder sb = new StringBuilder();
        k--;
        for (int i = n - 1; i >= 0; i--) {

            int dividor = getN(i);

            int group = k / dividor;
            k = k % dividor;

            sb.append(candidates.get(group));
            candidates.remove(group);
        }

        return sb.toString();

    }

    private int getN(int n) {
        if (n == 0) {
            return 1;
        }
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }

}
