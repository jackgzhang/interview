package weivretni.leetcode;

import weivretni.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * <pre>
 * Two elements of a binary search tree (BST) are swapped by mistake.
 * 
 * Recover the tree without changing its structure.
 * 
 * Note:
 * A solution using O(n) space is pretty straight forward. Could you 
 * 
 * devise a constant space solution?
 * </pre>
 * 
 * <pre>
 * 
 * http://jane4532.blogspot.com/2013/07/recover-binary-search-treeleetcode.html
 * 
 * 这道题思路很巧妙。刚开始我想穷举所有的情况，然后swap two nodes，后来发现这样做太不现实了。
 * 
 * 并且code很冗长。在网上看到说用in-order，刚开始没想到关in-order啥事儿。后来想到，
 * 
 * 因为是binary search tree,所以 in-order traverse得到的array应该是一个递增序列，
 * 
 * 这样我们就可以把这棵树看作一个array，然后只是其中两个点儿被swap了，
 * 
 * 找到这两个点，再swap回来就好，这样就不用考虑那些各种情况了。
 * 
 * 
 * 用2个pointer，一个是pre，一个是current，若是current->val
 * 
 * <pre->
 * val, 那么纪录下pre and curr (因为也许pre和cur就是一对）, 遇到下一个再纪录下cur。以免遇到只有两个点儿的情况，要判断一下要不要纪录pre。
 * 
 * 然后就是in-order traverse的变体。
 * 还有一个分析得比较多的解法，可以看看 http://fisherlei.blogspot.com/2012/12/leetcode-recover-binary-search-tree.html
 * </pre>
 * 
 * 
 */
public class Q099_RecoverBinarySearchTree {

    TreeNode pre      = null;
    List<TreeNode> unsorted = null;

    public void recoverTree(TreeNode root) {
        unsorted = new ArrayList<TreeNode>();

        findNode(root);

        // swap
        int tmp = unsorted.get(0).val;
        unsorted.get(0).val = unsorted.get(unsorted.size() - 1).val;
        unsorted.get(unsorted.size() - 1).val = tmp;
    }

    // Standard in-order-traversal
    private void findNode(TreeNode root) {
        Stack<TreeNode> stack = new Stack();
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            TreeNode n = stack.pop();
            if (pre != null) {
                if (pre.val > n.val) {
                    unsorted.add(pre);
                    unsorted.add(n);
                }
            }
            pre = n;

            // continue the right nodes
            root = n.right;
        }
    }
}
