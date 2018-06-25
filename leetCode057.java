package leetCode;

import java.util.ArrayList;
import java.util.List;

public class leetCode057 {
	// * public class Interval {
	// * int start;
	// * int end;
	// * Interval() { start = 0; end = 0; }
	// * Interval(int s, int e) { start = s; end = e; }
	// * }
	public static void main(String[] args) throws Exception {
		List<Interval> intervals = new ArrayList<Interval>();
//		intervals.add(new Interval(1, 2));
//		intervals.add(new Interval(3, 5));
//		intervals.add(new Interval(6, 7));
//		intervals.add(new Interval(8, 10));
//		intervals.add(new Interval(12, 16));
//
//		Interval newInterval = new Interval(4, 8);
		intervals.add(new Interval(0, 2));
		intervals.add(new Interval(3, 9));
		Interval newInterval = new Interval(6, 8);
		
		insert(intervals, newInterval);
	}

	public static List<Interval> insert(List<Interval> intervals, Interval newInterval) {
		List<Interval> tempList = new ArrayList<Interval>();
		int i = 0;
		while (i < intervals.size()) {
			if (newInterval.start <= intervals.get(i).end) {
				while (i<intervals.size()&&newInterval.end >= intervals.get(i).start) {
					tempList.add(intervals.get(i));
					intervals.remove(i);
				}
				break;
			}
			i++;
		}
		if (tempList.size() < 1) {
			intervals.add(i, newInterval);
		} else {
			intervals.add(i, combine(tempList, newInterval));
		}
		return intervals;
	}

	private static Interval combine(List<Interval> list, Interval it2) {
		int length=list.size();
		int s = it2.start<list.get(0).start?it2.start:list.get(0).start;
		int e = it2.end>list.get(length-1).end?it2.end:list.get(length-1).end;
		return new Interval(s, e);
	}

}
