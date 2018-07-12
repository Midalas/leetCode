
package leetCode;

public class test2 {

	public static void main(String[] args) throws Exception {

		int n = 2;
		int x = guessNumber(n);
		System.out.println();
	}

	public static int guessNumber(int n) {
		int low = 1;
		int high = n;
		while (low <= high) {
			int middle = (high - low) / 2 + low;
			int temp = guess(middle);
			if (temp == -1) {
				high = middle - 1;
			} else if (temp == 1) {
				low = middle + 1;
			} else {
				return middle;
			}
		}
		return -1;
	}

	private static int guess(int num) {
		int x = 1;
		if (num == x) {
			return 0;
		} else if (num > x) {
			return 1;
		} else {
			return -1;
		}
	}
}
