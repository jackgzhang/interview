package weivretni;

import java.util.List;

import junit.framework.Assert;

public class BaseTest {

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

    // ���ر��ʽexpr��ֵ
    public int evaluate(String expr) {
        // Locate the first operator
        int location = 0;
        
        for (int i = 0 ;i < expr.length(); i++) {
            if (isOp(expr.charAt(i))) {
                location = i;
                break;
            }
        }    
        
        int number = Integer.parseInt(expr.substring(0,location));
        
        
        if (location == expr.length() - 1) {
            return number;
        }
        
        
        char op = expr.charAt(location);
        if (op == '+') {
            return number + evaluate(expr.substring(location + 1));
        }else if (op == '-') {
            return number - evaluate(expr.substring(location + 1));
        }else if (op == '*') {
            // continue execution the expr
            for (int i = 0 ;i < expr.length(); i++) {
                if (isNonMultiple(expr.charAt(i)))   {
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

    /**
     * 1 2,3,4,5,6
     */
    protected ListNode getListNode1() {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        ListNode l6 = new ListNode(6);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = l6;

        return l1;
    }

    /**
     * 6,5,4,3,2,1
     */
    protected ListNode getListNode2() {
        ListNode l1 = new ListNode(6);
        ListNode l2 = new ListNode(5);
        ListNode l3 = new ListNode(4);
        ListNode l4 = new ListNode(3);
        ListNode l5 = new ListNode(2);
        ListNode l6 = new ListNode(1);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = l6;

        return l1;
    }

    protected String nicePrintListNode(ListNode l) {
        StringBuilder sb = new StringBuilder();
        while (l != null) {
            sb.append(l.val).append(" ");
            l = l.next;
        }
        return sb.toString();
    }

}
