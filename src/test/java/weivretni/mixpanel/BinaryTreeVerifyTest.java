package weivretni.mixpanel;

import junit.framework.Assert;

import org.junit.Test;

import weivretni.Utils;

public class BinaryTreeVerifyTest {

    private BinaryTreeVerify source = new BinaryTreeVerify();

    @Test
    public void testRecursive() {
        Assert.assertTrue(source.verifyRecursive(Utils.getBinaryTree1()));
        Assert.assertFalse(source.verifyRecursive(Utils.getInvalidBinaryTree1()));
        
        Assert.assertTrue(source.verifyIterative(Utils.getBinaryTree1()));
        Assert.assertFalse(source.verifyIterative(Utils.getInvalidBinaryTree1()));
    }
}
