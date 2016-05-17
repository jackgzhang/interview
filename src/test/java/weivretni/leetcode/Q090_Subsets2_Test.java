package weivretni.leetcode;

import org.junit.Test;

public class Q090_Subsets2_Test {

    @Test
    public void test() {
        Q090_Subsets2 source = new Q090_Subsets2();

        System.out.println(source.subsetsWithDup(new int[] { 1, 2, 2 }));

        System.out.println(source.subsetsWithDup(new int[] { 1, 1 }));

    }
}
