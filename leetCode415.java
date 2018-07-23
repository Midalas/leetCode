
package leetCode;

public class leetCode415 {

	public static void main(String[] args) throws Exception {

		String num1 = "123456788889";
		String num2 = "11111";
		String x = addStrings(num1, num2);
		System.out.println();
	}

	// runtime 19ms
	public static String addStrings(String num1, String num2) {
		char[] ch1 = {};
		char[] ch2 = {};
		if (num1.length() < num2.length()) {
			ch2 = num1.toCharArray();
			ch1 = num2.toCharArray();
		} else {
			ch1 = num1.toCharArray();
			ch2 = num2.toCharArray();
		}
		int plus = 0;
		int p1 = ch1.length - 1;
		int p2 = ch2.length - 1;
		for (int i = 0; i <= p2; i++) {
			int temp = ch1[p1 - i] + ch2[p2 - i] + plus;
			if (temp > 105) {
				ch1[p1 - i] = (char) (temp - ':');
				plus = 1;
			} else {
				ch1[p1 - i] = (char) (temp - '0');
				plus = 0;
			}
		}
		for (int i = 0; i < p1 - p2; i++) {
			int temp = ch1[p1 - p2 - 1 - i] + plus;
			if (temp > 57) {
				ch1[p1 - p2 - 1 - i] = (char) (temp - 10);
				plus = 1;
			} else {
				ch1[p1 - p2 - 1 - i] = (char) (temp);
				plus = 0;
				break;
			}
		}
		String res = new String(ch1);
		return plus == 0 ? res : ("1" + res);
	}

}
