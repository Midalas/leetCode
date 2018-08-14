
package leetCode;

public class leetCode840 {

	public static void main(String[] args) throws Exception {
		int[][] grid = { { 4, 3, 8, 4 }, { 9, 5, 1, 9 }, { 2, 7, 6, 2 } };
		int x = numMagicSquaresInside(grid);
		System.out.println();
	}

	//runtime 6ms
	public static int numMagicSquaresInside(int[][] grid) {
		int res = 0;
		int height = grid.length;
		int width = grid[0].length;
		for (int i = 1; i < height - 1; i++) {
			for (int j = 1; j < width - 1; j++) {
				if (grid[i][j] == 5) {
					if (grid[i - 1][j - 1] > 0 && grid[i - 1][j - 1] < 10 && grid[i][j - 1] > 0 && grid[i][j - 1] < 10
							&& grid[i + 1][j - 1] > 0 && grid[i + 1][j - 1] < 10 && grid[i - 1][j] > 0
							&& grid[i - 1][j] < 10 && grid[i + 1][j] > 0 && grid[i + 1][j] < 10
							&& grid[i - 1][j + 1] > 0 && grid[i - 1][j + 1] < 10 && grid[i][j + 1] > 0
							&& grid[i][j + 1] < 10 && grid[i + 1][j + 1] > 0 && grid[i + 1][j + 1] < 10
							&& grid[i - 1][j - 1] + grid[i][j - 1] + grid[i + 1][j - 1] == 15
							&& grid[i - 1][j] + grid[i + 1][j] == 10
							&& grid[i - 1][j + 1] + grid[i][j + 1] + grid[i + 1][j + 1] == 15
							&& grid[i - 1][j - 1] + grid[i - 1][j] + grid[i - 1][j + 1] == 15
							&& grid[i][j - 1] + grid[i][j + 1] == 10
							&& grid[i + 1][j - 1] + grid[i + 1][j] + grid[i + 1][j + 1] == 15
							&& grid[i - 1][j - 1] + grid[i + 1][j + 1] == 10
							&& grid[i - 1][j + 1] + grid[i + 1][j - 1] == 10) {
						res++;
					}
				}
			}
		}

		return res;
	}

}
