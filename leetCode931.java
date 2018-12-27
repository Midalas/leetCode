package leetCode;

public class leetCode931 {

	public static void main(String[] args) throws Exception {
		int[][] A = { { 1 } };

		int x = minFallingPathSum(A);
		System.out.println();
	}

	// runtime 10msX`
	public static int minFallingPathSum(int[][] A) {
		if (A.length == 1)
			return A[0][0];
		int res = Integer.MAX_VALUE;
		int height = A.length;
		int width = A[0].length;
		int[][] dp = new int[height][width];
		for (int i = 0; i < width; i++)
			dp[0][i] = A[0][i];
		for (int i = 1; i < height; i++) {
			dp[i][0] = A[i][0] + Math.min(dp[i - 1][0], dp[i - 1][1]);
			dp[i][width - 1] = A[i][width - 1] + Math.min(dp[i - 1][width - 2], dp[i - 1][width - 1]);
			for (int j = 1; j < width - 1; j++)
				dp[i][j] = A[i][j] + Math.min(Math.min(dp[i - 1][j - 1], dp[i - 1][j]), dp[i - 1][j + 1]);
		}
		for (int i = 0; i < width; i++)
			res = dp[height - 1][i] < res ? dp[height - 1][i] : res;
		return res;
	}
}
