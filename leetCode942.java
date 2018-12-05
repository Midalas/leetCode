package leetCode;

import java.util.Arrays;

public class leetCode942 {
	public static void main(String[] args) throws Exception {
		String S = "DDDDDIDDDD";

		int[] x = diStringMatch(S);
		System.out.println(1);
	}

	// runtime 12ms
	public static int[] diStringMatch(String S) {
		int lastestIndexD = 0;
		char[] ch = S.toCharArray();
		int[] res = new int[ch.length + 1];
		for (int i = 0; i < res.length; i++) {
			res[i] = i;
		}
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == 'D') {
				for (int j = i; j >= lastestIndexD; j--) {
					swap(res, j, j + 1);
				}
			} else {
				lastestIndexD = i + 1;
			}
		}

		return res;
	}

	private static void swap(int[] res, int i, int j) {
		int temp = res[i];
		res[i] = res[j];
		res[j] = temp;
	}
}
