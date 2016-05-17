package weivretni.leetcode;

import org.junit.Test;

import java.util.Arrays;

public class Q001_TwoSum_Test {

    @Test
    public void test() {
        Q001_TwoSum source = new Q001_TwoSum();

        System.out.println(Arrays.toString(source.twoSum(new int[] { 4, 2, 3 }, 6)));
        System.out.println(Arrays.toString(source.twoSum(new int[] { 1, 2, 3, 5, 7, 9 }, 9)));
    }
}
