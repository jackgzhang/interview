package weivretni.leetcode;

import java.util.Stack;

/**
 * <pre>
 * Given a string containing just the characters '(' and ')', find the length of the longest 
 * 
 * valid (well-formed) parentheses substring.
 * 
 * For "(()", the longest valid parentheses substring is "()", which has length = 2.
 * 
 * Another example is ")()())", where the longest valid parentheses substring is "()()", 
 * 
 * which has length = 4.
 * </pre>
 * 
 * 
 * 
 * 
 * https://leetcodenotes.wordpress.com/2013/10/19/leetcode-longest-valid-parentheses-%E8%BF%99%E7%A7%8D%E6%8B%AC%E5%8F%B7%E7%BB%84%E5%90%88%EF%BC%8C%E6%9C%80%E9%95%BF%E7%9A%84valid%E6%8B%AC%E5%8F%B7%E7%BB%84%E5%90%88%E6%9C%89%E5%A4%9A/
 *
 * <pre>
 * —————————-用stack的做法———————————–
 * stack里面装的一直是“还没配好对的那些可怜的括号的index”
 * 是'(‘的时候push
 * 是’)’的时候，说明可能配对了；
 *      看stack top是不是左括号，不是的话，push当前右括号
 *      是的话，pop那个配对的左括号，然后update res：i和top的（最后一个配不成对的）index相减，就是i属于的这一段的当前最长。如果一pop就整个栈空了，说明前面全配好对了，那res就是最大=i+1
 * </pre>
 *
 */
public class Q032_LongestValidParentheses {

    public int longestValidParentheses(String s) {

        int max = 0;

        if (s != null && s.length() > 0) {
            Stack<Integer> stack = new Stack<>();
            for (int i = 0; i < s.length() ;i++) {
                if (s.charAt(i) == '(') {
                    stack.push(i);
                }else{
                    if (stack.isEmpty() || s.charAt(stack.peek()) == ')') {
                        stack.push(i);
                    }else{
                        stack.pop();
                        if (stack.isEmpty()) {
                            max = i + 1;
                        }else{
                            max = i - (stack.peek());
                        }
                    }
                }
            }
        }

        return max;
    }
}
