package weivretni.microsoft;

/**
 * <pre>
 * 28.整数的二进制表示中1的个数
 * 题目：输入一个整数，求该整数的二进制表达中有多少个1。
 * 例如输入10，由于其二进制表示为1010，有两个1，因此输出2。
 * 
 * </pre>
 * 
 * http://zhedahht.blog.163.com/blog/static/2541117420073118945734/
 * 
 * @author gzhang
 * 
 */
public class MS28 {

    public int find(int x) {
        int result = 0;
        int flag = 1;
        while (flag != 0) {
            if ((x & flag) > 0) {
                result++;
            }
            flag = flag << 1;
        }

        return result;
    }
}
