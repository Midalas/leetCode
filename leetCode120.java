package leetCode;

import java.util.Arrays;
import java.util.List;

public class leetCode120 {

	public static void main(String[] args) throws Exception {
		// [2],
		// [3,4],
		// [6,5,7],
		// [4,1,8,3]
		List<List<Integer>> triangle = Arrays.asList(Arrays.asList(2), Arrays.asList(3, 4), Arrays.asList(6, 5, 7),
				Arrays.asList(4, 1, 8, 3));
		minimumTotal(triangle);
		System.out.println();
	}

	public static int minimumTotal(List<List<Integer>> triangle) {
		int i = 1;
		List<Integer> pre = triangle.get(0);
		while (i < triangle.size()) {
			List<Integer> temp = triangle.get(i);
			temp.set(0, temp.get(0) + pre.get(0));
			for (int j = 1; j < temp.size() - 1; j++) {
				temp.set(j, temp.get(j) + Math.min(pre.get(j - 1), pre.get(j)));
			}
			temp.set(temp.size() - 1, temp.get(temp.size() - 1) + pre.get(i - 1));
			pre = temp;
			i++;
		}
		return getMin(pre);
	}

	private static int getMin(List<Integer> list) {
		int min = Integer.MAX_VALUE;
		if (list.isEmpty())
			return 0;
		for (Integer a : list) {
			min = a < min ? a : min;
		}
		return min;
	}
}
