
package leetCode;

public class leetCode832 {

	public static void main(String[] args) throws Exception {

		int[][] A = { { 1, 1, 0, 0 }, { 1, 0, 1, 0 }, { 0, 0, 0, 0 } };
		int[][] B = flipAndInvertImage(A);
		System.out.println();
	}

	public static int[][] flipAndInvertImage(int[][] A) {
		int height = A.length;
		if (height < 1)
			return A;
		int width = A[0].length;
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < (width + 1) / 2; j++) {
				int temp = A[i][j];
				A[i][j] = 1 - A[i][width - j - 1];
				A[i][width - j - 1] = 1 - temp;
			}
		}
		return A;
	}
}
