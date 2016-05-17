package weivretni.leetcode;//package weivretni.leetcode;
//
///**
// * <pre>
// * Given a 2D board and a word, find if the word exists in the grid.
// *
// * The word can be constructed from letters of sequentially adjacent cell, where "adjacent" cells are
// *
// * those horizontally or vertically neighboring. The same letter cell may not be used more than once.
// *
// * For example,
// *
// * Given board =
// *
// * [
// *   ["ABCE"],
// *   ["SFCS"],
// *   ["ADEE"]
// * ]
// * word = "ABCCED" , -> returns true ,
// *
// * word = "SEE" , -> returns true ,
// *
// * word = "ABCB" , -> returns false .
// *
// * 题解 ：
// *
// * 这道题分析看，就是一个词，在一行出现也是true，一列出现也是true，一行往下拐弯也是true，
// * 一行往上拐弯也是true，一列往左拐弯也是true，一列往右拐弯也是true。所以是要考虑到所有可能性，
// * 基本思路是使用DFS来对一个起点字母上下左右搜索，看是不是含有给定的Word。还要维护一个visited数组，
// * 表示从当前这个元素是否已经被访问过了，过了这一轮visited要回false，因为对于下一个元素，
// * 当前这个元素也应该是可以被访问的。
// * </pre>
// *
// * @author gzhang
// *
// */
//public class Q079_WordSearch {
//x
//    public boolean exist(char[][] board, String word) {
//        if (word.length() == 0) {
//            return false;
//        }
//
//        int rowNum = board.length;
//        int colNum = board[0].length;
//
//        boolean[][] visited = new boolean[rowNum][colNum];
//
//        for (int i = 0; i < rowNum; i++) {
//            for (int j = 0; j < colNum; j++) {
//                if (board[i][j] == word.charAt(0)) {
//                    visited[i][j] = true;
//                    if (doesExist(board, visited, i, j, word.substring(1))) {
//                        return true;
//                    } else {
//                        visited[i][j] = false;
//                    }
//                }
//            }
//        }
//
//        return false;
//    }
//
//    private boolean doesExist(char[][] board, boolean[][] visited, int i, int j, String word) {
//        if (word.length() == 0) {
//            return true;
//        } else {
//
//            int rowNum = board.length;
//            int colNum = board[0].length;
//
//            boolean found = false;
//
//            if (i > 0 && visited[i - 1][j] == false && board[i - 1][j] == word.charAt(0)) {// ^
//                visited[i - 1][j] = true;
//                found = doesExist(board, visited, i - 1, j, word.substring(1));
//                visited[i - 1][j] = false;
//            }
//
//            if (!found && i < rowNum - 1 && visited[i + 1][j] == false && board[i + 1][j] == word.charAt(0)) {// v
//                visited[i + 1][j] = true;
//                found = doesExist(board, visited, i + 1, j, word.substring(1));
//                visited[i + 1][j] = false;
//            }
//
//            if (!found && j > 0 && visited[i][j - 1] == false && board[i][j - 1] == word.charAt(0)) {// <--
//                visited[i][j - 1] = true;
//                found = doesExist(board, visited, i, j - 1, word.substring(1));
//                visited[i][j - 1] = false;
//            }
//
//            if (!found && j < colNum - 1 && visited[i][j + 1] == false && board[i][j + 1] == word.charAt(0)) {// -->
//                visited[i][j + 1] = true;
//                found = doesExist(board, visited, i, j + 1, word.substring(1));
//                visited[i][j + 1] = false;
//            }
//
//            return found;
//        }
//    }
//}
