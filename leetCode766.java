
package leetCode;

public class leetCode766 {

	public static void main(String[] args) throws Exception {

		int[][] matrix = { { 1, 2 }, { 5, 2 } };
		boolean x = isToeplitzMatrix(matrix);
		System.out.println();
	}

	public static boolean isToeplitzMatrix(int[][] matrix) {
		int height = matrix.length;
		int width = matrix[0].length;
		for (int i = 1; i < height; i++) {
			for (int j = 1; j < width; j++) {
				if (matrix[i][j] != matrix[i - 1][j - 1])
					return false;
			}
		}
		return true;
	}
}
