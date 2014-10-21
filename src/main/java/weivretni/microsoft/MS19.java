package weivretni.microsoft;

/**
 * <pre>
 * 定义Fibonacci 数列如下：
 * f(n)  = 0 (n=0)
 * f(n)  = 1 (n=1, 2)
 * f(n)  =  f(n-1)+f(n-2)  (n>2)
 * 输入n，用最快的方法求该数列的第n 项。
 * </pre>
 * 
 * @author gzhang
 * 
 */
public class MS19 {

    /**
     * Recursive. Not good
     * 
     * @param n
     * @return
     */
    public int method1(int n) {
        if (n <= 0) {
            return 0;
        } else if (n <= 2) {
            return 1;
        } else {
            return (method1(n - 1) + method1(n - 2));
        }
    }

    /**
     * For loop. O(n)
     * 
     * @param n
     * @return
     */
    public int method2(int n) {
        if (n <= 0) {
            return 0;
        } else if (n <= 2) {
            return 1;
        } else {
            int first = 1;
            int second = 1;
            int sum = 0;
            for (int i = 3; i <= n; i++) {
                sum = first + second;
                first = second;
                second = sum;
            }

            return sum;
        }
    }

    /**
     * http://m.oschina.net/blog/93720
     * 
     * log(n)
     * 
     * @param n
     * @return
     */
    public void method3(int n) {
        
    }
}
