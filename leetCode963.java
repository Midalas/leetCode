package leetCode;

import java.util.Arrays;
import java.util.Comparator;

public class leetCode963 {

	public static void main(String[] args) throws Exception {
		int[][] points = { { 3, 1 }, { 1, 1 }, { 0, 1 }, { 2, 1 }, { 3, 3 }, { 3, 2 }, { 0, 2 }, { 2, 3 } };
		double x = minAreaFreeRect(points);
		System.out.println();
	}

	//runtime 107ms
	public static double minAreaFreeRect(int[][] points) {
		double res = Double.MAX_VALUE;
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
				for (int m = j + 1; m < points.length - 1; m++) {
					double distance = Math.pow(points[j][0] - points[m][0], 2)
							+ Math.pow(points[j][1] - points[m][1], 2);
					for (int n = m + 1; n < points.length; n++) {
						double distance1 = Math.pow(points[i][0] - points[n][0], 2)
								+ Math.pow(points[i][1] - points[n][1], 2);
						if (Math.abs(distance1 - distance) <= 0.00005) {
							double distance3 = Math.pow(points[i][0] - points[j][0], 2)
									+ Math.pow(points[i][1] - points[j][1], 2);
							double distance4 = Math.pow(points[m][0] - points[n][0], 2)
									+ Math.pow(points[m][1] - points[n][1], 2);
							if (Math.abs(distance3 - distance4) <= 0.00005) {
								double distance5 = Math.pow(points[i][0] - points[m][0], 2)
										+ Math.pow(points[i][1] - points[m][1], 2);
								double distance6 = Math.pow(points[j][0] - points[n][0], 2)
										+ Math.pow(points[j][1] - points[n][1], 2);
								if (Math.abs(distance5 - distance6) <= 0.00005) {
									double len1 = Math.pow(Math.pow(points[i][0] - points[j][0], 2)
											+ Math.pow(points[i][1] - points[j][1], 2), 0.5);
									double len2 = Math.pow(Math.pow(points[j][0] - points[n][0], 2)
											+ Math.pow(points[j][1] - points[n][1], 2), 0.5);
									double area = len1 * len2;
									res = area < res ? area : res;
								}
							}

						}
					}
				}
			}
		}
		return res == Double.MAX_VALUE ? 0 : res;
	}
}
