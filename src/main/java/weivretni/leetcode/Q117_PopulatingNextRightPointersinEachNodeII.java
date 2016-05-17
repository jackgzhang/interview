package weivretni.leetcode;

import weivretni.TreeLinkNode;

/**
 * What if the given tree could be any binary tree? Would your previous solution still work?
 * 
 * @author gzhang
 *
 */
public class Q117_PopulatingNextRightPointersinEachNodeII {

    public void connect(TreeLinkNode root) {
        if (root == null) {
            return;
        } else {
            // Find the next pointer
            TreeLinkNode node = root.next;
            TreeLinkNode nextNode = null;
            while (node != null) {
                if (node.left != null) {
                    nextNode = node.left;
                    break;
                }

                if (node.right != null) {
                    nextNode = node.right;
                    break;
                }
                node = node.next;
            }

            if (root.right != null) {
                root.right.next = nextNode;
            }
            if (root.left != null) {
                root.left.next = root.right == null ? nextNode : root.right;
            }

            connect(root.left);
            connect(root.right);
        }
    }
}
