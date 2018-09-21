package leetCode;

import java.util.Stack;

@SuppressWarnings("unused")
public class leetCode392 {
	public static void main(String[] args) throws Exception {
		String s = "axc";
		String t = "ahbgdc";
		boolean x = isSubsequence(s, t);
		System.out.println();
	}

	// runtime 11ms
	public static boolean isSubsequence(String s, String t) {
		int indexs = 0;
		int indext = 0;
		char[] chs = s.toCharArray();
		char[] cht = t.toCharArray();
		while (indexs < chs.length) {
			if (indext > cht.length - 1)
				return false;
			if (chs[indexs] == cht[indext])
				indexs++;
			indext++;
		}
		return true;
	}

}
