package weivretni.leetcode;

import org.junit.Test;

public class Q048_RotateImage_Test {

    @Test
    public void test() {
        Q048_RotateImage source = new Q048_RotateImage();

        int[][] matrix = null;

        matrix = new int[][] { { 1, 2 }, { 3, 4 } };
        source.rotate(matrix);
        System.out.println(matrix);

        matrix = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        source.rotate(matrix);
        System.out.println(matrix);
    }
}
