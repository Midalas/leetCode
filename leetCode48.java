package leetCode;



public class leetCode48 {

	public static void main(String[] args) throws Exception {
		// int[][] nums={
		// {1 , 2, 3, 4, 5, 6, 7, 8, 9,10},
		// {11,12,13,14,15, 16,17,18,19,20},
		// {21,22,23,24,25, 26,27,28,29,30},
		// {31,32,33,34,35, 36,37,38,39,40},
		// {41,42,43,44,45, 46,47,48,49,50},
		//
		// {51,52,53,54,55, 56,57,58,59,60},
		// {61,62,63,64,65, 66,67,68,69,70},
		// {71,72,73,74,75, 76,77,78,79,80},
		// {81,82,83,84,85, 86,87,88,89,90},
		// {91,92,93,94,95, 96,97,98,99,100}}
		// ;
		// int[][] nums = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		// int[][] nums = { { 5, 1, 9,11}, { 2, 4, 8,10 }, {13, 3, 6, 7
		// },{15,14,12,16} };

		int[][] nums = { {} };
		rotate(nums);
		System.out.println();
	}

	public static void rotate(int[][] matrix) {
		int n = matrix.length;
		double half = (matrix.length - 1) / 2.0;
		int temp = 0;
		for (int x = 0; x <= half; x++) {
			for (int y = 0; y < half; y++) {
				temp = matrix[x][y];
				matrix[x][y] = matrix[n - 1 - y][x];
				matrix[n - 1 - y][x] = matrix[n - 1 - x][n - 1 - y];
				matrix[n - 1 - x][n - 1 - y] = matrix[y][n - 1 - x];
				matrix[y][n - 1 - x] = temp;
			}
		}
	}

}
