package weivretni.leetcode;

/**
 * <pre>
 * Write a program to solve a Sudoku puzzle by filling the empty cells.
 * 
 * Empty cells are indicated by the character '.'.
 * 
 * You may assume that there will be only one unique solution.
 * 
 * 
 * A sudoku puzzle...
 * 
 * <img src="sudoku.tiff" />
 * 
 * ...and its solution numbers marked in red.
 * </pre>
 * 
 * @author gzhang
 *
 */
public class Q037_SudokuSolver {

    public void solveSudoku(char[][] board) {
        if (board == null || board.length != 9 || board[0].length != 9) {
            return;
        } else {
            solved(board);
        }
    }

    private boolean solved(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') {
                    for (char ch = '1'; ch < '9'; ch++) {
                        if (isValid(board, i, j, ch)) {
                            // no conflict
                            board[i][j] = ch;

                            System.out.println(i + "," +j + "=" + ch);
                            
                            if (solved(board)) {
                                return true;
                            } else {
                                board[i][j] = '.';
                            }

                        }
                    }
                }
            }
        }

        return false;
    }

    private boolean isValid(char[][] board, int i, int j, char c) {

        // check column
        for (int row = 0; row < 9; row++) {
            if (board[row][j] == c) {
                return false;
            }

        }

        // check row
        for (int col = 0; col < 9; col++) {
            if (board[i][col] == c) {
                return false;
            }

        }

        // check block
        for (int row = i / 3 * 3; row < i / 3 * 3 + 3; row++) {
            for (int col = j / 3 * 3; col < j / 3 * 3 + 3; col++) {
                if (board[row][col] == c) {
                    return false;
                }

            }
        }

        return true;

    }
}
