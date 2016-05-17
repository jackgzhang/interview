package weivretni.leetcode;

import org.junit.Test;
import weivretni.BaseTest;
import weivretni.TreeNode;

public class Q114_FlattenBinaryTree_Test extends BaseTest {

    private Q114_FlattenBinaryTree source = new Q114_FlattenBinaryTree();

    @Test
    public void test() {
        TreeNode node = null;

        node = this.buildTree(new String[] { "1", "2", "3", });
        source.flatten(node);
        System.out.println(node);
        
        node = this.buildTree(new String[] { "1", "#", "2", });
        source.flatten(node);
        System.out.println(node);
        

    }
}
