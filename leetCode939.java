package leetCode;

import java.util.Arrays;
import java.util.Comparator;

public class leetCode939 {

	public static void main(String[] args) throws Exception {
		int[][] points = { { 1, 1 }, { 1, 3 }, { 3, 1 }, { 3, 3 }, { 4, 1 }, { 4, 3 } };
		double x = minAreaRect(points);
		System.out.println();
	}

	// runtime 607ms
	public static int minAreaRect(int[][] points) {
		int res = Integer.MAX_VALUE;
		Arrays.sort(points, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				// TODO Auto-generated method stub
				if (o1[0] == o2[0]) {
					return o2[1] - o1[1];
				} else {
					return o1[0] - o2[0];
				}
			}
		});

		for (int i = 0; i < points.length - 3; i++) {
			for (int j = i + 1; j < points.length - 2; j++) {
				if (points[i][0] != points[j][0])
					continue;
				for (int m = j + 1; m < points.length - 1; m++) {
					if (points[i][1] != points[m][1])
						continue;
					for (int n = m + 1; n < points.length; n++) {
						if (points[m][0] != points[n][0] || points[j][1] != points[n][1])
							continue;
						int area = (points[m][0] - points[i][0]) * (points[i][1] - points[j][1]);
						res = area < res ? area : res;
					}
				}
			}
		}
		return res == Integer.MAX_VALUE ? 0 : res;
	}

}
