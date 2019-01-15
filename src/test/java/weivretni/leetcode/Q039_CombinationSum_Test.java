package weivretni.leetcode;

import org.junit.Test;

public class Q039_CombinationSum_Test {

    private Q039_CombinationSum source = new Q039_CombinationSum();

    @Test
    public void test() {

        System.out.println(source.combinationSum(new int[] { 1, 2 }, 2));
        System.out.println(source.combinationSum(new int[] { 1, 2, 3 }, 5));
        System.out.println(source.combinationSum(new int[] { 1, 2, 3 }, 4));

    }
}
