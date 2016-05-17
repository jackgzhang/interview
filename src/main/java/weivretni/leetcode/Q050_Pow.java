package weivretni.leetcode;

/**
 * <pre>
 * Implement pow(x, n).（计算x的n次方）
 * 
 * 
 * n有可能是正数或者负数，分开计算。
 * 
 * 用递归的做法讲复杂度降到O（logn）。
 * </pre>
 * 
 * @author gzhang
 *
 */
public class Q050_Pow {

    public double pow(double x, int n) {
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return x;
        } else {
            double result = pow(x, Math.abs(n / 2));

            if (n % 2 == 0) {
                result = result * result;
            } else {
                result = result * result * x;
            }

            if (n < 0) {
                result = 1.0 / result;
            }

            return result;
        }
    }
}
