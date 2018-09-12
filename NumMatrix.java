
package leetCode;

public class NumMatrix {

	public int[][] dp;

	public NumMatrix(int[][] matrix) {
		if (matrix == null)
			return;
		int height = matrix.length;
		if (height < 1)
			return;
		int width = matrix[0].length;
		if (width < 1)
			return;
		dp = new int[height][width];
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				int sum = 0;
				if (i > 0 && j > 0)
					sum -= dp[i - 1][j - 1];
				if (i > 0)
					sum += dp[i - 1][j];
				if (j > 0)
					sum += dp[i][j - 1];
				sum += matrix[i][j];
				dp[i][j] = sum;
			}
		}
	}

	public int sumRegion(int row1, int col1, int row2, int col2) {
		if (dp == null)
			return 0;
		int res = dp[row2][col2];
		if (col1 > 0 & row1 > 0)
			res += dp[row1 - 1][col1 - 1];
		if (col1 > 0)
			res -= dp[row2][col1 - 1];
		if (row1 > 0)
			res -= dp[row1 - 1][col2];
		return res;
	}

}
