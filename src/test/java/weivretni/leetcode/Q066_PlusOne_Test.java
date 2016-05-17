package weivretni.leetcode;

import org.junit.Test;

import java.util.Arrays;

public class Q066_PlusOne_Test {

    @Test
    public void test() {
        Q066_PlusOne source = new Q066_PlusOne();

        // System.out.println(Arrays.toString(source.plusOne(new int[] { 0 })));
        System.out.println(Arrays.toString(source.plusOne(new int[] { 1, 9 })));
        System.out.println(Arrays.toString(source.plusOne(new int[] { 9, 9 })));
        // System.out.println(Arrays.toString(source.plusOne(new int[] { 1, 1 })));
    }
}
