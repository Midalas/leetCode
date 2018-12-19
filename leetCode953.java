package leetCode;

public class leetCode953 {
	public static void main(String[] args) throws Exception {
		String[] words = new String[] { "apple", "app" };
		String order = "abcdefghijklmnopqrstuvwxyz";
		boolean x = isAlienSorted(words, order);
		System.out.println();
	}

	public static boolean isAlienSorted(String[] words, String order) {
		char[] ch = order.toCharArray();
		int[] right = new int[128];
		for (int i = 0; i < ch.length; i++) {
			right[ch[i]] = i;
		}
		for (int i = 1; i < words.length; i++) {
			if (!compare(words[i - 1], words[i], right)) {
				return false;
			}
		}
		return true;
	}

	private static boolean compare(String str1, String str2, int[] right) {
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();
		int minLength = ch1.length < ch2.length ? ch1.length : ch2.length;
		for (int i = 0; i < minLength; i++) {
			if (ch1[i] == ch2[i]) {
				continue;
			} else if (right[ch1[i]] < right[ch2[i]]) {
				return true;
			} else {
				return false;
			}
		}
		return ch1.length <= ch2.length;
	}

}
