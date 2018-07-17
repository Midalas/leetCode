
package leetCode;

public class leetCode172 {

	public static void main(String[] args) throws Exception {
		int n = 1808548329;
		int x = trailingZeroes(n);

		System.out.println(x);
	}


	public static int trailingZeroes(int n) {
		if (n / 5 < 5) {
			return n / 5;
		} else {
			return n / 5 + trailingZeroes(n / 5);
		}
	}

}
