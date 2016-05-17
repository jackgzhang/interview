package weivretni.leetcode;

import weivretni.Interval;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Given a collection of intervals, merge all overlapping intervals.
 * 
 * For example, Given [1,3],[2,6],[8,10],[15,18],
 * 
 * return [1,6],[8,10],[15,18].
 * 
 * @author gzhang
 * 
 */
public class Q056_MergeIntervals {

    public List<Interval> merge(List<Interval> intervals) {

        Collections.sort(intervals, new Comparator<Interval>() {

            public int compare(Interval o1, Interval o2) {
                // TODO Auto-generated method stub
                return o1.start - o2.start;
            }
        });

        // Now merge one by one
        List<Interval> result = new ArrayList<Interval>();
        result.add(intervals.get(0));
        for (int i = 1; i < intervals.size(); i++) {
            mergeInto(result, intervals.get(i));
        }

        return result;
    }

    private void mergeInto(List<Interval> result, Interval newInterval) {
        Interval lastInterval = result.get(result.size() - 1);
        result.remove(result.size() - 1);

        if (newInterval.start > lastInterval.end) {
            // Add both
            result.add(lastInterval);
            result.add(newInterval);
        } else {
            // Add one merged
            result.add(new Interval(lastInterval.start, Math.max(lastInterval.end, newInterval.end)));
        }
    }

}
