
package leetCode;

public class leetCode374 {

	public static void main(String[] args) throws Exception {

		int n = 10;
		int x = guessNumber(n);
		System.out.println(x);
	}
	public static int target=8;
	
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
		if (num == target) {
			return 0;
		} else if (num > target) {
			return -1;
		} else {
			return 1;
		}
	}
}
