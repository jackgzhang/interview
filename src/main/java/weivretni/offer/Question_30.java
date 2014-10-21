package weivretni.offer;

/**
 * http://128kj.iteye.com/blog/1728555
 * 
 * @author gzhang
 * 
 */
public class Question_30 {

    private int[] heap;

    private void shiftUp(int index) {

        if (index * 2 + 1 < heap.length) {
            // This has left

            if (heap[index] < heap[index * 2 + 1]) {
                int tmp = heap[index];
                heap[index] = heap[index * 2 + 1];
                heap[index * 2 + 1] = tmp;

                // The left child is affected, need to re-shiftup
                shiftUp(index * 2 + 1);

            }
        }

        if (index * 2 + 2 < heap.length)
            // This only has right

            if (heap[index] < heap[index * 2 + 2]) {
                int tmp = heap[index];
                heap[index] = heap[index * 2 + 2];
                heap[index * 2 + 2] = tmp;

                // The right child is affected, need to re-shiftup
                shiftUp(index * 2 + 2);
            }
    }

    /**
     * Build a max-heap
     * 
     * @param i
     */
    private void insertMaxHeap(int i) {
        if (heap[0] <= i) {
            return;
        } else {
            heap[0] = i;
            shiftUp(0);
        }
    }

    /**
     * Build max-heap
     * 
     * @param numbers
     * @param k
     * @return
     */
    public int[] doIt(int[] numbers, int k) {
        heap = new int[k];
        for (int i = 0; i < k; i++) {
            heap[i] = Integer.MAX_VALUE;
        }

        for (int number : numbers) {
            insertMaxHeap(number);
        }

        return heap;
    }
}
