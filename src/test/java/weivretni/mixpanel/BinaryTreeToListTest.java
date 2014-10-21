package weivretni.mixpanel;

import org.junit.Test;

import weivretni.BaseTest;
import weivretni.TreeNode;
import weivretni.Utils;
import weivretni.mixpanel.BinaryTreeToList;

public class BinaryTreeToListTest extends BaseTest {

    private BinaryTreeToList source = new BinaryTreeToList();

    @Test
    public void test() {
        TreeNode root = source.convert(Utils.getBinaryTree1(), true);

        //root = Utils.getBinaryTree1();

        do {
            System.out.println(root.val);
            root = root.left;
        } while (root.left != null);
        
        System.out.println(root.val);
    }
}
