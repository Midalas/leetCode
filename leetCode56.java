package leetCode;

import java.util.ArrayList;
import java.util.List;

public class leetCode56 {
	// * public class Interval {
	// * int start;
	// * int end;
	// * Interval() { start = 0; end = 0; }
	// * Interval(int s, int e) { start = s; end = e; }
	// * }
	public static void main(String[] args) throws Exception {
		List<Interval> intervals = new ArrayList<Interval>();
//		intervals.add(new Interval(1, 3));
//		intervals.add(new Interval(2, 6));
//		intervals.add(new Interval(6, 8));
//		intervals.add(new Interval(8, 10));
//		intervals.add(new Interval(11, 14));
//		intervals.add(new Interval(0, 18));
		//
		// intervals.add(new Interval(1, 4));
		// intervals.add(new Interval(4, 50));
		// intervals.add(new Interval(1, 2));
		// intervals.add(new Interval(3, 4));
		// intervals.add(new Interval(0, 5));
		
		 intervals.add(new Interval(2, 3));
		 intervals.add(new Interval(5, 5));
		 intervals.add(new Interval(2, 2));
		 intervals.add(new Interval(3, 4));
		 intervals.add(new Interval(3, 4));
		merge(intervals);

	}

	public static List<Interval> merge(List<Interval> intervals) {
		List<Interval> result = new ArrayList<Interval>();
		while (intervals.size() > 0) {
			Interval temp = intervals.get(0);
			int i = 0;
			List<Interval> tempList = new ArrayList<Interval>();
			while (i < result.size()) {
				if (result.get(i).end < temp.start || result.get(i).start > temp.end) {
					i++;
				} else {
					tempList.add(result.get(i));
					result.remove(i);
				}
			}
			if (tempList.size() < 1) {
				result.add(temp);
			} else {
				result.add(combine(tempList, temp));
			}
			intervals.remove(0);
		}
		return result;
	}
	private static Interval combine(List<Interval> list, Interval it2) {
		int s = it2.start;
		int e = it2.end;
		for (int i = 0; i < list.size(); i++) {
			s = list.get(i).start < s ? list.get(i).start : s;
			e = list.get(i).end > e ? list.get(i).end : e;
		}
		return new Interval(s, e);
	}
}
