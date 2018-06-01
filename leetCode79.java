package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

@SuppressWarnings("unused")
public class leetCode79 {

	public static void main(String[] args) throws Exception {
		System.out.println();

	}
	public static boolean exist(char[][] board, String word) {
		int height = board.length;
		int width = board[0].length;
		List<Boolean> tempList = new ArrayList<Boolean>();
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				if (board[i][j] == word.charAt(0)) {
					dfs(board, tempList, word, i, j, height, width, 1);
					if (tempList.size() > 0)
						return true;
				}
			}
		}
		return false;
	}

	private static void dfs(char[][] board, List<Boolean> tempList, String word, int i, int j, int height, int width,
			int index) {
		char temp = board[i][j];
		if(tempList.size()>0){
			return;
		}
		board[i][j] = '\0';
		if (index == word.length()) {
			tempList.add(true);
			return;
		}
		if (i - 1 >= 0 && board[i - 1][j] == word.charAt(index)) {
			board[i - 1][j] = '\0';
			dfs(board, tempList, word, i - 1, j, height, width, index + 1);
			board[i - 1][j] = word.charAt(index);
		}
		if (j - 1 >= 0 && board[i][j - 1] == word.charAt(index)) {
			board[i][j - 1] = '\0';
			dfs(board, tempList, word, i, j - 1, height, width, index + 1);
			board[i][j - 1] = word.charAt(index);
		}
		if (i + 1 < height && board[i + 1][j] == word.charAt(index)) {
			board[i + 1][j] = '\0';
			dfs(board, tempList, word, i + 1, j, height, width, index + 1);
			board[i + 1][j] = word.charAt(index);
		}
		if (j + 1 < width && board[i][j + 1] == word.charAt(index)) {
			board[i][j + 1] = '\0';
			dfs(board, tempList, word, i, j + 1, height, width, index + 1);
			board[i][j + 1] = word.charAt(index);
		}
		board[i][j] = temp;
		return;
	}
	
}
