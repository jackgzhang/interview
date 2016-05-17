package weivretni.leetcode;

import org.junit.Test;

import java.util.List;

public class Q046_Permutations_Test {

    @Test
    public void test() {
        Q046_Permutations source = new Q046_Permutations();

        List result = source.permute(new int[] { 1, 2, 3 });
        System.out.println(result);

    }
}
