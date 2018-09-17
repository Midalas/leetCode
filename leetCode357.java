package leetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SuppressWarnings("unused")
public class leetCode357 {
	public static void main(String[] args) throws Exception {
		int x = countNumbersWithUniqueDigits(2);
		System.out.println();
	}

	private static int[] dp = new int[11];
	static {
		dp[0] = 1;
		dp[1] = 9;
		dp[2] = 81;
		for (int i = 3; i <= 10; i++)
			dp[i] = dp[i - 1] * (11 - i);
	}

	//runtime 0ms
	public static int countNumbersWithUniqueDigits(int n) {
		int res = 0;
		for (int i = 0; i <= n; i++)
			res += dp[i];
		return res;
	}

}
