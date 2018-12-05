package leetCode;

import java.util.Arrays;

public class leetCode944 {
	public static void main(String[] args) throws Exception {
		String[] A = { "zyx", "wvu", "tsr" };
		int x = minDeletionSize(A);
		System.out.println(1);
	}

	public static int minDeletionSize(String[] A) {
		int res = 0;
		int len = A[0].length();
		int[] dp = new int[len];
		Arrays.fill(dp, 1);
		for (int i = 1; i < A.length; i++) {
			for (int j = 0; j < len; j++) {
				if (dp[j] == 1 && A[i].charAt(j) < A[i - 1].charAt(j)) {
					dp[j] = 0;
				}
			}
		}
		for (int i = 0; i < dp.length; i++) {
			if (dp[i] == 0) {
				res++;
			}
		}
		return res;
	}

}
