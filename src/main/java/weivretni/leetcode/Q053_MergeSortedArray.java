package weivretni.leetcode;

/**
 * Assume a has enough length. merge from back;
 * 
 * @author gzhang
 * 
 */
public class Q053_MergeSortedArray {

    public int[] merge(int a[], int b[]) {

        int k = a.length + b.length - 1;
        int[] c = new int[k + 1];

        int i = a.length - 1;
        int j = b.length - 1;

        while (i >= 0 && j >= 0) {
            if (a[i] >= b[j]) {
                c[k--] = a[i--];
            } else {
                c[k--] = b[j--];
            }
        }

        while (j >= 0) {
            c[k--] = b[j--];
        }

        while (i >= 0) {
            c[k--] = a[i--];
        }

        return c;

    }
}
