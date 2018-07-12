
package leetCode;

public class leetCode367 {

	public static void main(String[] args) throws Exception {
		int num = 808201;
		boolean x = isPerfectSquare(num);
		System.out.println();
	}

	public static boolean isPerfectSquare(int num) {
		long low = 0;
		long high = (num+1) / 2;
		while (low <= high) {
			long middle = (long) (low + high) / 2;
			long val = middle * middle;
			if (val == num) {
				return true;
			} else if (val > num) {
				high = middle - 1;
			} else {
				low = middle + 1;
			}
		}
		return false;
	}

}
