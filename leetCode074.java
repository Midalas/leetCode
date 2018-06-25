package leetCode;

public class leetCode074 {

	public static void main(String[] args) throws Exception {
//		 int[][] matrix = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34,50 } };
		int[][] matrix = { { 1 },{3} };
		int target = 3;
		boolean x = searchMatrix(matrix, target);
		System.out.println(x);

	}

	public static boolean searchMatrix(int[][] matrix, int target) {
		int height = matrix.length;
		if (height < 1)
			return false;
		int width = matrix[0].length;
		if (width < 1)
			return false;
		int row = getRow(matrix, target, height, width);
		int low = 0;
		int high = width-1;
		int middle = (low + high) / 2;
		while (low <=  high) {
			middle = (int)Math.ceil((low + high) / 2.0);
			if (matrix[row][middle] == target) {
				return true;
			} else if (matrix[row][middle] < target) {
				low = middle + 1;
			} else {
				high = middle-1;
			}
		}
		return false;
	}

	private static int getRow(int[][] matrix, int target, int height, int width) {
		int low = 0;
		int high = height-1;
		int middle = (low + high) / 2;
		while (low <= high) {
			middle = (low + high) / 2;
			if (matrix[middle][0] <= target && matrix[middle][width - 1] >= target) {
				return middle;
			} else if (matrix[middle][0] > target) {
				high = middle - 1;
			} else if (matrix[middle][width - 1] < target) {
				low = middle +1;
			}
		}
		return middle;
	}
}
