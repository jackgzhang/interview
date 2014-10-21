package weivretni.offer;

import java.util.Stack;

public class Question_21 {

    private Stack<Integer> s1 = new Stack<Integer>();
    private Stack<Integer> s2 = new Stack<Integer>();

    public int min() {
        return s2.peek();
    }

    public int pop() {
        s2.pop();
        return s1.pop();
    }

    public int push(int value) {
        
        if (s2.size() == 0) {
            s2.push(value);
        } else {
            if (s2.peek() > value) {
                s2.push(value);
            } else {
                s2.push(s2.peek());
            }
        }
        
        return s1.push(value);
    }
}
