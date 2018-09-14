package leetCode;

@SuppressWarnings("unused")
public class leetCode343 {
	public static void main(String[] args) throws Exception {
		int x = integerBreak(10);
		System.out.println();
	}

	//runtime 3ms
	public static int integerBreak(int n) {
		int[] dp = new int[58];
		dp[0] = 0;
		dp[1] = 1;
		for (int i = 2; i <= n; i++) {
			int max = 0;
			for (int j = 1; j <= i; j++) {
				max = Math.max(max, dp[i - j] * j);
				max = Math.max(max, (i - j) * j);
			}
			dp[i] = max;
		}
		return dp[n];
	}
}
