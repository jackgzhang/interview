package weivretni.leetcode;

import org.junit.Test;

import java.util.List;

public class Q077_Combinations_Test {

    private Q077_Combinations source = new Q077_Combinations();

    @Test
    public void test() {

        List<List<Integer>> answers = null;

        answers = source.combine(4, 2);

        System.out.println(answers);

    }
}
