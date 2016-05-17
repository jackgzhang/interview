package weivretni.leetcode;

import junit.framework.Assert;
import org.junit.Test;

public class Q036_ValidateSoduku_Test {

    private Q036_ValidateSoduku source = new Q036_ValidateSoduku();

    @Test
    public void test() {
        //Assert.assertEquals(true, source.isValidSudoku(getCharArray(new String[] { ".87654321", "2........", "3........", "4........", "5........", "6........", "7........", "8........", "9........" })));
        Assert.assertEquals(true, source.isValidSudoku(getCharArray(new String[] { "..5.....6", "....14...", ".........", ".....92..", "5....2...", ".......3.", "...54....", "3.....42.", "...27.6.." })));

    }

    private char[][] getCharArray(String[] strArray) {
        char[][] result = new char[9][9];

        for (int i = 0; i < strArray.length; i++) {
            String str = strArray[i];
            for (int j = 0; j < 9; j++) {
                result[i][j] = str.charAt(j);
            }
        }

        return result;
    }
}
