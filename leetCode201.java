
package leetCode;

public class leetCode201 {

	public static void main(String[] args) throws Exception {

		int x = rangeBitwiseAnd(2147483646, 2147483647);
		System.out.println("");
	}

	// 7ms
	public static int rangeBitwiseAnd(int m, int n) {
		int count = 0;
		while (m != n) {
			m >>= 1;
			n >>= 1;
			count++;
		}
		return m << count;
	}

	// 超时
	public static int rangeBitwiseAnd1(int m, int n) {
		if (m == n)
			return m;
		int res = m;
		for (int i = m + 1; i < n; i++) {
			if (res == 0)
				break;
			res &= i;
		}
		return res & n;
	}
}
