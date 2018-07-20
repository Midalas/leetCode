
package leetCode;

public class test2 {

	public static void main(String[] args) throws Exception {

		System.out.println();
	}

	public static String addStrings(String num1, String num2) {
		int maxLength=num1.length()>num2.length()?num1.length():num2.length();
		char[] ch1 = num1.toCharArray();
		char[] ch2 = num2.toCharArray();

		int plus = 0;
		int p1 = ch1.length - 1;
		int p2 = ch2.length - 1;
		for (int i = 0; i <= p2; i++) {
			int temp = ch1[p1 - i] + ch2[p2 - i] + plus;
			if (temp > 105) {
				ch1[p1 - i] = (char) (temp - 58);
				plus = 1;
			} else {
				ch1[p1 - i] = (char) (temp - 48);
				plus = 0;
			}
		}
		return "";

	}

}
