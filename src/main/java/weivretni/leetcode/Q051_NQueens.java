package weivretni.leetcode;//package weivretni.leetcode;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
///**
// * <pre>
// * The n-queens puzzle is the problem of placing n queens on an n×n chessboard
// *
// * such that no two queens attack each other.
// *
// * Given an integer n, return all distinct solutions to the n-queens puzzle.
// *
// * Each solution contains a distinct board configuration of the n-queens' placement, where 'Q'
// *
// * and '.' both indicate a queen and an empty space respectively.
// *
// * For example,
// * There exist two distinct solutions to the 4-queens puzzle:
// *
// * [
// *  [".Q..",  // Solution 1
// *   "...Q",
// *   "Q...",
// *   "..Q."],
// *
// *  ["..Q.",  // Solution 2
// *   "Q...",
// *   "...Q",
// *   ".Q.."]
// * ]
// * </pre>
// *
// * @author gzhang
// *
// */
//public class Q051_NQueens {
//
//    private List<String[]> solutions = null;
//
//    public List<String[]> solveNQueens(int n) {
//        solutions = new ArrayList<String[]>();
//        helper(n, 0, new HashMap<Integer, Integer>()); // row, col
//        return solutions;
//    }
//x
//    private void helper(int n, int currRow, Map<Integer, Integer> currQueues) {
//        if (currRow == n) {
//            solutions.add(convert(n, currQueues));
//        } else {
//            for (int currCol = 0; currCol < n; currCol++) { // Try each position of this row
//                if (isValid(currQueues, currRow, currCol)) {
//                    currQueues.put(currRow, currCol);
//                    helper(n, currRow + 1, currQueues);
//                    currQueues.remove(currRow);
//                }
//            }
//        }
//    }
//
//    private boolean isValid(Map<Integer, Integer> queens, int row, int col) {
//        for (Map.Entry<Integer, Integer> queen : queens.entrySet()) {
//            if (col == queen.getValue() || row == queen.getKey() || Math.abs(row - queen.getKey()) == Math.abs(col - queen.getValue())) {
//                return false;
//            }
//        }
//
//        return true;
//    }
//
//    private String[] convert(int total, Map<Integer, Integer> queues) {
//
//        String[] result = new String[total];
//
//        for (int i = 0; i < total; i++) {
//            String row = new String();
//
//            for (int j = 0; j < total; j++) {
//                if (queues.get(i) == j) {
//                    row += "Q";
//                } else {
//                    row += ".";
//                }
//            }
//            result[i] = row;
//        }
//
//        return result;
//    }
//}
