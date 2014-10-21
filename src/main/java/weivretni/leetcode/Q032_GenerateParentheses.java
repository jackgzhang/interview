package weivretni.leetcode;

import java.util.ArrayList;

/**
 * <pre>
 * Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
 * 
 * For example, given n = 3, a solution set is:
 * 
 * "((()))", "(()())", "(())()", "()(())", "()()()"
 * </pre>
 * 
 * @author gzhang
 * 
 */
public class Q032_GenerateParentheses {

    public ArrayList<String> generateParenthesis(int n) {
        ArrayList<String> result = new ArrayList<String>();
        char[] array = new char[2 * n];
        generate(result, n, n, array, 0);
        return result;
    }

    void generate(ArrayList<String> result, int left, int right, char[] array, int num) {
        if (left == 0 && right == 0) {
            result.add(String.valueOf(array));
            return;
        }
        if (left > 0) {
            array[num] = '(';
            generate(result, left - 1, right, array, num + 1);
        }
        if (right > left) {
            array[num] = ')';
            generate(result, left, right - 1, array, num + 1);
        }
    }
}
