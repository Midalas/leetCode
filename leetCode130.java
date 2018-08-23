
package leetCode;

public class leetCode130 {

	public static void main(String[] args) throws Exception {
		// X X X X X
		// X O O O X
		// X O O O X
		// X X X X X
		char[][] board = { { 'X', 'X', 'X', 'X', 'X' }, { 'X', 'O', 'O', 'O', 'X' }, { 'X', 'O', 'O', 'O', 'X' },
				{ 'X', 'X', 'X', 'X', 'X' } };
		solve(board);
		System.out.println("");
	}

	//runtime 8ms
	public static void solve(char[][] board) {
		if(board.length<1)
			return;
		int height = board.length;
		int width = board[0].length;
		for (int i = 0; i < height; i++) {
			dfs(board, i, 0);
			dfs(board, i, width - 1);
		}
		for (int j = 0; j < width; j++) {
			dfs(board, 0, j);
			dfs(board, height - 1, j);
		}

		for (int i = 0; i < height; i++)
			for (int j = 0; j < width; j++)
				board[i][j] = board[i][j] == 'Y' ? 'O' : 'X';
	}

	private static void dfs(char[][] board, int i, int j) {
		int height = board.length;
		int width = board[0].length;
		if (i < 0 || i >= height || j < 0 || j >= width)
			return;
		if (board[i][j] == 'O') {
			board[i][j] = 'Y';
			dfs(board, i - 1, j);
			dfs(board, i + 1, j);
			dfs(board, i, j - 1);
			dfs(board, i, j + 1);
		}
		return;
	}
}
