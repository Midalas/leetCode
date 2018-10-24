package leetCode;

import java.util.Arrays;

public class leetCode910 {
	public static void main(String[] args) throws Exception {
		int[] A = { 5, 6, 4 };
		int K = 5;
		int x = smallestRangeII(A, K);
		System.out.println();
	}

	// runtime 12ms
	public static int smallestRangeII(int[] A, int K) {
		if (A.length < 100) {
			Arrays.sort(A);
		} else {
			A = sort(A);
		}
		int min = A[0];
		int len = A.length;
		int max = A[len - 1];
		int ans = max - min;
		for (int i = 0; i < len - 1; i++) {
			max = Math.max(A[i] + 2 * K, max);
			min = Math.min(A[0] + 2 * K, A[i + 1]);
			ans = Math.min(ans, max - min);
		}
		return ans;
	}

	private static int[] sort(int[] A) {
		int count = 0;
		int[] arr = new int[10001];
		for (int i = 0; i < A.length; i++) {
			if (arr[A[i]] == 0) {
				arr[A[i]] = 1;
				count++;
			}
		}
		int[] res = new int[count];
		int index = 0;
		for (int i = 0; i < 10001; i++) {
			if (arr[i] > 0) {
				res[index++] = i;
			}
		}
		return res;
	}
	
}
