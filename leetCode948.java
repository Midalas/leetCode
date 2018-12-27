package leetCode;

import java.util.Arrays;

public class leetCode948 {

	public static void main(String[] args) throws Exception {
		int[] tokens = { 55, 71, 82 };
		int P = 54;

		int x = bagOfTokensScore(tokens, P);
		System.out.println();
	}

	// runtime 15ms
	public static int bagOfTokensScore(int[] tokens, int P) {
		if (tokens.length == 1) {
			return P > tokens[0] ? 1 : 0;
		}
		int point = 0;
		int res = 0;
		Arrays.sort(tokens);
		int start = 0;
		int end = tokens.length - 1;
		while (start < end) {
			while (tokens[start] <= P) {
				P -= tokens[start++];
				point++;
			}
			res = point > res ? point : res;
			if (point > 0) {
				P += tokens[end--];
				point--;
			} else {
				break;
			}

		}
		return res;
	}

}
