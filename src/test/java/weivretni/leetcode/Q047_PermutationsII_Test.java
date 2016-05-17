package weivretni.leetcode;

import org.junit.Test;

import java.util.List;

public class Q047_PermutationsII_Test {

    @Test
    public void test() {
        Q047_PermutationsII source = new Q047_PermutationsII();
        List result = null;

        result = source.permuteUnique(new int[] { 1, 2, 3 });
        System.out.println(result);

        result = source.permuteUnique(new int[] { 1, 2, 2 });
        System.out.println(result);

        result = source.permuteUnique(new int[] { 2, 2, 1, 1 });
        System.out.println(result);
    }
}
