
package leetCode;

public class leetCode190 {

	public static void main(String[] args) throws Exception {

		int n = -2147483648;
		int x = reverseBits(n);
		System.out.println();
	}

	public static int reverseBits(int n) {
		int result = 0;
		int i = 0;
		while (i < 32) {
			//取31-0位
			int temp = n & 0x01;
			n >>= 1;
			//依次0-31按位或
			result <<= 1;
			result |= temp;
			i++;
		}
		return result;
	}

}
