package weivretni.careercup;

public class Question2_1 {

    /**
     * O(n^2)
     * 
     * 1) Go to n+1 postion. 2) Pick this element is toggle it with element at nth position. 3) Now
     * go to nth position and toggle it with element at n-1 position. 4) REPEAT step 2-3 n-1 times.
     * 5) Once done now go to n+2 and repeat steps 2-5 n-2th times. 6) Final array will be a1, b1,
     * a2, b2, a3, b3,...
     * 
     * @param in
     * @return
     */
    public char[] doIt(char[] in) {
        int n = in.length / 2;
        int k = 1;
        for (int i = n; i < in.length - 1; i++) {

            for (int j = 1; j <= n - k; j++) {
                int pos = i - j + 1;

                char temp = in[pos];
                in[pos] = in[pos - 1];
                in[pos - 1] = temp;
            }
            k++;
        }

        return in;
    }

    /**
     * 
     * <b>note</b> Following only works with even number on each side. like abcd1234, not working
     * for abc123
     * 
     * O(n) with O(1)
     * 
     * Rearrange(A,p,q) 1. if p is not equal to q do the following 2. r ← (p+q)/2 3. Exchange
     * A[(p+r)/2..r] ←→ A[(p+q)/2 +1 ..(r+q)/2]. 4. Rearrange(A,p,r) 5. Rearrange(A,r+1,q) 6. return
     * 
     * T(n) = 2T(n/2) + O(n) hence .
     * 
     * <p>
     * Call above procedure with p=1 and q=2n Example: Say we have : a1,a2,a3,a4,b1,b2,b3,b4
     * Carefully observe each step: Step1: a1,a2,b1,b2 a3,a4,b3.b4 Now if you notice, we have two
     * smaller problems to solve: (a1,a2,b1,b2) and (a3,a4,b3,b4)
     * 
     * @param in
     * @return
     */
    public char[] doIt2(char[] in) {
        return doIt2Helper(in, 0, in.length - 1);
    }

    private char[] doIt2Helper(char[] in, int start, int end) {

        if (start != end) {
            int r = (start + end) / 2;

            doIt2Helper2(in, (start + r) / 2 + 1, r, r + 1, (r + end) / 2);
            doIt2Helper(in, start, r);
            doIt2Helper(in, r + 1, end);
        }

        return in;
    }

    private void doIt2Helper2(char[] in, int s1, int e1, int s2, int e2) {
        int another = s2;
        for (int i = s1; i <= e1; i++) {
            char tmp = in[i];
            in[i] = in[another];
            in[another] = tmp;
            another++;
        }
    }
}
