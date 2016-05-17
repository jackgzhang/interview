package weivretni.leetcode;//package weivretni.leetcode;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
///**
// * Follow up for N-Queens problem.
// *
// * Now, instead outputting board configurations, return the total number of distinct solutions.
// *
// * @author gzhang
// *
// */
//public class Q052_NQueensII {
//x
//    private List<String> solutions;
//
//    public int totalNQueens(int n) {
//        if (n == 0) {
//            return 0;
//        } else {
//            solutions = new ArrayList<String>();
//            helper(n, 0, new HashMap<Integer, Integer>());
//            return solutions.size();
//        }
//    }
//
//    private void helper(int n, int currentRow, Map<Integer, Integer> currentQueens) {
//        if (currentRow == n) {
//            // Found it !
//            solutions.add(convert(currentQueens));
//        } else {
//
//            // Check each column of the row
//            for (int i = 0; i < n; i++) {
//                if (isValid(currentQueens, currentRow, i)) {
//                    // now goes to the next row
//                    currentQueens.put(currentRow, i);
//                    helper(n, currentRow + 1, currentQueens);
//                    currentQueens.remove(currentRow);
//                }
//            }
//        }
//    }
//
//    private boolean isValid(Map<Integer, Integer> currentQueens, int newRow, int newCol) {
//        for (Map.Entry<Integer, Integer> entry : currentQueens.entrySet()) {
//            int row = entry.getKey();
//            int col = entry.getValue();
//
//            if (row == newRow || col == newCol || Math.abs(row - newRow) == Math.abs(col - newCol)) {
//                return false;
//            }
//        }
//        return true;
//    }
//
//    private String convert(Map<Integer, Integer> currentQueens) {
//        StringBuilder sb = new StringBuilder();
//        for (Map.Entry<Integer, Integer> entry : currentQueens.entrySet()) {
//            sb.append(entry.getKey() + "-" + entry.getValue());
//        }
//
//        return sb.toString();
//    }
//}
