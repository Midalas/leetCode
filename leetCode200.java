
package leetCode;

public class leetCode200 {

	public static void main(String[] args) throws Exception {
		char[][] grid = { { '1', '1', '1' }, { '0', '1', '0' }, { '1', '1', '1' } };
		int x = numIslands(grid);
		System.out.println("");
	}

	//runtime 7ms
	public static int numIslands(char[][] grid) {
		int count = 0;
		int height = grid.length;
		if (height < 1)
			return 0;
		int width = grid[0].length;
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				if (grid[i][j] == '1') {
					count++;
					fillzero(grid, i, j);
				}
			}
		}
		return count;
	}

	private static void fillzero(char[][] grid, int x, int y) {
		int height = grid.length;
		int width = grid[0].length;
		if (x < 0 || y < 0 || x >= height || y >= width)
			return;
		if (grid[x][y] != '1')
			return;
		grid[x][y] = '0';
		fillzero(grid, x, y + 1);
		fillzero(grid, x, y - 1);
		fillzero(grid, x + 1, y);
		fillzero(grid, x - 1, y);
	}
}
