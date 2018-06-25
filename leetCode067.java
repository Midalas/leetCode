package leetCode;

public class leetCode067 {

	public static void main(String[] args) throws Exception {
		addBinary("11", "1");
		System.out.println();
	}

	public static String addBinary(String a, String b) {
		char upper = '0';
		String result = "";
		int maxLength = 0;

		if (a.length() > b.length()) {
			maxLength = a.length();
			int lack = a.length() - b.length();
			for (int i = 0; i < lack; i++) {
				b = "0" + b;
			}
		} else {
			maxLength = b.length();
			int lack = b.length() - a.length();
			for (int i = 0; i < lack; i++) {
				a = "0" + a;
			}
		}
		char[] a1 = a.toCharArray();
		char[] b1 = b.toCharArray();
		for (int i = maxLength - 1; i >= 0; i--) {
			char temp = '0';
			int sum = a1[i] + b1[i] + upper-144;
			switch (sum) {
			case 0:
				temp = '0';upper = '0';break;
			case 1:
				temp = '1';upper = '0';break;
			case 2:
				temp = '0';upper = '1';break;
			case 3:
				temp = '1';upper = '1';break;
			default:
				break;
			}
			result = temp + result;
		}
		if (upper == '1') {
			result = "1" + result;
		}
		return result;
	}
}
