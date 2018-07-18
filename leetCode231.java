
package leetCode;

public class leetCode231 {

	public static void main(String[] args) throws Exception {
		int n = -2147483646;
		boolean x = isPowerOfTwo(n);
		System.out.println();
	}

	public static boolean isPowerOfTwo(int n) {
		int count = 0;
		int i = 0;
		if (n < 0)
			return false;
		while (i < 32) {
			int temp = n >> i & 0x01;
			if (temp == 1) {
				if (count < 1) {
					count++;
				} else
					return false;
			}
			i++;
		}
		return count == 1;
	}
}
