
package leetCode;

import java.util.HashSet;
import java.util.Set;

public class leetCode036 {

	public static void main(String[] args) throws Exception {

		System.out.println();
	}

	public static boolean isValidSudoku(char[][] board) {
		for (int i = 0; i < 9; i++) {
			Set<Character> set1 = new HashSet<Character>();
			Set<Character> set2 = new HashSet<Character>();
			for (int j = 0; j < 9; j++) {
				if ('.' != board[i][j]) {
					if (set1.contains(board[i][j])) {
						return false;
					} else {
						set1.add(board[i][j]);
					}
				}
				if ('.' != board[j][i]) {
					if (set2.contains(board[j][i])) {
						return false;
					} else {
						set2.add(board[j][i]);
					}
				}
			}
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				Set<Character> set3 = new HashSet<Character>();
				for (int m = 0; m < 3; m++) {
					for (int n = 0; n < 3; n++) {
						if ('.' != board[i * 3 + m][j * 3 + n]) {
							if (set3.contains(board[i * 3 + m][j * 3 + n])) {
								return false;
							} else {
								set3.add(board[i * 3 + m][j * 3 + n]);
							}
						}
					}
				}
			}
		}

		return true;
	}
}
