package weivretni.microsoft;

/**
 * <pre>
 * 32.
 * 有两个序列a,b，大小都为n,序列元素的值任意整数，无序；
 * 要求：通过交换a,b中的元素，使[序列a元素的和]与[序列b元素的和]之间的差最小。
 * 例如:   
 * var a=[100,99,98,1,2, 3];
 * var b=[1, 2, 3, 4,5,40];
 * </pre>
 * 
 * http://blog.csdn.net/yuucyf/article/details/6700941
 * 
 * @author gzhang
 * 
 * 
 * 
 */
public class MS32 {

    private int sum(int a[]) {
        int sum = 0;
        for (int i : a) {
            sum += i;
        }

        return sum;
    }

    public void findIt(int a[], int b[]) {
        int sumA = sum(a);
        int sumB = sum(b);

        if (sumA == sumB)
            return;

        if (sumA < sumB) {
            int[] temp = a;
            a = b;
            b = temp;
        }
        int curDiff = 1;
        int oldDiff = Integer.MAX_VALUE;
        int pA = -1;
        int pB = -1;
        boolean shift = true;
        int len = a.length;// the length of a and b should be the same
        while (shift && curDiff > 0) {
            shift = false;
            curDiff = sum(a) - sum(b);
            for (int i = 0; i < len; i++) {
                for (int j = 0; j < len; j++) {
                    int temp = a[i] - b[j];
                    int newDiff = Math.abs(curDiff - 2 * temp);
                    if (newDiff < curDiff && newDiff < oldDiff) {
                        shift = true;
                        oldDiff = newDiff;
                        pA = i;
                        pB = j;
                    }
                }
            }
            if (shift) {
                int temp = a[pA];
                a[pA] = b[pB];
                b[pB] = temp;
            }
        }
        System.out.println("the min diff is " + oldDiff);

    }
}
