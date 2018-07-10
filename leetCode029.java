
package leetCode;

public class leetCode029 {

	public static void main(String[] args) throws Exception {

		System.out.println();
	}

	public static int divide(int dividend, int divisor) {
		boolean flag = dividend > 0 ^ divisor > 0 ? false : true;
		long dividend1 = Math.abs((long) dividend);
		long divisor1 = Math.abs((long) divisor);
		long[] array = new long[32];
		long temp = divisor1;
		int n = 0;
		long result = 0;
		while (dividend1 >= temp) {
			array[n] = temp;
			temp <<= 1;
			n++;
		}
		for (int i = n - 1; i >= 0; i--) {
			if (dividend1 >= array[i]) {
				dividend1 -= array[i];
				result += Math.pow(2, i);
			}
		}
		result = flag ? result : -result;
		result = result > Integer.MAX_VALUE ? Integer.MAX_VALUE : result;
		return (int) result;
	}
}
