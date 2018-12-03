package leetCode;

public class leetCode135 {
	public static void main(String[] args) throws Exception {
		int[] ratings = { 1, 0, 2 };
		int x = candy(ratings);
		System.out.println();
	}

	//runtime 7ms
	public static int candy(int[] ratings) {
		int sum = 0;
		int[] left = new int[ratings.length];
		int[] right = new int[ratings.length];
		for (int i = ratings.length - 2; i >= 0; i--) {
			if (ratings[i] > ratings[i + 1]) {
				right[i] = right[i + 1] + 1;
			}
		}
		for (int i = 1; i < ratings.length; i++) {
			if (ratings[i] > ratings[i - 1]) {
				left[i] = left[i - 1] + 1;
			}
			sum += Math.max(left[i], right[i]);
		}
		return sum + Math.max(left[0], right[0]) + ratings.length;
	}
}
