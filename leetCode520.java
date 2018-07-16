
package leetCode;

public class leetCode520 {

	public static void main(String[] args) throws Exception {
		String word = "aaaaa";
		boolean x=detectCapitalUse(word);
		System.out.println();
	}

	public static boolean detectCapitalUse(String word) {
		char[] ch = word.toCharArray();
		if (ch[0] > 90) {
			for (int i = 1; i < ch.length; i++)
				if (ch[i] <= 90)
					return false;
		} else {
			for (int i = 1; i < ch.length; i++) {
				if (ch[1] > 90) {
					for (int j = 2; j < ch.length; j++) {
						if (ch[i] <= 90)
							return false;
					}
				} else {
					for (int j = 2; j < ch.length; j++) {
						if (ch[i] > 90)
							return false;
					}
				}
			}
		}
		return true;
	}
}
