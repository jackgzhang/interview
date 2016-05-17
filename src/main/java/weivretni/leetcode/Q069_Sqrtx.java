package weivretni.leetcode;

/**
 * <pre>
 * Implement int sqrt(int x).
 * 
 * Compute and return the square root of x.
 * </pre>
 * 
 * <pre>
 * http://www.tuicool.com/articles/a2MnAj
 * 
 * 1 2 3 4 5 6 7 8 9 10
 * 1 1 1 2 2 2 2 2 3 3
 * 
 * 这样我们可以发现，数字1所能涵盖x数有3个，数字2能涵盖的x数有5个，数字3能涵盖的x数有7个.........
 * 
 * 这样子我们要求一个数x的平方根的int值，只需要用x循环减去3,5,7,9......，
 * 并用num记录下当前是数字几了，
 * 直到x的值小于等于0，这时候这个num就是我们要得到的结果了。
 * </pre>
 *
 */
public class Q069_Sqrtx {

    public int sqrt(int x) {
        if (x <= 0) {
            return 0;
        } else {
            int num = 0;
            int step = 3;
            while (x > 0) {
                x = x - step;
                step += 2;
                num ++;
            }

            return num;
        }
    }
}
