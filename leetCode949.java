package leetCode;

import java.util.Arrays;

public class leetCode949 {
	public static void main(String[] args) throws Exception {
		int[] A = { 0, 4, 0, 0 };
		String x = largestTimeFromDigits(A);
		System.out.println();
	}

	//runtime 14ms
	public static String largestTimeFromDigits(int[] A) {
		String res = "";
		Arrays.sort(A);
		for (int a = 3; a >= 0; a--) {
			if (A[a] > 2)
				continue;
			for (int b = 3; b >= 0; b--) {
				if (A[a] == 2 && A[b] > 3 || b == a)
					continue;
				for (int c = 3; c >= 0; c--) {
					if (A[c] > 5 || c == a || c == b)
						continue;
					for (int d = 0; d < 4; d++) {
						if (d != a && d != b && d != c) {
							return "" + A[a] + A[b] + ":" + A[c] + A[d];
						}
					}
				}
			}
		}
		return res;
	}
}
