package weivretni.microsoft;

import weivretni.TreeNode;

/**
 * <pre>
 *  4.在二元树中找出和为某一值的所有路径
 *  题目：输入一个整数和一棵二元树。
 *  从树的根结点开始往下访问一直到叶结点所经过的所有结点形成一条路径。
 *  打印出和与输入整数相等的所有路径。
 *  例如 输入整数22和如下二元树
 *    10   
 *    / \   
 *   5  12   
 *  / \   
 * 4   7
 *  则打印出两条路径：10, 12和10, 5, 7。
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
