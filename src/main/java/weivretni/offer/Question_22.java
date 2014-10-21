package weivretni.offer;

import java.util.Stack;

public class Question_22 {

    public boolean doIt(int[] values, int[] push) {

        boolean doable = false;

        Stack<Integer> stack = new Stack<Integer>();

        int i = 0, j = 0;

        while (i < values.length) {
            stack.push(values[i++]);
            
            if (stack.peek().equals(push[j])) {
                stack.pop();
                j++;
            }
        }

        while (!stack.isEmpty()) {
            return (stack.pop().equals(push[j]));
        }

        if (j == push.length) {
            doable = true;
        }

        return doable;
    }
}
