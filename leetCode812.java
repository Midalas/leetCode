
package leetCode;

public class leetCode812 {

	public static void main(String[] args) throws Exception {
		int[][] points = { { 0, 0 }, { 0, 1 }, { 1, 0 }, { 0, 2 }, { 2, 0 } };
		double x = largestTriangleArea(points);
		System.out.println();
	}

	//runtime 14ms
	public static double largestTriangleArea(int[][] points) {
		double maxArea = 0.0;
		for (int i = 0; i < points.length; i++)
			for (int j = i + 1; j < points.length; j++)
				for (int k = j + 1; k < points.length; k++) {
					double s = Math.abs(points[i][0] * points[j][1] + points[j][0] * points[k][1]
							+ points[k][0] * points[i][1] - points[i][0] * points[k][1] - points[j][0] * points[i][1]
							- points[k][0] * points[j][1]);
					maxArea = s > maxArea ? s : maxArea;
				}

		return maxArea / 2.0;
	}
}
