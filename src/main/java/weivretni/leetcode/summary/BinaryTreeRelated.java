package weivretni.leetcode.summary;

import weivretni.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * 
 * <pre>
 * http://blog.csdn.net/fightforyourdream/article/details/16843303
 * http://blog.csdn.net/luckyxiaoqiang/article/details/7518888  轻松搞定面试中的二叉树题目 
 * http://www.cnblogs.com/Jax/archive/2009/12/28/1633691.html  算法大全（3） 二叉树 
 *  
 * TODO: 一定要能熟练地写出所有问题的递归和非递归做法！ 
 * 
 * 1. 求二叉树中的节点个数: getNodeNumRec（递归），getNodeNum（迭代） 
 * 2. 求二叉树的深度: getDepthRec（递归），getDepth  
 * 3. 前序遍历，中序遍历，后序遍历: preorderTraversalRec, preorderTraversal, inorderTraversalRec, postorderTraversalRec 
 * (https://en.wikipedia.org/wiki/Tree_traversal#Pre-order_2) 
 * 4.分层遍历二叉树（按层次从上往下，从左往右）: levelTraversal, levelTraversalRec（递归解法！） 
 * 5. 将二叉查找树变为有序的双向链表: convertBST2DLLRec, convertBST2DLL 
 * 6. 求二叉树第K层的节点个数：getNodeNumKthLevelRec, getNodeNumKthLevel 
 * 7. 求二叉树中叶子节点的个数：getNodeNumLeafRec, getNodeNumLeaf 
 * 8. 判断两棵二叉树是否相同的树：isSameRec, isSame 
 * 9. 判断二叉树是不是平衡二叉树：isAVLRec 
 * 10. 求二叉树的镜像（破坏和不破坏原来的树两种情况）：mirrorRec, mirrorCopyRec 
 * 10.1 判断两个树是否互相镜像：isMirrorRec 
 * 11. 求二叉树中两个节点的最低公共祖先节点：getLastCommonParent, getLastCommonParentRec, getLastCommonParentRec2 
 * 12. 求二叉树中节点的最大距离：getMaxDistanceRec 
 * 13. 由前序遍历序列和中序遍历序列重建二叉树：rebuildBinaryTreeRec 
 * 14.判断二叉树是不是完全二叉树：isCompleteBinaryTree, isCompleteBinaryTreeRec
 * 15. Q098_ValidateBinarySearchTree_Test
 * 16. Q099_RecoverBinarySearchTree
 * </pre>
 */
public class BinaryTreeRelated {

    // 1. 求二叉树中的节点个数: getNodeNumRec（递归），getNodeNum（迭代）
    /**
     * <pre>
     * 求二叉树中的节点个数递归解法： O(n) 
     * （1）如果二叉树为空，节点个数为0  
     * （2）如果二叉树不为空，二叉树节点个数 = 左子树节点个数 + 
     *            右子树节点个数 + 1
     * </pre>
     */
    public int getNodeNumRec(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            return 1 + getNodeNumRec(root.left) + getNodeNumRec(root.right);
        }
    }

    /**
     * 
     * <pre>
     *  求二叉树中的节点个数迭代解法O(n)：基本思想同LevelOrderTraversal， 
     *  即用一个Queue，在Java里面可以用LinkedList来模拟
     * </pre>
     */
    public int getNodeNum(TreeNode root) {
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();

        if (root == null) {
            return 0;
        } else {
            queue.push(root);
            int total = 0;

            while (!queue.isEmpty()) {
                TreeNode node = queue.pop();
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
                total++;
            }
            return total;
        }
    }

    // 2. 求二叉树的深度: getDepthRec（递归），getDepth
    public int getDepthRec(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            return Math.max(getDepthRec(root.left), getDepthRec(root.right)) + 1;
        }
    }

    // 2. 求二叉树的深度: 迭代解法： O(n)
    public int getDepth(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            // Queue contains all the node at the same level
            LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
            queue.push(root);

            int depth = 0;
            while (!queue.isEmpty()) {

                List<TreeNode> currLevel = new ArrayList<TreeNode>();
                while (!queue.isEmpty()) {
                    TreeNode node = queue.pop();
                    if (node.left != null) {
                        currLevel.add(node.left);
                    }

                    if (node.right != null) {
                        currLevel.add(node.right);
                    }
                }

                if (currLevel.size() > 0) {
                    queue.addAll(currLevel);
                }

                depth++;
            }

            return depth;
        }
    }

    // 3. 前序遍历 递归
    public void preorderTraversalRec(TreeNode root) {
        if (root == null) {
            return;
        } else {
            System.out.print(root.val + " ");
            preorderTraversalRec(root.left);
            preorderTraversalRec(root.right);
        }
    }

    // 3. 前序遍历 迭代
    public void preorderTraversal(TreeNode root) {
        if (root == null) {
            return;
        } else {
            LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
            queue.push(root);

            while (!queue.isEmpty()) {
                TreeNode node = queue.pop();
                System.out.print(node.val + " ");

                // 关键点：要先压入右孩子，再压入左孩子，这样在出栈时会先打印左孩子再打印右孩子
                if (node.right != null) {
                    queue.push(node.right);
                }
                if (node.left != null) {
                    queue.push(node.left);
                }

            }
        }
    }

    // 3. 中序遍历 递归
    public void inorderTraversalRec(TreeNode root) {
        if (root == null) {
            return;
        } else {
            inorderTraversalRec(root.left);
            System.out.print(root.val + " ");
            inorderTraversalRec(root.right);
        }
    }

    // 3. 中序遍历 迭代
    public void inorderTraversal(TreeNode root) {
        if (root == null) {
            return;
        } else {
            Stack<TreeNode> stack = new Stack<TreeNode>();

            TreeNode curr = root;
            while (true) {

                while (curr != null) { // 先添加一个非空节点所有的左孩子到栈
                    stack.push(curr);
                    curr = curr.left;
                }
                if (stack.isEmpty()) {
                    break;
                }

                curr = stack.pop(); // 因为此时已经没有左孩子了，所以输出栈顶元素

                System.out.print(curr.val + " ");

                curr = curr.right;
            }
        }
    }

    // 3. 后序遍历 递归
    public void postorderTraversalRec(TreeNode root) {
        if (root == null) {
            return;
        } else {
            postorderTraversalRec(root.left);
            postorderTraversalRec(root.right);
            System.out.print(root.val + " ");
        }
    }

    // 3. 后序遍历 迭代
    public void postorderTraversal(TreeNode root) {
        if (root == null) {
            return;
        } else {
            Stack<TreeNode> s = new Stack<TreeNode>(); // 第一个stack用于添加node和它的左右孩子
            Stack<TreeNode> output = new Stack<TreeNode>(); // 第二个stack用于翻转第一个stack输出

            s.push(root);
            while (!s.isEmpty()) {
                TreeNode cur = s.pop();
                output.push(cur);

                if (cur.left != null) {
                    s.push(cur.left);
                }

                if (cur.right != null) {
                    s.push(cur.right);
                }
            }

            while (!output.isEmpty()) {
                System.out.print(output.pop().val + " ");
            }
        }
    }

    // 4.分层遍历二叉树（按层次从上往下，从左往右）: levelTraversal, levelTraversalRec（递归解法！）
    public void levelTraversal(TreeNode root) {
        if (root == null) {
            return;
        } else {
            LinkedList<TreeNode> s = new LinkedList<TreeNode>();
            s.push(root);

            while (!s.isEmpty()) {
                TreeNode node = s.poll();
                if (node.left != null) {
                    s.add(node.left);
                }

                if (node.right != null) {
                    s.add(node.right);
                }

                System.out.print(node.val + " ");
            }
        }
    }

    // / 5. 将二叉查找树变为有序的双向链表:
    public TreeNode convertBST2DLLRec(TreeNode root) {
        if (root == null) {
            return null;
        } else {

            TreeNode rightChild = root.right;
            TreeNode leftChild = root.left;

            TreeNode head = root;
            if (leftChild != null) {
                TreeNode leftHead = convertBST2DLLRec(leftChild);
                head = leftHead;

                while (leftHead.right != null) {
                    leftHead = leftHead.right;
                }

                root.left = leftHead;
                leftHead.right = root;
            }

            if (rightChild != null) {
                TreeNode rightHead = convertBST2DLLRec(rightChild);
                root.right = rightHead;
                rightHead.left = root;
            }

            return head;
        }
    }

    /**
     * 5. 将二叉查找树变为有序的双向链表 迭代解法 类似inorder traversal的做法
     */
    public TreeNode convertBST2DLL(TreeNode root) {
        if (root == null) {
            return null;
        } else {
            TreeNode pre = null;
            Stack<TreeNode> s = new Stack<TreeNode>();
            while (true) {
                while (root != null) {
                    s.push(root);
                    root = root.left;
                }

                if (s.isEmpty()) {
                    break;
                }

                TreeNode node = s.pop();
                if (pre == null) {
                    pre = node;
                } else {
                    pre.right = node;
                    node.left = pre;
                    pre = node;
                }

                root = node.right;
            }

            while (pre.left != null) {
                pre = pre.left;
            }

            return pre;
        }
    }

    // 6. 求二叉树第K层的节点个数：getNodeNumKthLevelRec, getNodeNumKthLevel
    public int getNodeNumKthLevelRec(TreeNode root, int k) {
        if (root == null || k < 1) {
            return 0;
        } else {
            if (k == 1) {
                return 1;
            }
            return getNodeNumKthLevelRec(root.left, k - 1) + getNodeNumKthLevelRec(root.right, k - 1);
        }
    }

    // 6. 求二叉树第K层的节点个数： 迭代解法, getNodeNumKthLevel
    public int getNodeNumKthLevel(TreeNode root, int k) {
        if (root == null || k < 1) {
            return 0;
        } else {
            if (k == 1) {
                return 1;
            }

            LinkedList<TreeNode> sameLevelNodes = new LinkedList<TreeNode>();
            sameLevelNodes.push(root);
            int level = 1;

            while (!sameLevelNodes.isEmpty() && level < k) {
                LinkedList<TreeNode> nextLevelNodes = new LinkedList<TreeNode>();

                for (TreeNode node : sameLevelNodes) {
                    if (node.left != null) {
                        nextLevelNodes.add(node.left);
                    }
                    if (node.right != null) {
                        nextLevelNodes.add(node.right);
                    }
                }

                level++;
                sameLevelNodes.clear();
                sameLevelNodes.addAll(nextLevelNodes);
            }
            return sameLevelNodes.size();
        }
    }

    // 7. 求二叉树中叶子节点的个数：getNodeNumLeafRec, （递归）
    public int getNodeNumLeafRec(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            if (root.left == null && root.right == null) {
                return 1;
            } else {
                return (getNodeNumLeafRec(root.left) + getNodeNumLeafRec(root.right));
            }
        }
    }

    // 7. 求二叉树中叶子节点的个数, getNodeNumLeaf （迭代） 基于Level order traversal
    public int getNodeNumLeaf(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            LinkedList<TreeNode> sameLevelNodes = new LinkedList<TreeNode>();
            sameLevelNodes.push(root);

            while (!sameLevelNodes.isEmpty()) {

                LinkedList<TreeNode> nextLevelNodes = new LinkedList<TreeNode>();

                for (TreeNode node : sameLevelNodes) {
                    if (node.left != null) {
                        nextLevelNodes.add(node.left);
                    }
                    if (node.right != null) {
                        nextLevelNodes.add(node.right);
                    }
                }

                if (nextLevelNodes.size() > 0) {
                    sameLevelNodes.clear();
                    sameLevelNodes.addAll(nextLevelNodes);
                } else {
                    break;
                }
            }

            return sameLevelNodes.size();
        }
    }

    // 8. 判断两棵二叉树是否相同的树：isSameRec, isSame
    /**
     * <pre>
     * 判断两棵二叉树是否相同的树。 
     * 递归解法：  
     * （1）如果两棵二叉树都为空，返回真 
     * （2）如果两棵二叉树一棵为空，另一棵不为空，返回假  
     * （3）如果两棵二叉树都不为空，如果对应的左子树和右子树都同构返回真，其他返回假
     * </pre>
     */
    public boolean isSameRec(TreeNode r1, TreeNode r2) {
        if (r1 == null && r2 == null) {
            return true;
        } else if (r1 != null && r2 != null) {
            if (r1.val != r2.val) {
                return false;
            } else {
                return isSameRec(r1.left, r2.left) && isSameRec(r1.right, r2.right);
            }
        } else {
            return false;
        }
    }

    // 8. 判断两棵二叉树是否相同的树（迭代) 遍历一遍即可，这里用preorder
    public boolean isSame(TreeNode r1, TreeNode r2) {
        if (r1 == null && r2 == null) {
            return true;
        }

        if (r1 == null || r2 == null) {
            return false;
        }

        Stack<TreeNode> s1 = new Stack<TreeNode>();
        Stack<TreeNode> s2 = new Stack<TreeNode>();

        s1.push(r1);
        s2.push(r2);

        while (!s1.isEmpty() && !s2.isEmpty()) {
            TreeNode node1 = s1.pop();
            TreeNode node2 = s2.pop();

            if (node1.val != node2.val) {
                return false;
            }

            if (node1.right != null) {
                s1.push(node1.right);
            }
            if (node1.left != null) {
                s1.push(node1.left);
            }

            if (node2.right != null) {
                s2.push(node2.right);
            }
            if (node2.left != null) {
                s2.push(node2.left);
            }
        }

        return s1.isEmpty() && s2.isEmpty();
    }

    // 9. 判断二叉树是不是平衡二叉树：isAVLRec
    // 平衡二叉树（Balanced Binary Tree）又被称为AVL树（有别于AVL算法），且具有以下性质：它是一
    // 棵空树或它的左右两个子树的高度差的绝对值不超过1，并且左右两个子树都是一棵平衡二叉树
    public boolean isAVLRec(TreeNode root) {
        if (root == null) {
            return true;
        } else {
            int leftDepth = getDepth(root.left);
            int rightDepth = getDepth(root.right);

            return (isAVLRec(root.left) && isAVLRec(root.right) && Math.abs(leftDepth - rightDepth) <= 1);
        }
    }

    // 10. 求二叉树的镜像（破坏和不破坏原来的树两种情况）：mirrorRec, mirrorCopyRec
    /**
     * 求二叉树的镜像 递归解法： （1）如果二叉树为空，返回空 （2）如果二叉树不为空，求左子树和右子树的镜像，然后交换左子树和右子树
     */
    // 1. 破坏原来的树，把原来的树改成其镜像
    public TreeNode mirrorRec(TreeNode root) {
        if (root == null) {
            return root;
        } else {
            TreeNode leftMirror = mirrorRec(root.left);
            TreeNode rightMirror = mirrorRec(root.right);

            root.left = rightMirror;
            root.right = leftMirror;
            return root;
        }
    }

    // 2. 不能破坏原来的树，返回一个新的镜像树
    public TreeNode mirrorCopyRec(TreeNode root) {
        if (root == null) {
            return root;
        } else {
            TreeNode root1 = new TreeNode(root.val);
            TreeNode left = mirrorCopyRec(root.left);
            TreeNode right = mirrorCopyRec(root.right);

            root1.left = right;
            root1.right = left;

            return root1;
        }
    }

    // 3. 判断两个树是否互相镜像：isMirrorRec
    public boolean isMirrorRec(TreeNode r1, TreeNode r2) {
        if (r1 == null && r1 == null) {
            return true;
        }
        if (r1 == null || r2 == null) {
            return false;
        }

        // Both are not null;
        if (r1.val != r2.val) {
            return false;
        } else {
            return isMirrorRec(r1.left, r2.right) && isMirrorRec(r1.right, r2.left);
        }
    }

    /**
     * 11. 求二叉树中两个节点的最低公共祖先节点 递归解法： （1）如果两个节点分别在根节点的左子树和右子树，则返回根节点
     * （2）如果两个节点都在左子树，则递归处理左子树；如果两个节点都在右子树，则递归处理右子树
     */
    public TreeNode getLastCommonParentRec(TreeNode root, TreeNode n1, TreeNode n2) {

        boolean isN1Left = findNodeRec(root.left, n1);
        boolean isN2Left = findNodeRec(root.left, n2);

        if (isN1Left && isN2Left) {
            return getLastCommonParentRec(root.left, n1, n2);
        } else if (!isN1Left && !isN2Left) {
            return getLastCommonParentRec(root.right, n1, n2);
        } else {
            return root;
        }
    }

    private boolean findNodeRec(TreeNode root, TreeNode node) {

        if (root == null || node == null) {
            return false;
        }

        if (root.val == node.val) {
            return true;
        } else {
            return findNodeRec(root.left, node) || findNodeRec(root.right, node);
        }
    }

    /**
     * 11. 求二叉树中两个节点的最低公共祖先节点
     * 
     * 非递归解法： 先求从根节点到两个节点的路径，然后再比较对应路径的节点就行，最后一个相同的节点也就是他们在二叉树中的最低公共祖先节点
     */
    public TreeNode getLastCommonParent(TreeNode root, TreeNode n1, TreeNode n2) {
        if (root == null) {
            return null;
        } else {
            ArrayList<TreeNode> path1 = new ArrayList<TreeNode>();
            boolean existp1 = getNodePath(root, n1, path1);

            ArrayList<TreeNode> path2 = new ArrayList<TreeNode>();
            boolean existp2 = getNodePath(root, n2, path2);

            if (existp1 && existp2) {

                TreeNode commonParent = null;

                int index = 0;
                while (path1.size() >= 0 && path2.size() >= 0) {
                    TreeNode node1 = path1.get(index);
                    TreeNode node2 = path1.get(index);
                    if (node1.equals(node2)) {
                        commonParent = node1;
                    } else {
                        break;
                    }
                }

                return commonParent;
            } else {
                return null;
            }
        }
    }

    // 把从根节点到node路径上所有的点都添加到path中
    private boolean getNodePath(TreeNode root, TreeNode node, ArrayList<TreeNode> path) {
        if (root == null) {
            return false;
        } else {
            path.add(root);

            if (getNodePath(root.left, node, path)) {
                return true;
            } else if (getNodePath(root.right, node, path)) {
                return true;
            } else {
                path.remove(path.size() - 1);
                return false;
            }
        }
    }

    /**
     * 12 求二叉树中节点的最大距离 即二叉树中相距最远的两个节点之间的距离。 (distance / diameter) 递归解法：
     * （1）如果二叉树为空，返回0，同时记录左子树和右子树的深度，都为0 （2）如果二叉树不为空，最大距离要么是左子树中的最大距离，要么是右子树中的最大距离，
     * 要么是左子树节点中到根节点的最大距离+右子树节点中到根节点的最大距离， 同时记录左子树和右子树节点中到根节点的最大距离。
     * 
     * http://www.cnblogs.com/miloyip/archive/2010/02/25/1673114.html
     * 
     * 计算一个二叉树的最大距离有两个情况:
     * 
     * 情况A: 路径经过左子树的最深节点，通过根节点，再到右子树的最深节点。 情况B: 路径不穿过根节点，而是左子树或右子树的最大距离路径，取其大者。
     * 只需要计算这两个情况的路径距离，并取其大者，就是该二叉树的最大距离
     */
    public Result getMaxDistanceRec(TreeNode root) {
        if (root == null) {
            return new Result(0, 0);
        } else {
            Result maxLeft = getMaxDistanceRec(root.left);
            Result maxRight = getMaxDistanceRec(root.right);

            Result result = new Result();
            result.maxDepth = Math.max(maxLeft.maxDepth, maxRight.maxDepth) + 1;
            result.maxDistance = Math.max(Math.max(maxLeft.maxDistance, maxRight.maxDistance), maxLeft.maxDepth + maxRight.maxDepth);
            return result;
        }
    }

    private class Result {

        int maxDistance;
        int maxDepth;

        public Result() {
        }

        public Result(int maxDistance, int maxDepth) {
            this.maxDistance = maxDistance;
            this.maxDepth = maxDepth;
        }
    }

    // 13. 由前序遍历序列和中序遍历序列重建二叉树：rebuildBinaryTreeRec
    /**
     * 感觉这篇是讲的最为清晰的:
     * http://crackinterviewtoday.wordpress.com/2010/03/15/rebuild-a-binary-tree-from-inorder
     * -and-preorder-traversals/
     */
    public TreeNode rebuildBinaryTreeRec(List<Integer> preOrder, List<Integer> inOrder) {
        TreeNode root = new TreeNode(preOrder.get(0));

        if (preOrder.size() > 1) {
            // Locate the root value in the inOrder
            int index = 0;
            while (index < inOrder.size()) {
                if (preOrder.get(0) == inOrder.get(index)) {
                    break;
                }
                index++;
            }

            if (index > 0) {
                TreeNode leftRoot = rebuildBinaryTreeRec(preOrder.subList(1, index + 1), inOrder.subList(0, index));
                root.left = leftRoot;
            }

            if (index < preOrder.size()) {
                TreeNode rightRoot = rebuildBinaryTreeRec(preOrder.subList(index + 1, preOrder.size()), inOrder.subList(index + 1, inOrder.size()));
                root.right = rightRoot;
            }
        }

        return root;
    }

    /**
     * <pre>
     *     14.  判断二叉树是不是完全二叉树（迭代） 
     *     若设二叉树的深度为h，除第 h 层外，其它各层 (1～h-1) 的结点数都达到最大个数， 
     *     第 h 层所有的结点都连续集中在最左边，这就是完全二叉树。 
     *     有如下算法，按层次（从上到下，从左到右）遍历二叉树，当遇到一个节点的左子树为空时， 
     *     则该节点右子树必须为空，且后面遍历的节点左右子树都必须为空，否则不是完全二叉树。
     * </pre>
     */
    public boolean isCompleteBinaryTree(TreeNode root) {
        if (root == null) {
            return false;
        } else {
            LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
            queue.push(root);

            boolean shouldBeEmpty = false;
            while (!queue.isEmpty()) {

                TreeNode node = queue.remove();

                if (shouldBeEmpty) {
                    if (node.left != null || node.right != null) {
                        return false;
                    }
                } else {
                    if (node.left != null && node.right != null) {
                        queue.add(node.left);
                        queue.add(node.right);
                    } else if (node.left != null && node.right == null) {
                        shouldBeEmpty = true;
                        queue.add(node.left);
                    } else if (node.left == null && node.right != null) {
                        return false;
                    } else {
                        shouldBeEmpty = true;
                    }
                }

            }

            return true;
        }
    }
}
