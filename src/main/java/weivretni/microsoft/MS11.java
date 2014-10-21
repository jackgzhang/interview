package weivretni.microsoft;

import weivretni.TreeNode;

/**
 * <pre>
 * ��11��
 * ------------------------------------
 * ��������нڵ��������...
 * 
 * ������ǰѶ���������һ��ͼ��
 * ���ӽڵ�֮������߿�����˫��ģ�
 * ���ǹ��Ҷ���"����"Ϊ���ڵ�֮��ߵĸ�����
 * дһ������
 * ��һ�ö������������Զ�������ڵ�֮��ľ��롣
 * </pre>
 * 
 * 
 * <pre>
 * http://pengliu.me/?p=1154
 * 
 * 
 * �ۺ�������������ڵ�A��B�������������������ֵ�����ֵ��
 * 
 * �������нڵ�������루���������ڵ��·����
 * �������нڵ�������루���������ڵ��·����
 * �����������������������ȵĺ��ټ�2���������ڵ��·����
 * </pre>
 * 
 * @author gzhang
 * 
 */
public class MS11 {

    private int getDepth(TreeNode node) {
        if (node == null) {
            return -1;
        } else {
            return 1 + Math.max(getDepth(node.left), getDepth(node.right));
        }
    }

    public int getMaxDistance(TreeNode root) {

        if (root == null) {
            return -1;
        } else {

            int leftMax = getMaxDistance(root.left);
            int rightMax = getMaxDistance(root.right);
            int depth = getDepth(root.left) + getDepth(root.right) + 2;
            return max(leftMax, rightMax, depth);
        }
    }

    private int max(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }
}
