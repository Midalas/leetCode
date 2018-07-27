
package leetCode;

public class leetCode459 {

	public static void main(String[] args) throws Exception {
		String s = "abcdefghabcdefgh";
		boolean x = repeatedSubstringPattern(s);
		System.out.println();
	}

	//runtime 21ms
	public static boolean repeatedSubstringPattern(String s) {
		char[] ch = s.toCharArray();
		int len = ch.length;
		for (int i = 1, j = len; i < j; i++) {
			if (ch.length % i == 0 && (checkIsSubString(ch, i) || checkIsSubString(ch, ch.length / i))) {
				return true;
			} else {
				j = len / i;
				continue;
			}
		}
		return false;
	}

	private static boolean checkIsSubString(char[] ch, int len) {
		int compareTimes = ch.length / len;
		if (compareTimes <= 1)
			return false;
		for (int i = 1; i < compareTimes; i++)
			for (int j = 0; j < len; j++)
				if (ch[j] != ch[i * len + j])
					return false;
		return true;
	}

}
