package weivretni.common.tree;

import weivretni.TreeNode;

/**
 * http://www.itint5.com/oj/#4
 * 
 * <pre>
 * ����һ����ȫ���������鿴���壩�ĸ���㣬ͳ�Ƹ����Ľ��������
 * 
 * ʹ��O(n)�ĵݹ��㷨ͳ�ƶ������Ľ������һ���Զ��׼��ķ�����
 * ��������������ȫ�����������ʣ����Ч�ʸ��ߵ��㷨��
 * 
 * 
 * ʹ��TreeNodeUtil.getLeftChildNode(TreeNode)�������ӽ��
 * ʹ��TreeNodeUtil.getRightChildNode(TreeNode)����Ҷ��ӽ��
 * ʹ��TreeNodeUtil.isNullNode(TreeNode)�жϽ���Ƿ�Ϊ��
 * </pre>
 * 
 * @author gzhang
 * 
 */

public class CountCompleteBinayTreeNodes {

    private int getHeight(TreeNode node) {
        int h = 0;
        while (node != null) {
            node = node.left;
            h++;
        }
        return h;
    }

    public int counter(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            int heightLeft = getHeight(root.left);
            int heightRight = getHeight(root.right);

            if (heightLeft == heightRight) {
                return 1 << heightLeft + counter(root.right);
            } else {
                return 1 << heightRight + counter(root.left);
            }
        }
    }
}
