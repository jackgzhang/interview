package weivretni.geek4geek;

/**
 * http://www.geeksforgeeks.org/dynamic-programming-set-8-matrix-chain-multiplication/
 * 
 * My solution is different from the GeeksForGeeks.
 * 
 * <pre>
 * 
 * 1) For 2 matrix, there is no choice.
 * 2) For 3 matrix. either left multiple first, or right do first , then compare.
 * 3) Repeat step 2
 * 
 * 
 * </pre>
 * 
 * @author gzhang
 * 
 */
public class DP_8_MatricChainMulitplication {

    private int[] removeRight(int[] matrix) {
        int[] result = new int[matrix.length - 1];
        for (int i = 0; i < matrix.length - 1; i++) {
            result[i] = matrix[i];
        }

        return result;
    }

    private int[] removeLeft(int[] matrix) {
        int[] result = new int[matrix.length - 1];
        for (int i = 1; i < matrix.length; i++) {
            result[i - 1] = matrix[i];
        }

        return result;
    }

    public int doIt(int[] matrix) {
        if (matrix.length == 3) { // 2 matrix
            return matrix[0] * matrix[1] * matrix[2];
        } else {

            int left = matrix[0];
            int[] remaining = removeLeft(matrix);
            int leftResult = doIt(remaining) + left * remaining[0] * remaining[remaining.length - 1];

            int right = matrix[matrix.length - 1];
            remaining = removeRight(matrix);
            int rightResult = doIt(remaining) + right * remaining[0] * remaining[remaining.length - 1];

            return Math.min(leftResult, rightResult);
        }
    }
}
