package weivretni.microsoft;

import java.util.Stack;

/**
 * <pre>
 * 29.栈的push、pop序列
 * 题目：输入两个整数序列。其中一个序列表示栈的push顺序，
 * 判断另一个序列有没有可能是对应的pop顺序。
 * 为了简单起见，我们假设push序列的任意两个整数都是不相等的。   
 * 
 * 比如输入的push序列是1、2、3、4、5，那么4、5、3、2、1就有可能是一个pop系列。
 * 因为可以有如下的push和pop序列：
 * push 1，push 2，push 3，push 4，pop，push 5，pop，pop，pop，pop，
 * 这样得到的pop序列就是4、5、3、2、1。
 * 但序列4、3、5、1、2就不可能是push序列1、2、3、4、5的pop序列。
 * </pre>
 * 
 * http://blog.csdn.net/tanyujing/article/details/8783047
 * 
 * @author gzhang
 * 
 */
public class MS29 {

    public boolean IsPossiblePopOrder(String push, String pop) {

        Stack stack = new Stack();

        for (int i = 0; i < pop.length(); i++) {
            char popChar = pop.charAt(i);

            if (stack.size() > 0 && stack.peek().equals(popChar)) {
                stack.pop();
            } else {

                if (push.length() > 0) {
                    Character pushChar = push.charAt(0);
                    while (!pushChar.equals(popChar) && push.length() > 0) {
                        stack.push(pushChar);
                        push = push.substring(1);
                        pushChar = push.charAt(0);
                    }

                    if (push.length() > 0) {
                        push = push.substring(1);
                    }
                }
            }
        }

        if (stack.size() > 0) {
            return false;
        } else {
            return true;
        }
    }
}
