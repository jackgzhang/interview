package weivretni.microsoft;

import weivretni.TreeNode;

/**
 * <pre>
 *  4.�ڶ�Ԫ�����ҳ���Ϊĳһֵ������·��
 *  ��Ŀ������һ��������һ�ö�Ԫ����
 *  �����ĸ���㿪ʼ���·���һֱ��Ҷ��������������н���γ�һ��·����
 *  ��ӡ����������������ȵ�����·����
 *  ���� ��������22�����¶�Ԫ��
 *    10   
 *    / \   
 *   5  12   
 *  / \   
 * 4   7
 *  ���ӡ������·����10, 12��10, 5, 7��
 * </pre>
 * 
 * @author gzhang
 * 
 */
public class MS04 {

    public void findPath(TreeNode root, int value) {
        if (value > root.val) {
            if (root.left != null) {
                findPath(root.left, value - root.val);
            }

            if (root.right != null) {
                findPath(root.right, value - root.val);
            }
        } else if (value == root.val) {

            do {
                System.out.println(root.val);
                root = root.parent;
            } while (root != null);
        }
    }
}
