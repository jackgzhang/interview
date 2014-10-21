package weivretni.other;

/**
 * <pre>
 * 两个已排序的整型数组，求交集，最快算法.
 *  http://blog.csdn.net/wangyangkobe/article/details/6382042
 * </pre>
 * 
 * @author gzhang
 * 
 */
public class CommonSubArray {

    public void find(int[] A, int[] B) {

        int len_A = A.length;
        int len_B = B.length;

        int i = 0;
        int j = 0;
        while (i < len_A && j < len_B) {
            if (A[i] == B[j]) {
                System.out.println(A[i]);
                i++;
                j++;
            } else if (A[i] < B[j])
                i++;
            else
                j++;
        }
    }

    public static void main(String[] args) {
        CommonSubArray source = new CommonSubArray();

        source.find(new int[] { 1, 2, 4 }, new int[] { 2, 3, 4 });
    }
}
