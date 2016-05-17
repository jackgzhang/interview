package weivretni.leetcode;

import org.junit.Test;
import weivretni.Interval;

import java.util.ArrayList;
import java.util.List;

public class Q056_MergeIntervals_Test {

    @Test
    public void test() {
        Q056_MergeIntervals source = new Q056_MergeIntervals();

        //
        List<Interval> intervals = new ArrayList<Interval>();
        intervals.add(new Interval(0, 0));
        intervals.add(new Interval(1, 4));

        System.out.println(source.merge(intervals));

        //
        intervals = new ArrayList<Interval>();
        intervals.add(new Interval(1, 4));
        intervals.add(new Interval(0, 0));

        System.out.println(source.merge(intervals));

        //
        intervals = new ArrayList<Interval>();
        intervals.add(new Interval(1, 4));
        intervals.add(new Interval(0, 1));

        System.out.println(source.merge(intervals));
    }
}
