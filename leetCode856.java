package leetCode;

public class leetCode856 {
	public static void main(String[] args) throws Exception {
		String S = "(())()";
		int x = scoreOfParentheses(S);
		System.out.println();
	}

	//runtime 7ms
	public static int scoreOfParentheses(String S) {
		char[] ch = S.toCharArray();
		return dp(ch, 0, ch.length - 1);
	}

	private static int dp(char[] ch, int start, int end) {
		if (start + 1 >= end)
			return 1;
		int count = 1;
		for (int i = start + 1; i < end; i++) {
			if (count == 0) {
				return dp(ch, start, i - 1) + dp(ch, i, end);
			}
			if (ch[i] == '(') {
				count++;
			} else {
				count--;
			}
		}
		return 2 * dp(ch, start + 1, end - 1);
	}
}
