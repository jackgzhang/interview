package weivretni.microsoft;

import weivretni.Utils;

/**
 * <pre>
 *     你好
 * ��9��
 * -----------------------------------
 * �ж����������ǲ��Ƕ�Ԫ�������ĺ��������
 * ��Ŀ������һ���������飬�жϸ������ǲ���ĳ��Ԫ�������ĺ������Ľ��
 * ����Ƿ���true�����򷵻�false��
 * ��������5��7��6��9��11��10��8��������һ�����������������ĺ��������
 *       8
 *     /  \
 *    6    10
 *   / \   / \
 *  5   7 9  11
 * ��˷���true��
 * �������7��4��6��5��û���Ŀ����ĺ������Ľ����������У���˷���false��
 * </pre>
 * 
 * @author gzhang
 * 
 */
public class MS09 {

    private boolean helper(int[] array) {

        if (array.length <= 1) {
            return true;
        }

        int rootValue = array[array.length - 1];

        int leftRootPos = array.length / 2 - 1;

        boolean leftRootLessThanRoot = true;
        if (leftRootPos >= 0) {
            leftRootLessThanRoot = array[leftRootPos] <= rootValue;
        }

        boolean rightRootLessThanRoot = array[array.length - 2] >= rootValue;

        boolean leftIsTrue = true;
        if (leftRootPos >= 0) {
            leftIsTrue = helper(Utils.subArray(array, 0, leftRootPos));
        }

        boolean rightIsTrue = helper(Utils.subArray(array, leftRootPos + 1, array.length - 2));

        return leftRootLessThanRoot && rightRootLessThanRoot && leftIsTrue && rightIsTrue;

    }

    public boolean isTrue(int[] array) {
        return helper(array);
    }
}
