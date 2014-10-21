package weivretni;

import java.util.List;

public class Utils {

    public static String getMax(String s1, String s2, String s3) {
        if (s1.length() >= s2.length() && s1.length() >= s3.length()) {
            return s1;
        }

        if (s2.length() >= s1.length() && s2.length() >= s3.length()) {
            return s2;
        }
        return s3;
    }

    public static int getMax(int s1, int s2, int s3) {
        return Math.max(Math.max(s1, s2), s3);
    }

    public static int[] toArray(List<Integer> list) {
        int[] result = new int[list.size()];

        int i = 0;
        for (Integer number : list) {
            result[i++] = number;
        }

        return result;
    }

    public static int[] subArrayExcludeIndex(int[] src, int start, int end, int excludeIndex) {
        int length = end - start;
        int[] dest = new int[length];

        int j = 0;
        for (int i = 0; i < src.length; i++) {
            if (i != excludeIndex) {
                dest[j++] = src[i];
            }
        }

        return dest;
    }

    /**
     * Return sub array
     * 
     * @param src
     * @param start
     * @param end
     * @return
     */
    public static int[] subArray(int[] src, int start, int end) {
        int length = end - start + 1;
        int[] dest = new int[length];
        System.arraycopy(src, start, dest, 0, length);

        return dest;
    }

    public static String nicePrintArray(int[] array) {
        StringBuffer sb = new StringBuffer();
        for (int i : array) {
            sb.append(i).append(",");
        }
        return sb.toString();
    }

    public static void preOrderTraverseTree(Node root) {
        if (root != null) {
            System.out.println(root.getValue());
            if (root.getLeft() != null) {
                preOrderTraverseTree(root.getLeft());
            }

            if (root.getRight() != null) {
                preOrderTraverseTree(root.getRight());
            }
        }
    }

    public static void inOrderTraverseTree(Node root) {
        if (root != null) {

            if (root.getLeft() != null) {
                inOrderTraverseTree(root.getLeft());
            }

            System.out.println(root.getValue());

            if (root.getRight() != null) {
                inOrderTraverseTree(root.getRight());
            }
        }
    }

    /**
     * <pre>
     *      3
     *   2      5
     * 1     4     6
     * </pre>
     */
    public static TreeNode getBinaryTree1() {

        TreeNode root = new TreeNode(3);
        TreeNode left2 = new TreeNode(2);
        TreeNode left1 = new TreeNode(1);
        TreeNode left4 = new TreeNode(4);
        TreeNode right5 = new TreeNode(5);
        TreeNode right6 = new TreeNode(6);

        root.left = left2;
        root.right = right5;
        left2.left = left1;
        right5.right = right6;
        right5.left = left4;

        return root;
    }

    /**
     * <pre>
     *      3
     *   2      5
     * 10     4     6
     * </pre>
     */
    public static TreeNode getInvalidBinaryTree1() {

        TreeNode root = new TreeNode(3);
        TreeNode left2 = new TreeNode(2);
        TreeNode left10 = new TreeNode(10);
        TreeNode left4 = new TreeNode(4);
        TreeNode right5 = new TreeNode(5);
        TreeNode right6 = new TreeNode(6);

        root.left = left2;
        root.right = right5;
        left2.left = left10;
        right5.right = right6;
        right5.left = left4;

        return root;
    }

    /**
     * Generate a list but skip certain numbers. 1,2,3,4,5,6,7,8,9,10
     * 
     * @return
     */
    public static ListNode getSortedList(int skip) {

        ListNode head = new ListNode(0);
        ListNode head2 = head;
        for (int i = 1; i <= 11; i++) {

            if (i == skip)
                continue;

            ListNode l = new ListNode(i);
            head2.next = l;
            l.pre = head2;
            head2 = l;
        }

        return head;
    }

    /**
     * 1,2,3,4,5,6,7,8,9,10
     * 
     * @return
     */
    public static ListNode getSortedList() {

        ListNode head = new ListNode(0);
        ListNode head2 = head;
        for (int i = 1; i <= 11; i++) {
            ListNode l = new ListNode(i);
            head2.next = l;
            l.pre = head2;
            head2 = l;
        }

        return head;
    }
}