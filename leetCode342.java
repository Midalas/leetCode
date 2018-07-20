
package leetCode;

public class leetCode342 {

	public static void main(String[] args) throws Exception {
		int num = -8;
		boolean x = isPowerOfFour(num);
		System.out.println();
	}

	public static boolean isPowerOfFour(int num) {
		int i = 0;
		int count = 0;
		if (num < 0)
			return false;
		while (i < 32) {
			int temp = (num >> i) & 0x01;
			if (count > 1)
				return false;
			if (temp == 1) {
				if (i % 2 == 0) {
					count++;
				} else {
					return false;
				}
			}
			i++;
		}
		return count == 1;
	}

}
