package weivretni.leetcode;

import org.junit.Test;

public class Q018_FourSum_Test {

    private Q018_FourSum source = new Q018_FourSum();

    @Test
    public void test() {

        System.out.println(source.fourSum(new int[] { 2, 1, 0, -1 }, 2));

        System.out.println(source.fourSum(new int[] { 0, 0, 0, 0 }, 1));
        System.out.println(source.fourSum(new int[] { 1, 0, -1, 0, -2, 2 }, 0));
    }
}
