package weivretni.leetcode;

import java.util.Stack;

/**
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the
 * input string is valid.
 * 
 * The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]"
 * are not.
 * 
 * @author gzhang
 *
 */
public class Q020_ValidParentheses {

    public boolean isValid(String s) {
        if (s.length() == 0) {
            return false;
        } else {
            Stack<String> stack = new Stack<String>();
            for (char c : s.toCharArray()) {
                if (c == '(' || c == '{' || c == '[') {
                    stack.push(c + "");
                } else {
                    if (!stack.isEmpty() && ((c == ')' && stack.peek().equals("(")) || (c == '}' && stack.peek().equals("{")) || (c == ']' && stack.peek().equals("[")))) {
                        stack.pop();
                    } else {
                        return false;
                    }
                }
            }

            return stack.isEmpty();
        }
    }
}
