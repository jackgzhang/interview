package weivretni;

public class Interval implements Comparable<Interval> {

    public int start;
    public int end;

    public Interval() {
        start = 0;
        end = 0;
    }

    public Interval(int s, int e) {
        start = s;
        end = e;
    }

    @Override
    public String toString() {
        return " [" + start + " " + end + "] ";
    }

    public int compareTo(Interval o) {

        Interval interval = (Interval) o;
        if (this.start == interval.start) {
            return this.start - interval.start;
        } else {
            return this.end = interval.end;
        }
    }

}