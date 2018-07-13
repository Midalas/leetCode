
package leetCode;

public class leetCode557 {

	public static void main(String[] args) throws Exception {
		String x = reverseWords("Let's take LeetCode contest");
		System.out.println();
	}

	public static String reverseWords(String s) {
		char[] ch = s.toCharArray();
		int pre = 0;
		for (int i = 0; i < ch.length; i++) {
			if (i == ch.length - 1 || ch[i + 1] == ' ') {
				for (int j = pre; j < (pre + i + 1) / 2; j++) {
					char temp = ch[j];
					ch[j] = ch[i - j + pre];
					ch[i - j + pre] = temp;
				}
				pre = i + 2;
			}
		}
		return new String(ch);
	}
}
