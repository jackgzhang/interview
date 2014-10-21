package weivretni.microsoft;

/**
 * <pre>
 * 题目：求1+2+…+n，要求不能使用乘除法、for、while、if、else、switch、case
 * 等关键字以及条件判断语句（A?B:C）。
 * </pre>
 * 
 * @author gzhang
 * 
 */
public class MS12 {

    public int solve(int n) {
        int i = 1;

        boolean result = (n > 1) && (i = solve(n - 1) + n) > 0;
        return i;
    }
}
