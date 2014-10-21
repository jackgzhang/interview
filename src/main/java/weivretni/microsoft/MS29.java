package weivretni.microsoft;

import java.util.Stack;

/**
 * <pre>
 * 29.ջ��push��pop����
 * ��Ŀ�����������������С�����һ�����б�ʾջ��push˳��
 * �ж���һ��������û�п����Ƕ�Ӧ��pop˳��
 * Ϊ�˼���������Ǽ���push���е����������������ǲ���ȵġ�   
 * 
 * ���������push������1��2��3��4��5����ô4��5��3��2��1���п�����һ��popϵ�С�
 * ��Ϊ���������µ�push��pop���У�
 * push 1��push 2��push 3��push 4��pop��push 5��pop��pop��pop��pop��
 * �����õ���pop���о���4��5��3��2��1��
 * ������4��3��5��1��2�Ͳ�������push����1��2��3��4��5��pop���С�
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
