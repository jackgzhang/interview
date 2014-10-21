package weivretni.offer;

public class Question_38 {

    public int doIt(int[] numbers, int k) {
        int firstK = getFirstK(numbers, k, 0, numbers.length - 1);
        int lastK = getLast(numbers, k, 0, numbers.length - 1);

        if (lastK == firstK && firstK == -1) {
            return 0;
        }

        return lastK - firstK + 1;
    }

    private int getLast(int[] numbers, int k, int i, int j) {

        if (i < j)
            return -1;

        int pivot = i + (j - i) / 2;
        int pivotValue = numbers[pivot];

        if (pivotValue < k) {
            return getLast(numbers, k, pivot + 1, j);
        } else if (pivotValue > k) {
            return getLast(numbers, k, i, pivot - 1);
        } else {
            if (numbers[pivot + 1] != k) {
                return pivot;
            } else {
                return getLast(numbers, k, pivot + 1, j);
            }
        }
    }

    private int getFirstK(int[] numbers, int k, int i, int j) {

        if ((j - i == 1) && (numbers[i] < k || numbers[j] > k)) {
            return -1;
        }

        int pivot = i + (j - i) / 2;
        int pivotValue = numbers[pivot];

        if (pivotValue < k) {
            return getFirstK(numbers, k, pivot, j);
        } else if (pivotValue > k) {
            return getFirstK(numbers, k, i, pivot);
        } else {
            if (numbers[pivot - 1] != k) {
                return pivot;
            } else {
                return getFirstK(numbers, k, i, pivot);
            }
        }
    }
}
