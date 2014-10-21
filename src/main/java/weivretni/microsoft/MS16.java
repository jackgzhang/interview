package weivretni.microsoft;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

import weivretni.TreeNode;

/**
 * <pre>
 *  ��16�⣺
 *  ����һ�Ŷ�Ԫ�����������°����ӡ����ÿ����㣬ͬһ���а��մ������ҵ�˳���ӡ��   
 *  ��������
 *      8
 *    /   \
 *   6     10
 *  / \    / \
 * 5   7  9  11
 *  
 *  ���8 6 10 5 7 9 11��
 * </pre>
 * 
 * @author gzhang
 * 
 */
public class MS16 {

    public String print(TreeNode root) {

        String result = "";

        Queue<TreeNode> queue = new LinkedBlockingQueue<TreeNode>();
        queue.add(root);

        while (queue.size() > 0) {
            TreeNode node = queue.poll();
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }

            result += node.val + " ";
        }

        return result;
    }
}
