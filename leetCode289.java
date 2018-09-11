
package leetCode;

public class leetCode289 {

	public static void main(String[] args) throws Exception {

		// 如果活细胞周围八个位置的活细胞数少于两个，则该位置活细胞死亡；
		// 如果活细胞周围八个位置有两个或三个活细胞，则该位置活细胞仍然存活；
		// 如果活细胞周围八个位置有超过三个活细胞，则该位置活细胞死亡；
		// 如果死细胞周围正好有三个活细胞，则该位置死细胞复活；
		int[][] board = { { 0, 1, 0 }, { 0, 0, 1 }, { 1, 1, 1 }, { 0, 0, 0 } };
		gameOfLife(board);
		System.out.println("");
	}

	//runtime 3ms
	public static void gameOfLife(int[][] board) {
		int height = board.length;
		if (height < 1)
			return;
		int width = board[0].length;
		if (width < 1)
			return;
		int[][] temp = new int[board.length][board[0].length];
		for (int i = 0; i < height; i++) 
			for (int j = 0; j < width; j++) 
				temp[i][j] = isAlive(board, i, j);
		for (int i = 0; i < height; i++)
			for (int j = 0; j < width; j++)
				board[i][j] = temp[i][j];
	}

	private static int isAlive(int[][] board, int x, int y) {
		int aliveAmount = getLiveAround(board, x, y);
		if (board[x][y] == 1) {
			return aliveAmount == 2 || aliveAmount == 3 ? 1 : 0;
		} else if (aliveAmount == 3) {
			return 1;
		}
		return board[x][y];
	}

	private static int getLiveAround(int[][] board, int x, int y) {
		int count = 0;
		int height = board.length;
		int width = board[0].length;
		if (x - 1 >= 0) {
			if (y - 1 >= 0 && board[x - 1][y - 1] == 1)
				count++;
			if (board[x - 1][y] == 1)
				count++;
			if (y + 1 < width && board[x - 1][y + 1] == 1)
				count++;
		}
		if (y - 1 >= 0 && board[x][y - 1] == 1)
			count++;
		if (y + 1 < width && board[x][y + 1] == 1)
			count++;
		if (x + 1 < height) {
			if (y - 1 >= 0 && board[x + 1][y - 1] == 1)
				count++;
			if (board[x + 1][y] == 1)
				count++;
			if (y + 1 < width && board[x + 1][y + 1] == 1)
				count++;
		}
		return count;
	}
}
