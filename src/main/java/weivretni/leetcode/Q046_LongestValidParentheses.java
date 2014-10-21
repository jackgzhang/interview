package weivretni.leetcode;

import java.util.Stack;

/**
 * <pre>
 * Given a string containing just the characters '(' and ')', find the length of the longest valid (well-formed) parentheses substring.
 * 
 * For "(()", the longest valid parentheses substring is "()", which has length = 2.
 * 
 * Another example is ")()())", where the longest valid parentheses substring is "()()", which has length = 4.
 * </pre>
 * 
 * 
 * Use a stack to keep track of the positions of non-matching '('s. Also need to keep track of the
 * position of the last ')'.
 * 
 * @author gzhang
 * 
 */
public class Q046_LongestValidParentheses {

    public int longestValidParentheses(String s) {
        int maxLen = 0;
        int last = -1;
        
        
        Stack<Integer> lefts = new Stack<Integer>();
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) == '(') {
                lefts.push(i);
            } else {
                if (lefts.isEmpty()) {
                    // no matching left
                    last = i;
                } else {
                    // find a matching pair
                    lefts.pop();
                    if (lefts.isEmpty()) {
                        maxLen = Math.max(maxLen, i - last);
                    } else {
                        maxLen = Math.max(maxLen, i - lefts.peek());
                    }
                }
            }
        }
        return maxLen;
    }

}
