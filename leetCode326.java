
package leetCode;

public class leetCode326 {

	public static void main(String[] args) throws Exception {

		System.out.println();
	}

	public static boolean isPowerOfThree(int n) {
		while (n > 1) {
			int temp = n / 3;
			if (n == temp * 3) {
				n = temp;
			} else {
				return false;
			}
		}
		return n == 1;
	}

}
