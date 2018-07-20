
package leetCode;

public class leetCode405 {

	public static void main(String[] args) throws Exception {
		int num = 26;
		String x = toHex(num);

		System.out.println();
	}

	private static char[] ch = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };

	// runtime 5ms
	public static String toHex(int num) {
		if (num == 0)
			return "0";
		String res = "";
		while (num != 0) {
			res = ch[num & 15] + res;
			num >>>= 4;
		}
		return res;
	}

	// runtime 19ms
	public static String toHex1(int num) {
		if (num == 0)
			return "0";
		String numstr = Integer.toBinaryString(num);
		char[] ch = new char[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				0, 0, 0 };
		String res = "";
		if (num < 0) {
			ch = numstr.toCharArray();
		} else {
			char[] temp = numstr.toCharArray();
			for (int i = 0; i < temp.length; i++)
				ch[ch.length - 1 - i] = temp[temp.length - 1 - i];
		}
		for (int i = 0; i < 8; i++) {
			int sum = 0;
			for (int j = 0; j < 4; j++)
				if (ch[4 * i + j] == '1')
					sum += Math.pow(2, 3 - j);
			if ("".equals(res) && sum == 0) {
				// do nothing
			} else if (sum < 10) {
				res += sum;
			} else {
				res += (char) (sum + 87);
			}
		}
		return res;
	}
}
