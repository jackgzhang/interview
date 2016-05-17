package weivretni.leetcode;

import weivretni.Interval;

import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 * Given a set of non-overlapping intervals, insert a new interval into the intervals (merge if necessary).
 * 
 * You may assume that the intervals were initially sorted according to their start times.
 * 
 * Example 1:
 * Given intervals [1,3],[6,9], insert and merge [2,5] in as [1,5],[6,9].
 * 
 * Example 2:
 * Given [1,2],[3,5],[6,7],[8,10],[12,16], insert and merge [4,9] in as [1,2],[3,10],[12,16].
 * 
 * This is because the new interval [4,9] overlaps with [3,5],[6,7],[8,10].
 * </pre>
 * 
 * 
 * http://www.programcreek.com/2012/12/leetcode-insert-interval/
 * 
 * @author gzhang
 * 
 */
public class Q057_InsertInterval {

    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        ArrayList<Interval> result = new ArrayList<Interval>();

        for (Interval old : intervals) {
            if (old.end < newInterval.start) {
                result.add(old);
            } else if (old.start > newInterval.end) {
                result.add(newInterval);
                newInterval = old;
            } else if (old.end >= newInterval.start || old.start <= newInterval.end) {
                newInterval = new Interval(Math.min(old.start, newInterval.start), Math.max(newInterval.end,
                    old.end));
            }
        }

        result.add(newInterval);

        return result;
    }
}
