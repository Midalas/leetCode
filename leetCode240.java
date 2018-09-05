
package leetCode;

public class leetCode240 {

	public static void main(String[] args) throws Exception {
		int[][] matrix = { {} };
		boolean x = searchMatrix(matrix, 20);
		System.out.println("");
	}

	//runtime 23ms
	public static boolean searchMatrix(int[][] matrix, int target) {
		int height = matrix.length;
		if (height < 1)
			return false;
		int width = matrix[0].length;
		if (width < 1)
			return false;
		for (int i = 0; i < height; i++)
			if (matrix[i][0] > target) {
				return false;
			} else if (matrix[i][width - 1] < target) {
				continue;
			} else {
				for (int j = 0; j < width; j++)
					if (matrix[i][j] == target)
						return true;
			}

		return false;
	}

}
