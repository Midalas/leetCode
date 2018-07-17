
package leetCode;

public class leetCode168 {

	public static void main(String[] args) throws Exception {

		int n = 52;
		String x = convertToTitle(n);
		System.out.println();
	}

	public static String convertToTitle(int n) {
		String str = "";
		while (n > 26) {
			if (n % 26 == 0) {
				str = "Z" + str;
				n = n / 26 - 1;
			} else {
				str = (char) (64 + n % 26) + str;
				n = n / 26;
			}
		}
		str = (char) (64 + n) + str;
		return str;
	}
}
