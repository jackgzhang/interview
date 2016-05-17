package weivretni.leetcode;

import org.junit.Test;

import java.util.List;

public class Q021_CombinationSum_Test {

    private Q021_CombinationSum source = new Q021_CombinationSum();

    @Test
    public void test()  {

        List<List<Integer>> answers = null;
        
        answers = source.combinationSum(new int[] { 1, 1, 2 }, 5);
        
        System.out.println(answers);
        
        answers = source.combinationSum(new int[] { 2, 3 }, 7);

        System.out.println(answers);

    }
}
