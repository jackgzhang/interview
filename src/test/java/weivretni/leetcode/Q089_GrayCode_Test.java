package weivretni.leetcode;

import org.junit.Test;

import java.util.List;

public class Q089_GrayCode_Test {

    private Q089_GrayCode source = new Q089_GrayCode();

    @Test
    public void test() {

        printBinary(source.grayCode(1));
        System.out.println("------");
        printBinary(source.grayCode(2));
        System.out.println("------");
        printBinary(source.grayCode(3));
        System.out.println("------");
    }

    private void printBinary(List<Integer> numbers) {
        for (Integer number : numbers) {
            System.out.println(Integer.toString(number, 2));
        }
    }
}
