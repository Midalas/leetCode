
package leetCode;

public class leetCode807 {

	public static void main(String[] args) throws Exception {

		int[][] grid={{3,0,8,4},{2,4,5,7},{9,2,6,3},{0,3,1,0}};
		int x=maxIncreaseKeepingSkyline(grid);
		System.out.println();
	}

	//runtime 17ms
	public static int maxIncreaseKeepingSkyline(int[][] grid) {
		int res = 0;
		int height = grid.length;
		int width = grid[0].length;
		int[] rowMax = new int[height];
		int[] colMax = new int[width];
		for (int i = 0; i < height; i++) {
			int max = 0;
			for (int j = 0; j < width; j++)
				max = grid[i][j] > max ? grid[i][j] : max;
			rowMax[i] = max;
		}
		for (int i = 0; i < width; i++) {
			int max = 0;
			for (int j = 0; j < height; j++)
				max = grid[j][i] > max ? grid[j][i] : max;
			colMax[i] = max;
		}

		for (int i = 0; i < height; i++)
			for (int j = 0; j < width; j++)
				res += Math.min(rowMax[i], colMax[j]) - grid[i][j];
		return res;
	}
}
