
package leetCode;

public class leetCode038 {

	public static void main(String[] args) throws Exception {

		System.out.println();
	}

	public static String countAndSay(int n) {
		String str = "1";
		if (n < 2)
			return str;
		while (n > 1) {
			char temp = str.charAt(0);
			int count = 0;
			String str1 = "";
			for (int i=0;i <= str.length();i++) {
				if (i == str.length()) {
					str1 += count + "" + temp;
					break;
				}
				if (temp != str.charAt(i)) {
					str1 += count + "" + temp;
					temp = str.charAt(i);
					count = 1;			
				} else {
					count++;			
				}
			}
			str = str1;
			n--;
		}
		return str;
	}
}
