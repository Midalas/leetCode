
package leetCode;

public class leetCode409 {

	public static void main(String[] args) throws Exception {
		String s = "bananas";
		int x = longestPalindrome(s);
		System.out.println();
	}

	// runtime 6ms
	public static int longestPalindrome(String s) {
		int res = 0;
		int[] count = new int[200];
		char[] ch = s.toCharArray();
		int len = ch.length;
		for (int i = 0; i < len; i++)
			count[ch[i]] += 1;
		for (int i = 65; i <= 90; i++)
			if (count[i] > 1)
				res += count[i] % 2 == 0 ? count[i] : count[i] - 1;
		for (int i = 97; i <= 122; i++)
			if (count[i] > 1)
				res += count[i] % 2 == 0 ? count[i] : count[i] - 1;
		return res + 1 > len ? len : res + 1;
	}
}
