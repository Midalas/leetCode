package leetCode;

import java.util.Arrays;
import java.util.Comparator;

public class leetCode646 {
	public static void main(String[] args) throws Exception {
		int[][] pairs = { { 1, 2 }, { 2, 3 }, { 3, 4 } };
		int x = findLongestChain(pairs);
		System.out.println();
	}

	//runtime 41ms
	public static int findLongestChain(int[][] pairs) {
		Arrays.sort(pairs, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if (o1[1] == o2[1]) {
					return o1[0] - o2[0];
				} else {
					return o1[1] - o2[1];
				}
			}
		});
		int[] dp = new int[pairs.length];
		dp[0] = 1;
		int[] last = pairs[0];
		for (int i = 1; i < pairs.length; i++) {
			if (pairs[i][0] > last[1]) {
				dp[i] = dp[i - 1] + 1;
				last = pairs[i];
			} else {
				dp[i] = dp[i - 1];
			}
		}
		return dp[dp.length - 1];
	}
}
