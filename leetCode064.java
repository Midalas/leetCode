package leetCode;

public class leetCode064 {

	public static void main(String[] args) throws Exception {
		int[][] nums = { { 1, 2, 5 }, { 3, 2, 1 } };
		int x = minPathSum(nums);

		System.out.println(x);
	}

	public static int minPathSum(int[][] grid) {
		int height = grid.length;
		int width = grid[0].length;
		for (int i = 1; i < width; i++) {
			grid[0][i] += grid[0][i - 1];
		}
		for (int j = 1; j < height; j++) {
			grid[j][0] += grid[j - 1][0];
		}
		for (int i = 1; i < height; i++) {
			for (int j = 1; j < width; j++) {
				grid[i][j] += grid[i - 1][j] < grid[i][j - 1] ? grid[i - 1][j] : grid[i][j - 1];
			}
		}
		return grid[height - 1][width - 1];
	}
}
