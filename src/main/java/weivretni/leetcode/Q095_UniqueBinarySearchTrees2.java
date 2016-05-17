package weivretni.leetcode;

import weivretni.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 * Given n, generate all structurally unique BST's (binary search trees) that store values 1...n.
 * 
 * For example,
 * Given n = 3, your program should return all 5 unique BST's shown below.
 * 
 *    1         3     3      2      1
 *     \       /     /      / \      \
 *      3     2     1      1   3      2
 *     /     /       \                 \
 *    2     1         2                 3
 * </pre>
 * 
 * @author gzhang
 *
 */
public class Q095_UniqueBinarySearchTrees2 {

    public List<TreeNode> generateTrees(int n) {
        if (n < 0) {
            List<TreeNode> result = new ArrayList<TreeNode>();
            return result;
        } else {
            List<Integer> numbers = new ArrayList<Integer>();
            for (int i = 1; i <= n; i++) {
                numbers.add(i);
            }

            return getTrees(numbers);

        }
    }

    private List<TreeNode> getTrees(List<Integer> numbers) {

        List<TreeNode> aresult = new ArrayList<TreeNode>();

        if (numbers.size() == 1) {
            aresult.add(new TreeNode(numbers.get(0)));
        } else {
            for (int i = 0; i < numbers.size(); i++) {

                List<TreeNode> lefts = null;
                if (i > 0) {
                    // left child
                    lefts = getTrees(numbers.subList(0, i));
                }

                List<TreeNode> rights = null;
                if (i < numbers.size() - 1) {
                    rights = getTrees(numbers.subList(i + 1, numbers.size()));
                }

                // Now construct;
                if (lefts == null || rights == null) {
                    if (lefts != null) {
                        for (TreeNode left : lefts) {
                            TreeNode root = new TreeNode(numbers.get(i));
                            root.left = left;
                            aresult.add(root);
                        }
                    } else {
                        for (TreeNode right : rights) {
                            TreeNode root = new TreeNode(numbers.get(i));
                            root.right = right;
                            aresult.add(root);
                        }
                    }
                } else {
                    for (TreeNode left : lefts) {
                        for (TreeNode right : rights) {
                            TreeNode root = new TreeNode(numbers.get(i));
                            root.left = left;
                            root.right = right;
                            aresult.add(root);
                        }
                    }
                }
            }
        }

        return aresult;
    }
}
