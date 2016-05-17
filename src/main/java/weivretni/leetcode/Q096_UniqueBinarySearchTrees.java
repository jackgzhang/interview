package weivretni.leetcode;

/**
 * <pre>
 * Given n, how many structurally unique BST's (binary search trees) that store values 1...n?
 * 
 * For example,
 * Given n = 3, there are a total of 5 unique BST's.
 * 
 *    1         3     3      2      1
 *     \       /     /      / \      \
 *      3     2     1      1   3      2
 *     /     /       \                 \
 *    2     1         2                 3
 * </pre>
 * 
 * <pre>
 * 本题使用一维线性规划解决。
 * 如果n等于0时，结果为0；
 * 如果n等于1时，只有一个节点，结果为1；
 * 如果n等于2时，根节点有两种选择，结果为2；
 * 如果n大于3时，根节点有n种选择，确定根节点后分别计算左右子树的可能情况，
 *             然后相乘就是当前根节点下所有的变形种类，之后在求和即可。算法实现如
 * 
 * 
 * 
 * 以 1 为根的树的个数，等于左子树的个数乘以右子树的个数，左子树是 0 个元素的树，右子树是 2 个元素的树。
 * 
 * 以 2 为根的树的个数，等于左子树的个数乘以右子树的个数，左子树是 1个元素的树，右子树也是 1 个元素的树。依此类推。
 * 当数组为 1; 2; 3; .....; n 时，基于以下原则的构建的 BST 树具有唯一性：以 i 为根节点的树，其左子树由 [1, i-1] 构成，其右子树由 [i+1, n] 构成。*
 *
 *
 * https://lefttree.gitbooks.io/leetcode/content/dynamicProgramming2/uniqueBinarySearchTree.html
 *
 *
 * d[0] = 1
 * d[1] = 1
 * d[2] = d[0]*d[1] * d[1]*d[0[
 * d[3] = d[0]*d[2] + d[1]*d[1] + d[2]*d[0]
 *
 * </pre>
 *
 */
public class Q096_UniqueBinarySearchTrees {

    public int numTrees(int n) {
        int[] bst = new int[n + 1];
        bst[0] = 1;
        bst[1] = 1;
        bst[2] = 2;
        for (int root = 3; root <= n; root++) {
            for (int left = 0; left < root; left++) {
                int right = root - left - 1;
                bst[root] += bst[left] * bst[right];
            }
        }

        return bst[n];
    }
}
