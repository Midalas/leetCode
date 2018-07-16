
package leetCode;

public class leetCode821 {

	public static void main(String[] args) throws Exception {
		String S = "loveleetcode";
		char C = 'e';
		int[] x = shortestToChar(S, C);
		System.out.println();
	}

	public static int[] shortestToChar(String S, char C) {
		char[] ch = S.toCharArray();
		int len = ch.length;
		int[] res = new int[len];
		int p = -10000;
		int q = 10000;
		for (int i = 0; i < len; i++) {
			if (ch[i] == C) {
				p = i;
				res[i] = 0;
			} else {
				res[i] = i - p;
			}
		}
		for (int j = len - 1; j >= 0; j--) {
			if (ch[j] == C) {
				q = j;
				res[j] = 0;
			} else if (res[j] > q - j) {
				res[j] = q - j;
			}
		}
		return res;
	}
}
