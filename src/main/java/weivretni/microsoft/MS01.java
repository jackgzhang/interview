package weivretni.microsoft;

import weivretni.TreeNode;

/**
 * 1.把二元查找树转变成排序的双向链表 题目： 输入一棵二元查找树，将该二元查找树转换成一个排序的双向链表。 
 * 要求不能创建任何新的结点，只调整指针的指向。
 * 
 * <pre>
 *          10 
 *      6        14 
 *    4   8    12  16
 * </pre>
 * 
 * 转换成双向链表 4=6=8=10=12=14=16。
 * 
 * @author gzhang
 * 
 */
public class MS01 {

    /**
     * Return the left most element
     * 
     * @param node
     * @return
     */
    private TreeNode convertRight(TreeNode node) {
        TreeNode tmp = node;
        while (tmp.left != null) {
            tmp = tmp.left;
        }

        convertHelper(node);

        return tmp;
    }

    /**
     * Return the right most element
     * 
     * @param node
     * @return
     */
    private TreeNode convertLeft(TreeNode node) {
        TreeNode tmp = node;
        while (tmp.right != null) {
            tmp = tmp.right;
        }

        convertHelper(node);

        return tmp;
    }

    private void convertHelper(TreeNode root) {
        if (root.left == null && root.right == null) {
            return;
        } else {
            if (root.left != null) {
                TreeNode leftTreeLastNode = convertLeft(root.left);
                root.left = leftTreeLastNode;
                leftTreeLastNode.right = root;
            }

            if (root.right != null) {
                TreeNode rightTreeFirstNode = convertRight(root.right);
                root.right = rightTreeFirstNode;
                rightTreeFirstNode.left = root;
            }
        }

    }

    public TreeNode convert(TreeNode root) {
        convertHelper(root);

        while (root.left != null) {
            root = root.left;
        }

        return root;
    }
}
