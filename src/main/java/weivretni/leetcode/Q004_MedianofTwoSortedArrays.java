package weivretni.leetcode;

import java.util.Arrays;

/**
 * There are two sorted arrays A and B of size m and n respectively.
 * 
 * Find the median of the two sorted arrays.
 * 
 * The overall run time complexity should be O(log (m+n)).
 * 
 * http://fisherlei.blogspot.com/2012/12/leetcode-median-of-two-sorted-arrays.html
 * http://www.lifeincode.net/programming/leetcode-median-of-two-sorted-arrays-java/
 * 
 * @author gzhang
 * 
 */
public class Q004_MedianofTwoSortedArrays {

    public double findMedianSortedArrays(int A[], int B[]) {
        int lengthA = A.length;
        int lengthB = B.length;
        if ((lengthA + lengthB) % 2 == 0) {
            double r1 = (double) findMedianSortedArrays(A, 0, lengthA, B, 0, lengthB, (lengthA + lengthB) / 2);
            double r2 = (double) findMedianSortedArrays(A, 0, lengthA, B, 0, lengthB, (lengthA + lengthB) / 2 + 1);
            return (r1 + r2) / 2;
        } else
            return findMedianSortedArrays(A, 0, lengthA, B, 0, lengthB, (lengthA + lengthB + 1) / 2);

    }

    public int findMedianSortedArrays(int A[], int startA, int endA, int B[], int startB, int endB, int k) {
        int n = endA - startA;
        int m = endB - startB;

        if (n <= 0)
            return B[startB + k - 1];
        if (m <= 0)
            return A[startA + k - 1];


        int midA = (startA + endA) / 2;
        int midB = (startB + endB) / 2;

        if (A[midA] <= B[midB]) {
            if (n / 2 + m / 2 + 1 >= k)
                return findMedianSortedArrays(A, startA, endA, B, startB, midB, k);
            else
                return findMedianSortedArrays(A, midA + 1, endA, B, startB, endB, k - n / 2 - 1);
        } else {
            if (n / 2 + m / 2 + 1 >= k)
                return findMedianSortedArrays(A, startA, midA, B, startB, endB, k);
            else
                return findMedianSortedArrays(A, startA, endA, B, midB + 1, endB, k - m / 2 - 1);

        }
    }

    // ============== Another Solution ===========//

    public double findMedianSortedArrays2(int A[], int B[]) {
        int lengthA = A.length;
        int lengthB = B.length;
        if ((lengthA + lengthB) % 2 == 0) {
            double r1 = (double) findkthElement(A, B, (lengthA + lengthB) / 2);
            double r2 = (double) findkthElement(A, B, (lengthA + lengthB) / 2 + 1);
            return (r1 + r2) / 2;
        } else
            return findkthElement(A, B, (lengthA + lengthB) / 2 + 1);

    }

    public int findkthElement(int A[], int B[], int k) {
        if (A.length > B.length) {
            return findkthElement(B, A, k);
        }
        if (A.length == 0) {
            return B[k - 1];
        }
        if (k == 1) {
            return Math.min(A[0], B[0]);
        }

        int i = Math.min(k / 2, A.length);
        int j = Math.min(k / 2, B.length);

        if (A[i - 1] > B[j - 1]) {
            return findkthElement(Arrays.copyOfRange(A, 0, i), Arrays.copyOfRange(B, j, B.length), k - j);

        } else {
            return findkthElement(Arrays.copyOfRange(A, i, A.length), Arrays.copyOfRange(B, 0, j), k - i);
        }
    }

}
