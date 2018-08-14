
package leetCode;

public class leetCode849 {

	public static void main(String[] args) throws Exception {

		System.out.println();
	}

	//runtime 10ms
	public static int maxDistToClosest(int[] seats) {
		int max = 0;
		int count = 0;
		for (int i = 0; i < seats.length; i++) {
			if (seats[i] == 0) {
				count++;
				max = count > max ? count : max;
			} else {
				count = 0;
			}
		}
		int left = 0;
		for (int i = 0; i < seats.length; i++) {
			if (seats[i] == 0) {
				left++;
			} else {
				break;
			}
		}
		int right = 0;
		for (int i = seats.length - 1; i >= 0; i--) {
			if (seats[i] == 0) {
				right++;
			} else {
				break;
			}
		}
		return Math.max(Math.max(left, right), (max + 1) / 2);
	}

}
