
package leetCode;

public class leetCode541 {

	public static void main(String[] args) throws Exception {
		// 输入: s = "abc dez vfe rtb fg", k = 3
		// 输出: "cba dez efv rtb gf"
		String s = "abcdezvfertbfg";
		int k = 3;

		String x = reverseStr(s, k);
		System.out.println();
	}

	// runtime 12ms
	public static String reverseStr(String s, int k) {
		char[] ch = s.toCharArray();
		int len = ch.length;
		int need = len / (2 * k);
		int i = 0;
		while (i < need) {
			reserve(ch, i * 2 * k, i * 2 * k + k - 1);
			i++;
		}
		if (len - i * 2 * k < k) {
			reserve(ch, i * 2 * k, len - 1);
		} else {
			reserve(ch, i * 2 * k, i * 2 * k + k - 1);
		}
		return new String(ch);
	}

	private static void reserve(char[] ch, int start, int end) {
		while (start < end) {
			char temp = ch[start];
			ch[start++] = ch[end];
			ch[end--] = temp;
		}
	}
}
