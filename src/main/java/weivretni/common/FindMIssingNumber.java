package weivretni.common;

/**
 * <pre>
 * 一个sorted integer Array[1...N], 已知范围 1...N+1. 已知一个数字missing。
 *    找该数字。 
 *    把原题改为unsorted，找missing数字。 performance。
 * </pre>
 * 
 * @author gzhang
 * 
 */
public class FindMIssingNumber {

    public int doItHelper(int[] numbers, int start, int end) {
        int pivot = start + (end - start) / 2;
        int pivotV = numbers[pivot];

        if (end == start + 1) {
            if (numbers[start] != start + 1) {
                return numbers[start];
            } else {
                return numbers[end];
            }

        }

        if (pivotV != (pivot + 1)) {
            // search left
            return doItHelper(numbers, start, pivot);
        } else {
            // search right
            return doItHelper(numbers, pivot, end);
        }
    }

    /**
     * sorted integer. Should be log(n)
     * 
     * @param numbers
     * @return
     */
    public int doIt(int[] numbers) {
        return doItHelper(numbers, 0, numbers.length - 1);
    }
}
