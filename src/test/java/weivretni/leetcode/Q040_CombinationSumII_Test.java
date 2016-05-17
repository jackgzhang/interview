package weivretni.leetcode;

import org.junit.Test;

public class Q040_CombinationSumII_Test {

    private Q040_CombinationSumII source = new Q040_CombinationSumII();

    @Test
    public void test() {

        System.out.println(source.combinationSum2(new int[] { 1, 2, 2 }, 5));
        
        System.out.println(source.combinationSum2(new int[] { 1, 1 }, 1));
        System.out.println(source.combinationSum2(new int[] { 1, 2 }, 2));
        

    }
}
