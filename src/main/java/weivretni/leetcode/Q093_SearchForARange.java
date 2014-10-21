package weivretni.leetcode;

public class Q093_SearchForARange {

    private int partition(int[] A, int target, int start, int end) {
        int pivot = start + (end - start) / 2;
        int pivotV = A[pivot];

        if (end - start <= 1) {
            if (A[start] == target) {
                return start;
            } else if (A[end] == target) {
                return end;
            } else {
                return -1;
            }
        }

        if (pivotV == target) {
            return pivot;
        } else {
            if (pivotV > target) {
                return partition(A, target, start, pivot);
            } else
                return partition(A, target, pivot, end);
        }

    }

    public int[] searchRange(int[] A, int target) {
        int pivot = partition(A, target, 0, A.length - 1);

        int[] result = new int[2];
        if (pivot != -1) {
            int start = pivot;

            while (start > 0) {
                if (A[start - 1] == target) {
                    start--;
                } else {
                    break;
                }
            }

            int end = pivot;
            while (end < A.length - 1) {
                if (A[end + 1] == target) {
                    end++;
                } else {
                    break;
                }
            }

            result[0] = start;
            result[1] = end;
        } else {
            result[0] = -1;
            result[1] = -1;
        }

        return result;

    }
}
