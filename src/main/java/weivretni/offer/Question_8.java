package weivretni.offer;

public class Question_8 {

    private int doIt(int[] array, int left, int right) {
        int pivot = left + (right - left) / 2;

        if (left + 1 == right || left == right) {
            return array[right];
        }

        if (array[pivot] > array[left]) {
            return doIt(array, pivot, right);
        } else if (array[pivot] == array[left]) {
            return Math.min(doIt(array, pivot, right), doIt(array, left, pivot));
        } else {
            return doIt(array, left, pivot);
        }
    }

    public int doIt(int[] array) {
        return doIt(array, 0, array.length - 1);
    }
}
