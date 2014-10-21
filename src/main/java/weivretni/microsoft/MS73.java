package weivretni.microsoft;

/**
 * <pre>
 * 对策字符串的最大长度。
 * </pre>
 * 
 * @author gzhang
 * 
 */
public class MS73 {

    class Result {

        String s;
        int    length;

        public Result(String s, int length) {
            super();
            this.s = s;
            this.length = length;
        }

    }

    private Result helper(String s) {
        if (s.length() <= 1) {
            return new Result(s, s.length());
        } else {
            if (s.charAt(0) == s.charAt(s.length() - 1)) {
                Result r = helper(s.substring(1, s.length() - 1));
                if (r.length == s.length() - 2) {
                    return new Result(s, s.length());
                } else {
                    return r;
                }
            } else {
                Result r1 = helper(s.substring(1, s.length()));
                Result r2 = helper(s.substring(0, s.length() - 1));
                if (r1.length > r2.length) {
                    return r1;
                } else {
                    return r2;
                }
            }
        }
    }

    public int find(String s) {
        Result r = helper(s);
        System.out.println(r.s);
        return r.length;
    }
}
