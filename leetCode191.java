
package leetCode;

public class leetCode191 {

	public static void main(String[] args) throws Exception {

		int n = 128;
		int x = hammingWeight(n);
		System.out.println();
	}

	public static int hammingWeight(int n) {
		int count = 0;
		int i = 0;
		while (i < 32) {
			int temp = n & 0x01;
			if (temp != 0)
				count++;
			n >>= 1;
			i++;
		}
		return count;
	}

}
