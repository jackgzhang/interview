package weivretni.common;

/**
 * <pre>
 * 1. heapify the array;  (Heapified array does not mean it is sorted)
 * 2. while the array isn’t empty {
 *     remove and replace the root;
 *     reheap the new root node;
 * 
 * </pre>
 */
class HeapSort {

    /**
     * 
     * 
     * 
     * 
     * @param array
     * @param index
     */
    private void shiftUp(int[] array, int index) {
        if (index * 2 + 1 < array.length) {
            // This only has left

            if (array[index] > array[index * 2 + 1]) {
                int tmp = array[index];
                array[index] = array[index * 2 + 1];
                array[index * 2 + 1] = tmp;

                // The left child is affected, need to re-shiftup
                shiftUp(array, index * 2 + 1);

            }
        }

        if (index * 2 + 2 < array.length)
            // This only has right

            if (array[index] > array[index * 2 + 2]) {
                int tmp = array[index];
                array[index] = array[index * 2 + 2];
                array[index * 2 + 2] = tmp;

                // The right child is affected, need to re-shiftup
                shiftUp(array, index * 2 + 2);
            }
    }

    private void heapify(int[] array) {
        for (int i = array.length / 2 - 1; i >= 0; i--) {
            shiftUp(array, i);
        }
    }

    public int[] doIt(int[] array) {

        heapify(array);

        int[] result = new int[array.length];
        int index = 0;
        while (array.length > 0) {
            result[index++] = array[0];

            int[] newArray = new int[array.length - 1];
            System.arraycopy(array, 1, newArray, 0, array.length - 1);
            array = newArray;
            heapify(array);

        }

        return result;
    }
}
