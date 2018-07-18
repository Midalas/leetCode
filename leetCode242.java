
package leetCode;

public class leetCode242 {

	public static void main(String[] args) throws Exception {

		String s = "anaggam";
		String t = "nagaram";

		boolean x = isAnagram(s, t);
		System.out.println(x);
	}

	public static boolean isAnagram(String s, String t) {
		char[] ch_s = s.toCharArray();
		char[] ch_t = t.toCharArray();
		int[] count_s = new int[200];
		int[] count_t = new int[200];
		for (int i = 0; i < ch_s.length; i++)
			count_s[ch_s[i]] += 1;
		for (int i = 0; i < ch_t.length; i++)
			count_t[ch_t[i]] += 1;
		for (int i = 97; i <= 122; i++)
			if (count_s[i] != count_t[i])
				return false;
		return true;
	}
}
