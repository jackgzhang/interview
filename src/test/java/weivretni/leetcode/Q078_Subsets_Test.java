package weivretni.leetcode;

import org.junit.Test;

public class Q078_Subsets_Test {

    @Test
    public void test() {
        Q078_Subsets source = new Q078_Subsets();

        System.out.println(source.subsets(new int[] { 1 }));
        
        System.out.println(source.subsets(new int[] { 1, 2 }));

        System.out.println(source.subsets(new int[] { 1, 2, 3 }));

    }
}
