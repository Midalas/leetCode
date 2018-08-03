
package leetCode;

public class leetCode695 {

	public static void main(String[] args) throws Exception {

		int[][] grid = { { 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0 },
				{ 0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0 },
				{ 0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0 } };

		int x = maxAreaOfIsland(grid);
		System.out.println();
	}

	//runtime 54ms
	public static int maxAreaOfIsland(int[][] grid) {
		int height = grid.length;
		if (height < 1)
			return 0;
		int width = grid[0].length;
		int res = 0;
		for (int i = 0; i < height; i++)
			for (int j = 0; j < width; j++)
				if (grid[i][j] == 1) {
					int temp = getMaxArea(grid, i, j);
					res = temp > res ? temp : res;
				}
		return res;
	}

	private static int getMaxArea(int[][] grid, int h, int w) {
		if (h < 0 || h >= grid.length || w < 0 || w >= grid[0].length || grid[h][w] == 0)
			return 0;
		grid[h][w] = 0;
		return 1 + getMaxArea(grid, h, w - 1) + getMaxArea(grid, h, w + 1) + getMaxArea(grid, h - 1, w)
				+ getMaxArea(grid, h + 1, w);
	}

}
