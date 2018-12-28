package leetCode;

public class leetCode935 {

	public static void main(String[] args) throws Exception {
		int N = 161;
		int x = knightDialer(N);
		System.out.println();
	}

	//runtime 52ms
	public static int knightDialer(int N) {
		long res = 0;
		int mod = 1000000007;
		long[] dp = new long[] { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
		while (N > 1) {
			long[] temp = new long[10];
			temp[0] = (dp[4] + dp[6]) % mod;
			temp[1] = (dp[6] + dp[8]) % mod;
			temp[2] = (dp[7] + dp[9]) % mod;
			temp[3] = (dp[4] + dp[8]) % mod;
			temp[4] = (dp[0] + dp[3] + dp[9]) % mod;
			temp[5] = 0;
			temp[6] = (dp[0] + dp[1] + dp[7]) % mod;
			temp[7] = (dp[2] + dp[6]) % mod;
			temp[8] = (dp[1] + dp[3]) % mod;
			temp[9] = (dp[2] + dp[4]) % mod;
			dp = temp;
			N--;
		}
		for (int i = 0; i < dp.length; i++) {
			res += dp[i];
		}
		return (int) (res % mod);
	}

}
