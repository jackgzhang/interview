package weivretni.leetcode;

import org.junit.Test;
import weivretni.BaseTest;
import weivretni.TreeNode;

public class Q108_ConvertSortedArrayToBinarySearchTree_Test extends BaseTest{
    private Q108_ConvertSortedArrayToBinarySearchTree source = new Q108_ConvertSortedArrayToBinarySearchTree();

    @Test
    public void test() {
        TreeNode treeNode = this.buildTree(new String[]{"4","2","6","1","3","5","7"});
        this.assertEquals(treeNode, source.sortedArrayToBST(new int[]{1,2,3,4,5,6,7}));

        treeNode = this.buildTree(new String[]{"2","1","3","#","#","#","4" });
        this.assertEquals(treeNode, source.sortedArrayToBST(new int[]{1,2,3,4}));


    }
}
