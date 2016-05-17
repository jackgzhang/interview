package weivretni.leetcode;

import java.util.Stack;

/**
 * <pre>
 * Evaluate the value of an arithmetic expression in Reverse Polish Notation.
 * 
 * Valid operators are +, -, *, /. Each operand may be an integer or another expression.
 * 
 * Some examples:
 *   ["2", "1", "+", "3", "*"] -> ((2 + 1) * 3) -> 9
 *   ["4", "13", "5", "/", "+"] -> (4 + (13 / 5)) -> 6
 * </pre>
 * 
 * 
 * 
 * <pre>
 * 
 * Solution 1: 
 * 
 *                  +
 *                
 *             -         -
 *                      3 2
 *         -       +   
 *        5 4     1 2     
 * 
 * 
 *  Backtracking 2 character whenever we see an operator
 * 
 *   5 4 - 1 2 + - 3 2 - +
 *   (5 4 -) 1 2 + - 3 2 - +
 *   1 1 2 + - 3 2 - +
 *   1 (1 2 +) - 3 2 - +
 *   1 3 - 3 2 - +
 *   (1 3 -) 3 2 - +
 *   -2 3 2 - +
 *   -2 (3 2 -) +
 *   -2 1 +
 *   (-2 1 +)
 *   -1
 * </pre>
 * 
 * <pre>
 * 
 * 
 * Solution 2:
 * 
 * 对于逆波兰式，一般都是用栈来处理，依次处理字符串，
 * 
 * 如果是数值，则push到栈里面
 * 
 * 如果是操作符，则从栈中pop出来两个元素，计算出值以后，再push到栈里面，
 * 
 * 则最后栈里面剩下的元素即为所求。
 * </pre>
 * 
 * @author gzhang
 * 
 */
public class Q150_EvaluateReversePolishNotation {

    public int evalRPN(String[] tokens) {
        if (tokens == null || tokens.length == 0) {
            return 0;
        }

        Stack<Integer> s = new Stack<Integer>();
        for (int i = 0; i < tokens.length; i++) {
            if (isOperator(tokens[i])) {
                Integer s2 = s.pop();
                Integer s1 = s.pop();

                if (tokens[i].equals("+")) {
                    s.push(s1 + s2);
                } else if (tokens[i].equals("-")) {
                    s.push(s1 - s2);
                } else if (tokens[i].equals("*")) {
                    s.push(s1 * s2);
                } else if (tokens[i].equals("/")) {
                    s.push(s1 / s2);
                }
            } else {
                s.push(Integer.valueOf(tokens[i]));
            }
        }

        return s.pop();
    }

    private boolean isOperator(String s) {
        return s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/");
    }
}
