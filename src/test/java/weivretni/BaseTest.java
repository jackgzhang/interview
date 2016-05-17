package weivretni;

import junit.framework.Assert;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


class Tesstt {
    static int i = 0;
    
    public int test() {
        try {
            return 1;
        }finally{
            return 2;
        }
    }
}

public class BaseTest {

    
    public static void main(String[] args) {
        Tesstt t = new Tesstt();
        System.out.println(t.test());
        System.out.println(Tesstt.i);
    }
    
    protected void assertEquals(String[] source, String[] target) {

        StringBuffer sb1 = new StringBuffer();
        for (String i : source) {
            sb1.append(i).append(",");
        }

        StringBuffer sb2 = new StringBuffer();
        for (String i : target) {
            sb2.append(i).append(",");
        }

        Assert.assertEquals(sb1.toString().intern(), sb2.toString().intern());

    }

    protected void assertEquals(int[] source, int[] target) {

        StringBuffer sb1 = new StringBuffer();
        for (int i : source) {
            sb1.append(i).append(",");
        }

        StringBuffer sb2 = new StringBuffer();
        for (int i : target) {
            sb2.append(i).append(",");
        }

        Assert.assertEquals(sb1.toString().intern(), sb2.toString().intern());

    }

    protected void assertEquals(ListNode node1, ListNode node2) {
        while (node1 != null && node2 != null) {
            if (node1.val != node2.val) {
                Assert.fail(node1.val + " <> " + node2.val);
            }
            node1 = node1.next;
            node2 = node2.next;
        }

        if (node1 != null || node2 != null) {
            Assert.fail("length are different");
        }
    }


    protected void assertEquals(List<Integer> source, int[] target) {

        StringBuffer sb1 = new StringBuffer();
        for (int i : source) {
            sb1.append(i).append(",");
        }

        StringBuffer sb2 = new StringBuffer();
        for (int i : target) {
            sb2.append(i).append(",");
        }

        Assert.assertEquals(sb1.toString().intern(), sb2.toString().intern());

    }


    protected void assertEquals(List<Integer> source, List<Integer> target) {

        StringBuffer sb1 = new StringBuffer();
        for (int i : source) {
            sb1.append(i).append(",");
        }

        StringBuffer sb2 = new StringBuffer();
        for (int i : target) {
            sb2.append(i).append(",");
        }

        Assert.assertEquals(sb1.toString().intern(), sb2.toString().intern());

    }

    protected void assertEquals(int[] source, List<Integer> target) {

        StringBuffer sb1 = new StringBuffer();
        for (int i : source) {
            sb1.append(i).append(",");
        }

        StringBuffer sb2 = new StringBuffer();
        for (int i : target) {
            sb2.append(i).append(",");
        }

        Assert.assertEquals(sb1.toString().intern(), sb2.toString().intern());

    }

    private boolean isOp(char c) {
        return c == '+' || c == '*' || c == '-';
    }

    private boolean isNonMultiple(char c) {
        return c == '+' || c == '-';
    }

    public int evaluate(String expr) {
        // Locate the first operator
        int location = 0;

        for (int i = 0; i < expr.length(); i++) {
            if (isOp(expr.charAt(i))) {
                location = i;
                break;
            }
        }

        int number = Integer.parseInt(expr.substring(0, location));

        if (location == expr.length() - 1) {
            return number;
        }

        char op = expr.charAt(location);
        if (op == '+') {
            return number + evaluate(expr.substring(location + 1));
        } else if (op == '-') {
            return number - evaluate(expr.substring(location + 1));
        } else if (op == '*') {
            // continue execution the expr
            for (int i = 0; i < expr.length(); i++) {
                if (isNonMultiple(expr.charAt(i))) {
                    location = i;
                    break;
                }
            }

        }
        return 1;

    }

    protected TreeNode getCompleteBinaryTree1() {
        /**
         * <pre>
         *      1
         *   2      3
         * 4   5
         * </pre>
         */
        TreeNode root = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);

        root.left = node2;
        node2.left = node4;
        node2.right = node5;
        root.right = node3;

        return root;

    }

    protected TreeNode getTreeNode1() {
        /**
         * <pre>
         *      3
         *   2      5
         * 1     4     6
         * </pre>
         */
        TreeNode root = new TreeNode(3);
        TreeNode left2 = new TreeNode(2);
        TreeNode left1 = new TreeNode(1);
        TreeNode left4 = new TreeNode(4);
        TreeNode right5 = new TreeNode(5);
        TreeNode right6 = new TreeNode(6);

        root.left = left2;
        left2.parent = root;
        root.right = right5;
        right5.parent = root;
        left2.left = left1;
        left1.parent = left2;
        right5.right = right6;
        right6.parent = right5;
        right5.left = left4;
        left4.parent = right5;

        return root;
    }

    protected TreeNode getTreeNode2() {
        /**
         * <pre>
         *       3
         *            5
         *         4     6
         *       2          7
         *      1              8
         * 
         * </pre>
         */
        TreeNode n3 = new TreeNode(3);
        TreeNode n2 = new TreeNode(2);
        TreeNode n1 = new TreeNode(1);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        TreeNode n6 = new TreeNode(6);
        TreeNode n7 = new TreeNode(7);
        TreeNode n8 = new TreeNode(8);

        n3.right = n5;
        n5.left = n4;
        n5.right = n6;
        n4.left = n2;
        n2.left = n1;
        n6.right = n7;
        n7.right = n8;

        return n3;
    }

    protected ListNode getListNode(int[] num) {
        if (num == null || num.length == 0) {
            return null;
        } else {

            ListNode head = new ListNode(num[0]);

            ListNode currHead = head;
            for (int i = 1; i < num.length; i++) {
                ListNode node = new ListNode(num[i]);
                currHead.next = node;
                currHead = node;
            }

            return head;
        }
    }

    /**
     * 1 2,3,4,5,6
     */
    protected ListNode getListNode1() {
        return getListNode(new int[] { 1, 2, 3, 4, 5, 6 });
    }

    /**
     * 6,5,4,3,2,1
     */
    protected ListNode getListNode2() {
        return getListNode(new int[] { 6, 5, 4, 3, 2, 1 });
    }

    /**
     * 1 2,3,4,5
     */
    protected ListNode getListNode3() {
        return getListNode(new int[] { 1, 2, 3, 4, 5 });
    }

    /**
     * 
     * The serialization of a binary tree follows a level order traversal, where '#' signifies a path terminator
     * 
     * where no node exists below.
     * 
     * {1,2,3,4,#,#,5} ->
     * 
     * <pre>
     *        1
     *     2     3
     *    4       5
     * 
     * </pre>
     * 
     * @return the root
     */
    protected TreeNode buildTree(String[] values) {
        return buildTreeHelper(values, 0);
    }

    private TreeNode buildTreeHelper(String[] values, int pos) {

        if (pos > values.length - 1) {
            return null;
        }

        if (values[pos].equals("#")) {
            return null;
        }

        TreeNode node = new TreeNode(Integer.valueOf(values[pos]));
        TreeNode left = buildTreeHelper(values, (pos + 1) * 2 - 1);
        TreeNode right = buildTreeHelper(values, (pos + 1) * 2);

        node.left = left;
        node.right = right;

        return node;

    }

    protected TreeLinkNode buildLinkedTree(String[] values) {
        return buildLinkTreeHelper(values, 0);
    }

    private TreeLinkNode buildLinkTreeHelper(String[] values, int pos) {

        if (pos > values.length - 1) {
            return null;
        }

        if (values[pos].equals("#")) {
            return null;
        }

        TreeLinkNode node = new TreeLinkNode(Integer.valueOf(values[pos]));
        TreeLinkNode left = buildLinkTreeHelper(values, (pos + 1) * 2 - 1);
        TreeLinkNode right = buildLinkTreeHelper(values, (pos + 1) * 2);

        node.left = left;
        node.right = right;

        return node;

    }

    /**
     * 
     * <pre>
     * 
     * {0,1,2#1,2#2,2} ->
     * 
     *        1
     *       / \
     *      /   \
     *     0 --- 2
     *          / \
     *          \_/
     * </pre>
     * 
     * @param values
     */
    protected UndirectedGraphNode buildUndirectedGraphNode(String values) {

        Map<Integer, UndirectedGraphNode> nodeMap = new HashMap<Integer, UndirectedGraphNode>();
        Integer aLabel = null;
        String[] nodes = values.split("\\#");

        for (String nodeStr : nodes) {
            String[] node = nodeStr.split(",");

            Integer label = Integer.valueOf(node[0]);
            UndirectedGraphNode currNode = null;

            if (nodeMap.containsKey(label)) {
                currNode = nodeMap.get(label);
            } else {
                currNode = new UndirectedGraphNode(label);
            }

            aLabel = label;

            nodeMap.put(label, currNode);

            for (int i = 1; i < node.length; i++) {
                Integer neilabel = Integer.valueOf(node[i]);

                UndirectedGraphNode currNeiNode = null;
                if (nodeMap.containsKey(neilabel)) {
                    currNeiNode = nodeMap.get(neilabel);
                } else {
                    currNeiNode = new UndirectedGraphNode(neilabel);
                }

                addNeighbours(currNode, currNeiNode);
                addNeighbours(currNeiNode, currNode);

                nodeMap.put(neilabel, currNeiNode);
            }
        }

        return nodeMap.get(aLabel);

    }

    private void addNeighbours(UndirectedGraphNode currNode, UndirectedGraphNode neighbourNode) {

        boolean found = false;
        for (UndirectedGraphNode node : currNode.neighbors) {
            if (node.label == (neighbourNode.label)) {
                found = true;
            }
        }

        if (!found) {
            currNode.neighbors.add(neighbourNode);
        }
    }

    protected String nicePrintListNode(ListNode l) {
        StringBuilder sb = new StringBuilder();
        while (l != null) {
            sb.append(l.val).append(" ");
            l = l.next;
        }
        return sb.toString();
    }

    protected String[] toList(List<String> list) {
        String[] result = new String[list.size()];
        int i = 0;
        for (String value : list) {
            result[i++] = value;
        }
        return result;
    }
}
