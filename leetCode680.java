
package leetCode;

public class leetCode680 {

	public static void main(String[] args) throws Exception {
		// 输入: "acba"
		// 输出: True
		String s = "byctdbneqlusxrysntyzhnkmkqomrekrdtumkegoqvxspwgsameemasgwpsxvqogemutdrkermoqkmknhzytnsyrxsulqenbdtcyb";
		boolean x = validPalindrome(s);
		System.out.println();
	}
	
	
	//33ms
	public static boolean validPalindrome(String s) {
		int len = s.length();
		int i = 0;
		int j = len - 1;
		while (i <= j) {
			if (s.charAt(i) != s.charAt(j))
				return checkIsPalindrome(s.substring(i, j)) || checkIsPalindrome(s.substring(i + 1, j + 1));
			i++;
			j--;
		}
		return true;
	}

	private static boolean checkIsPalindrome(String s) {
		int len = s.length();
		int i = 0;
		int j = len - 1;
		while (i <= j) {
			if (s.charAt(i) != s.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}
}
