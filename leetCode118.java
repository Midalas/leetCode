package leetCode;

import java.util.ArrayList;
import java.util.List;

public class leetCode118 {

	public static void main(String[] args) throws Exception {

		// [1],
		// [1,1],
		// [1,2,1],
		// [1,3,3,1],
		// [1,4,6,4,1]
		generate(6);
		System.out.println();
	}

	public static List<List<Integer>> generate(int numRows) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		List<Integer> pre = new ArrayList<Integer>();
		int i = 0;
		while (i < numRows) {
			List<Integer> next = new ArrayList<Integer>();
			if (i > 0)
				next.add(1);
			for (int j = 1; j < i; j++) {
				next.add(pre.get(j - 1) + pre.get(j));
			}
			next.add(1);
			result.add(next);
			i++;
			pre = next;
		}
		return result;
	}
}
