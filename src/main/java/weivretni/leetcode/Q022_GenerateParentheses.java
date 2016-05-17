package weivretni.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 * Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
 * 
 * For example, given n = 3, a solution set is:
 * 
 * "((()))", "(()())", "(())()", "()(())", "()()()"
 * </pre>
 * 
 * <pre>
 * 
 *         Use recursive approach. For each recursive call, there are 2 cases:
 * 
 *         1. Number of "(" larger then number of ")" -> in this case, we can add either "(" or ")"
 *         in current recursive call
 * 
 *         2. Number of "(" equal to number of ")" -> in this case, only "(" can be added.
 * 
 *         Note that there is no case of number of "(" less then number of ")", because when they
 *         are equal, we always add "(" (
 * </pre>
 */

public class Q022_GenerateParentheses {

    List<String> result;

    public List<String> generateParenthesis(int n) {
        result = new ArrayList<String>();
        helper("", 0, 0, n);
        return result;
    }

    private void helper(String curr, int leftUsed, int rightUsed, int n) {
        if (leftUsed == n && rightUsed == n) {
            result.add(curr);
        } else if (leftUsed == rightUsed) {
            helper(curr + "(", leftUsed + 1, rightUsed, n);
        } else if (leftUsed > rightUsed) {
            if (leftUsed < n) {
                helper(curr + "(", leftUsed + 1, rightUsed, n);
            }
            if (rightUsed < n) {
                helper(curr + ")", leftUsed, rightUsed + 1, n);
            }
        }
    }

}
