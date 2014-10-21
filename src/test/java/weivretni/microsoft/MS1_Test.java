package weivretni.microsoft;

import org.junit.Test;

import weivretni.BaseTest;
import weivretni.TreeNode;

/**
 * 1.把二元查找树转变成排序的双向链表 题目： 输入一棵二元查找树，将该二元查找树转换成一个排序的双向链表。 要求不能创建任何新的结点，只调整指针的指向。
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
public class MS1_Test extends BaseTest {

    private MS01 source = new MS01();

    @Test
    public void test() {
        TreeNode node = source.convert(this.getTreeNode1());
        while (node.right != null) {
            System.out.println(node.val + " -> ");
            node = node.right;
        }
    }
}
