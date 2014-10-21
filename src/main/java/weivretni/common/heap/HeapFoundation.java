package weivretni.common.heap;

import weivretni.TreeNode;

/**
 * (1) ����Ū�����ѵ����ֲ���(ͼ��+����)��JAVA�� http://128kj.iteye.com/blog/1728555
 * 
 * @author gzhang
 * 
 */
public class HeapFoundation {

    /**
     * <pre>
     * ���� 
     *     ���ж�Ӧһ����ȫ�������������һ����֧��㣨n div 2����ʼ������1��Ϊֹ�����ζ�ÿ����֧�����е����³������Ա��γ���ÿ����֧���Ϊ��Ķѣ���������������е����������ͱ����һ���ѡ� 
     *   ʱ�䣺O(n) 
     * ����ͼ������,Ҫʹ���Ϊ��,���Ǵ����һ����֧���(10/2),��ֵΪ72��ʼ,���ζ�ÿ����֧�ڵ�53,18,36 45���е���(�³�).
     * </pre>
     * 
     * @param array
     * @return
     */
    public static TreeNode init(int[] array) {
        // init tree sequeitially
        TreeNode root = build(array, 0, array.length - 1);

        // Heapfiy
        HeapifyTree(root);

        return null;
    }

    private static void HeapifyTree(TreeNode node) {

    }

    private static void MaxHeapifyTreeHelper(TreeNode node) {
        if (node.left == null && node.right == null) {
            return;
        } else {

            boolean switchWithLeft = false;

            // which way to switch ?
            if (node.left == null) {
                if (node.right.val > node.val) {
                    switchWithLeft = false;
                } else if (node.right.val < node.val) {
                    return;
                }
            } else if (node.right == null) {
                if (node.left.val > node.val) {
                    switchWithLeft = true;
                } else {
                    return;
                }
            } else {
                // Both have values
                
            }

        }
        if (node.left != null && node.right != null) {
            if (node.val > node.left.val && node.val > node.right.val) {
                // No adjust
            } else {

                if (node.left.val < node.right.val) {
                    if (node.right.val > node.val) {
                        int tmp = node.val;
                        node.val = node.right.val;
                        node.right.val = tmp;

                        MaxHeapifyTreeHelper(node.right);
                    }
                } else if (node.left.val > node.right.val) {

                }
            }
        }
    }

    private static TreeNode build(int[] array, int i, int j) {
        int mid = (i + j) / 2;

        TreeNode root = new TreeNode(array[mid]);

        if (i < mid) {
            TreeNode left = build(array, i, mid);
            root.left = left;
        }

        if (j > mid) {
            TreeNode right = build(array, mid, j);
            root.right = right;
        }

        return root;

    }
}
