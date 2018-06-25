package leetCode;

public class leetCode059 {

	public static void main(String[] args) throws Exception {
		generateMatrix(5);
	}

	public static int[][] generateMatrix(int n) {
		int[][] result = new int[n][n];
		int round = 0;
		int count = 1;
		while (round < n / 2) {
			for (int i = round; i < n - round - 1; i++) {
				result[round][i] = count++;
			}
			for (int i = round; i < n - round - 1; i++) {
				result[i][n - round - 1] = count++;
			}
			for (int i = n - round - 1; i > round; i--) {
				result[n - round - 1][i] = count++;
			}
			for (int i = n - round - 1; i > round; i--) {
				result[i][round] = count++;
			}
			round++;
		}

		if (n % 2 == 1) {
			result[n / 2][n / 2] = n * n;
		}
		return result;
	}
}
