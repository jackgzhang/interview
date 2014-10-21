package weivretni.microsoft;

import java.util.Arrays;

import org.junit.Test;

import weivretni.BaseTest;

public class MS5_Test extends BaseTest {

    private MS05 source = new MS05();

    @Test
    public void testSolution1() {

        // Method 1. (Quick Sort)
        System.out.println(Arrays.toString(source.method1(new int[] { 4, 5, 6, 1, 2, 3 }, 3)));
        System.out.println(Arrays.toString(source.method1(new int[] { 2, 1, 3, 4, 9, 8, 7, 6, 5 }, 3)));
        System.out.println(Arrays.toString(source.method1(new int[] { 2, 1, 3, 4 }, 3)));
    }
}
