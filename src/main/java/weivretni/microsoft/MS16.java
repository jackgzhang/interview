package weivretni.microsoft;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

import weivretni.TreeNode;

/**
 * <pre>
 *  第16题：
 *  输入一颗二元树，从上往下按层打印树的每个结点，同一层中按照从左往右的顺序打印。   
 *  例如输入
 *      8
 *    /   \
 *   6     10
 *  / \    / \
 * 5   7  9  11
 *  
 *  输出8 6 10 5 7 9 11。
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
