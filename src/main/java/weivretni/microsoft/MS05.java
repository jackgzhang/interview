package weivretni.microsoft;

import weivretni.TreeNode;

/**
 * <pre>
 * 5.������С��k��Ԫ��
 * ��Ŀ������n���������������С��k����
 * ��������1��2��3��4��5��6��7��8��8�����֣�
 * ����С��4������Ϊ1��2��3��4��
 * </pre>
 * 
 * http://blog.csdn.net/v_JULY_v/article/details/6370650
 * 
 * @author gzhang
 * 
 */
public class MS05 {

    /********************************************************************************************
     * 3�� ��Ȼ����õİ취��ά��k��Ԫ�ص����ѣ�ԭ����������2������һ�£���������Ϊk�����Ѵ洢���ȱ����k����������Ǽ�����С��k����
     * ���ѷ�ʱO��k������k1<k2<...< kmax
     * ��kmax��Ϊ�󶥶������Ԫ�أ�������������У�ÿ�α���һ��Ԫ��x����Ѷ�Ԫ�رȽϣ�x<kmax�����¶ѣ���ʱlogk�������򲻸��¶ѡ�
     * �����������ܷ�ʱO��k+��n-k��*logk
     * ��=O��n*logk�����˷����������ڶ��У����ҵȸ������ʱ�临�ӶȾ�Ϊlogk����Ȼ����������˼·2������ֱ��������Ҳ�����ҳ�ǰk��С��Ԫ�أ���ʱO��n*k������
     *******************************************************************************************/
    public TreeNode method2(int array[], int k) {
        return null;
    }

    private TreeNode buildMaxHeapTree(int array[], int k) {
        return null;
    }
    
    private void insert(TreeNode root, int value) {
        if (root.left == null) {
            
        }
    }

    /********************************************************************************************
     * 4�� �����֮����141ҳ�Ͻⷨ�������������ƿ�������Ļ��ַ�����N����洢������S�У��ٴ����������ѡȡһ����X�����ѡȡ��ŦԪ����������������ʱ��O��N���ĸ��Ӷȣ��ڵڶ�����������
     * �����黮��ΪSa��Sb������
     * ��Sa<=X<=Sb�����Ҫ���ҵ�k��Ԫ��С��Sa��Ԫ�ظ����򷵻�Sa�н�С��k��Ԫ�أ����򷵻�Sa��k��С��Ԫ��+Sb��С��k-|Sa|��Ԫ�ء����������һ��
     * ������������ƿ��������partition�Ŀ���ѡ��SELECT�㷨Ѱ����С��k��Ԫ��
     * ������������������O��N���ĸ��Ӷȡ�����ֵ��һ����ǣ��������ѡ��SELECT�㷨��ѡȡ�����С���λ�����λ����Ϊ��ŦԪ��������ѡȡ��ŦԪ��
     * 
     * @param array
     * @param k
     * @return
     *******************************************************************************************/
    public int[] method1(int[] array, int k) {
        k = k - 1;
        int i = 0;
        int j = array.length - 1;
        int pos = 0;
        do {
            pos = partition(array, i, j);
            if (pos == k) {
                break;
            } else if (pos < k) {
                i = pos + 1;
            } else if (pos > k) {
                j = pos - 1;
            }
        } while (pos != k);

        return array;
    }

    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    /**
     * Quick sort, make sure pivot is in the right location. Return the last pivot location
     * http://www.cp.eng.chula.ac.th/~vishnu/datastructure/QuickSort.pdf
     * 
     * Always use the first element as pivot. and return the actual pivot location
     * 
     * <pre>
     *             4 3 6 9 2 4 3 1 2 1 8 9 3 5 6
     * choose pivot: 4   
     * search:     4 3 6 9 2 4 3 1 2 1 8 9 3 5 6
     * swap:       4 3 3 9 2 4 3 1 2 1 8 9 6 5 6
     * search:     4 3 3 9 2 4 3 1 2 1 8 9 6 5 6
     * swap:       4 3 3 1 2 4 3 1 2 9 8 9 6 5 6
     * search:     4 3 3 1 2 4 3 1 2 9 8 9 6 5 6
     * swap:       4 3 3 1 2 2 3 1 4 9 8 9 6 5 6
     * search:     4 3 3 1 2 2 3 1 4 9 8 9 6 5 6  (left > right)
     * swap with pivot:    1 3 3 1 2 2 3 4 4 9 8 9 6 5 6
     * 
     * </pre>
     * 
     * @param array
     * @param pivot
     * @return
     */
    private int partition(int[] array, int i, int j) {
        int pivot = i;
        int pivotValue = array[i];
        while (i < j) {

            i++;
            while (i < j && array[i] < pivotValue) {
                i++;
            }

            while (j > 0 && array[j] > pivotValue) {
                j--;
            }

            if (i < j) {
                swap(array, i, j);
            }
        }

        // Now switch i and pivot
        if (array[pivot] > array[j]) {
            swap(array, j, pivot);
            return j;
        } else {
            return pivot;
        }
    }
}
