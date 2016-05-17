package weivretni.leetcode;

import org.junit.Test;

public class Q015_ThreeSum_Test {

    private Q015_ThreeSum source = new Q015_ThreeSum();

    @Test
    public void test() {
        System.out.println(source.threeSum(new int[] { -1, -2, 1, 0, 2 }));
        System.out.println(source.threeSum(new int[] { 3, -2, 1, 0 }));
        System.out.println(source.threeSum(new int[] { 0, 0, 0, 0 }));
        System.out.println(source.threeSum(new int[] { -2, -1, 1, 2 }));
        System.out.println(source.threeSum(new int[] { -2, -1, 0, 1, 2 }));
        System.out.println(source.threeSum(new int[] { 3, 0, -2, -1, 1, 2 }));
        System.out.println(source.threeSum(new int[] {}));
        System.out.println(source.threeSum(new int[] { 0, 0, 0 }));
        System.out.println(source.threeSum(new int[] { 0, 0, 0, 0 }));
        System.out.println(source.threeSum(new int[] { -1, 0, 1, 2, -1, -4 }));
        System.out.println(source.threeSum(new int[] { -1, 0, 1, 0 }));

    }
}
