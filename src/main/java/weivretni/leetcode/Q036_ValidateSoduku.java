package weivretni.leetcode;

/**
 * <pre>
 * Determine if a Sudoku is valid, according to: Sudoku Puzzles - The Rules.
 * 
 * The Sudoku board could be partially filled, where empty cells are filled with the character '.'.
 * 
 * 
 * A partially filled sudoku which is valid.
 * </pre>
 * 
 * 
 * http://www.cnblogs.com/TenosDoIt/p/3800485.html
 * 
 * @author gzhang
 *
 */
public class Q036_ValidateSoduku {

    public boolean isValidSudoku(char[][] board) {
        if (board == null || board.length != 9 || board[0].length != 9) {
            return false;
        } else {

            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    if (board[i][j] != '.') {
                        if (!isValid(board, i, j)) {
                            return false;
                        }
                    }
                }
            }

            return true;
        }
    }

    private boolean isValid(char[][] board, int row, int col) {
        // Check row
        for (int i = 0; i <= 8; i++) {
            if (i != row && board[i][col] == board[row][col]) {
                return false;
            }
        }
        // Check col
        for (int i = 0; i <= 8; i++) {
            if (i != col && board[row][i] == board[row][col]) {
                return false;
            }
        }
        // Check block
        for (int i = row / 3 * 3; i < row / 3 * 3 + 3; i++) {
            for (int j = col / 3 * 3; j < col / 3 * 3 + 3; j++) {
                if (i != row && j != col && board[i][j] == board[row][col]) {
                    return false;
                }
            }
        }
        return true;
    }
}
