package weivretni.leetcode;

import junit.framework.Assert;
import org.junit.Test;
import weivretni.BaseTest;
import weivretni.TreeNode;
import weivretni.leetcode.summary.BinaryTreeRelated;

import java.util.Arrays;

public class BinaryTreeRelated_Test extends BaseTest {

    private BinaryTreeRelated source = new BinaryTreeRelated();

    @Test
    public void test() {

        // 1. 求二叉树中的节点个数
        Assert.assertEquals(4, source.getNodeNumRec(this.buildTree(new String[] { "1", "2", "3", "4" })));
        Assert.assertEquals(4, source.getNodeNum(this.buildTree(new String[] { "1", "2", "3", "4" })));
        Assert.assertEquals(5, source.getNodeNum(this.buildTree(new String[] { "1", "2", "3", "4", "#", "6" })));

        // 2. 求二叉树的深度
        Assert.assertEquals(3, source.getDepthRec(this.buildTree(new String[] { "1", "2", "3", "4", "#", "6" })));
        Assert.assertEquals(3, source.getDepth(this.buildTree(new String[] { "1", "2", "3", "4", "#", "6" })));

        // 3. 前序遍历 递归
        source.preorderTraversalRec(this.buildTree(new String[] { "1", "2", "3", "4", "#", "6", "9" }));
        System.out.println("");
        source.preorderTraversal(this.buildTree(new String[] { "1", "2", "3", "4", "#", "6", "9" }));
        System.out.println("");

        // 3. 中序遍历 递归
        source.inorderTraversalRec(this.buildTree(new String[] { "1", "2", "3", "4", "5", "6", "9" }));
        System.out.println("");
        source.inorderTraversal(this.buildTree(new String[] { "1", "2", "3", "4", "5", "6", "9" }));
        System.out.println("");

        // 3. 后序遍历 递归
        source.postorderTraversalRec(this.buildTree(new String[] { "1", "2", "3", "4", "5", "6", "9" }));
        System.out.println("");
        source.postorderTraversal(this.buildTree(new String[] { "1", "2", "3", "4", "5", "6", "9" }));
        System.out.println("");

        // 4.分层遍历二叉树（按层次从上往下，从左往右）
        source.levelTraversal(this.buildTree(new String[] { "1", "2", "3", "4", "5", "6", "9", "#", "10" }));
        System.out.println("");

        // 5. 将二叉查找树变为有序的双向链表:
        TreeNode node = source.convertBST2DLLRec(this.buildTree(new String[] { "5", "3", "9", "1", "4", "6", "10" }));
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.right;
        }

        System.out.println("");
        node = source.convertBST2DLL(this.buildTree(new String[] { "5", "3", "9", "1", "4", "6", "10" }));
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.right;
        }

        // 6. 求二叉树第K层的节点个数
        Assert.assertEquals(3, source.getNodeNumKthLevelRec(this.buildTree(new String[] { "5", "3", "9", "1", "4", "6" }), 3));
        Assert.assertEquals(3, source.getNodeNumKthLevel(this.buildTree(new String[] { "5", "3", "9", "1", "4", "6" }), 3));

        // 7. 求二叉树中叶子节点的个数
        Assert.assertEquals(3, source.getNodeNumLeafRec(this.buildTree(new String[] { "5", "3", "9", "1", "4", "6" })));
        Assert.assertEquals(3, source.getNodeNumLeaf(this.buildTree(new String[] { "5", "3", "9", "1", "4", "6" })));

        // 8. 判断两棵二叉树是否相同的树：isSameRec, isSame
        Assert.assertEquals(true, source.isSameRec(this.buildTree(new String[] { "5", "3", "9", "1", "4", "6" }), this.buildTree(new String[] { "5", "3", "9", "1", "4", "6" })));
        Assert.assertEquals(true, source.isSame(this.buildTree(new String[] { "5", "3", "9", "1", "4", "6" }), this.buildTree(new String[] { "5", "3", "9", "1", "4", "6" })));

        // 9. 判断二叉树是不是平衡二叉树：isAVLRec
        Assert.assertEquals(true, source.isAVLRec(this.buildTree(new String[] { "5", "3", "9", "1", "4", "6" })));
        Assert.assertEquals(false, source.isAVLRec(this.buildTree(new String[] { "5", "3", "9", "1", "4", "#", "#", "0" })));

        // 10. 求二叉树的镜像
        node = this.buildTree(new String[] { "5", "3", "9" });
        TreeNode mirrorNode = this.buildTree(new String[] { "5", "9", "3" });
        Assert.assertEquals(mirrorNode, source.mirrorRec(node));

        node = this.buildTree(new String[] { "5", "3", "9" });

        node = this.buildTree(new String[] { "5", "3", "9" });
        Assert.assertEquals(true, source.isMirrorRec(node, mirrorNode));

        // 13. 由前序遍历序列和中序遍历序列重建二叉树：rebuildBinaryTreeRec
        node = source.rebuildBinaryTreeRec(Arrays.asList(new Integer[] { 4, 2, 1, 3, 6, 5, 7 }), Arrays.asList(new Integer[] { 1, 2, 3, 4, 5, 6, 7 }));
        System.out.println(node);

        // 14. 14. 判断二叉树是不是完全二叉树（迭代）
        Assert.assertEquals(true, source.isCompleteBinaryTree(this.buildTree(new String[] { "4", "2", "6", "1", "3", "5", "7" })));
        Assert.assertEquals(false, source.isCompleteBinaryTree(this.buildTree(new String[] { "4", "2", "6", "1", "3", "#", "#", "0" })));

    }
}
