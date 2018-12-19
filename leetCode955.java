package leetCode;

import java.util.Arrays;

public class leetCode955 {
	public static void main(String[] args) throws Exception {
		String[] A = { "xgc", "xfb", "yfa" };
		int x = minDeletionSize(A);
		System.out.println();
	}

	//runtime 14ms
	public static int minDeletionSize(String[] A) {
		boolean[] flag = new boolean[A.length];
		Arrays.fill(flag, true);
		int res = 0;
		int len = A[0].length();
		char[][] arr = new char[A.length][len];
		for (int i = 0; i < A.length; i++)
			arr[i] = A[i].toCharArray();
		for (int i = 0; i < len; i++) {
			boolean[] flag1 = new boolean[A.length];
			boolean f = true;
			for (int j = 1; j < A.length; j++) {
				if (flag[j]) {
					if (arr[j - 1][i] == arr[j][i]) {
						flag1[j] = true;
					} else if (arr[j - 1][i] > arr[j][i]) {
						res++;
						f = false;
						break;
					}
				}
				if (j == A.length - 1 && checkIsAllFlase(flag)) {
					return res;
				}
			}
			if (f) {
				for (int j = 1; j < flag.length; j++) {
					flag[j] &= flag1[j];
				}
			}
		}
		return res;
	}

	private static boolean checkIsAllFlase(boolean[] flag) {
		for (int k = 1; k < flag.length; k++)
			if (flag[k])
				return false;
		return true;
	}
}
