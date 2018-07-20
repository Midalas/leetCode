
package leetCode;

public class leetCode400 {

	public static void main(String[] args) throws Exception {
		int n = 2147483647;
		int x = findNthDigit(n);
		System.out.println();
	}

	public static int findNthDigit(int n) {
		int count = 0;
		int p = 0;
		int temp = 9;
		while ((long) n > (long) temp * (p + 1)) {
			n = n - temp * (p++ + 1);
			count += temp;
			temp = (int) Math.pow(10, p) * 9;
		}
		return getDight(count + n / (p + 1), n % (p + 1));
	}

	private static int getDight(int num, int c) {
		String s = "";
		if (c == 0) {
			s += num;
			return s.charAt(s.length() - 1) - 48;
		} else {
			s += (num + 1);
			return s.charAt(c - 1) - 48;
		}
	}

}
