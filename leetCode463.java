
package leetCode;

public class leetCode463 {

	public static void main(String[] args) throws Exception {

		int[][] grid = { { 0, 1, 0, 0 }, { 1, 1, 1, 0 }, { 0, 1, 0, 0 }, { 1, 1, 0, 1 } };
		int x = islandPerimeter(grid);

		System.out.println();
	}

	public static int islandPerimeter(int[][] grid) {
		int height = grid.length;
		int width = grid[0].length;
		int count = 0;
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				if (grid[i][j] == 1) {
					if (i == 0 || grid[i - 1][j] == 0)
						count++;
					if (j == 0 || grid[i][j - 1] == 0)
						count++;
					if (i == height - 1 || grid[i + 1][j] == 0)
						count++;
					if (j == width - 1 || grid[i][j + 1] == 0)
						count++;
				}
			}
		}
		return count;
	}

}
