package other.leetcode;

public class BinaryAdd {

    public String add(String st1, String st2, String result) {
        result = result + add(st1.substring(0, st1.length() - 1), st2.substring(0, st1.length() - 1), result);
        return result;
    }

    public static void main(String[] args) {
        BinaryAdd add = new BinaryAdd();
        System.out.println(add.add("10", "11", ""));
    }
}
