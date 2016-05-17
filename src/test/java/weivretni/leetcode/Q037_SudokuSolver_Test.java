package weivretni.leetcode;

import org.junit.Test;


public class Q037_SudokuSolver_Test {
    private Q037_SudokuSolver source = new Q037_SudokuSolver();

    @Test
    public void test() {
        //Assert.assertEquals(true, source.isValidSudoku(getCharArray(new String[] { ".87654321", "2........", "3........", "4........", "5........", "6........", "7........", "8........", "9........" })));
        char[][] soduku = getCharArray(new String[] { "..5.....6", "....14...", ".........", ".....92..", "5....2...", ".......3.", "...54....", "3.....42.", "...27.6.." });
        source.solveSudoku(soduku);

        System.out.println(soduku);
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
