package weivretni.leetcode;

import org.junit.Test;
import weivretni.Interval;

import java.util.ArrayList;
import java.util.List;

public class Q057_InsertInterval_Test {

    private Q057_InsertInterval source = new Q057_InsertInterval();

    @Test
    public void test() {

        List<Interval> internvals = new ArrayList<Interval>();
        internvals.add(new Interval(1, 2));
        internvals.add(new Interval(3, 5));
        internvals.add(new Interval(6, 7));
        internvals.add(new Interval(8, 10));
        internvals.add(new Interval(12, 16));

        System.out.println(source.insert(internvals, new Interval(4, 9)));
    }
}
