package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Random;
import java.util.Set;
import java.util.Stack;

@SuppressWarnings("unused")
public class leetCode419 {
	public static void main(String[] args) {
		char[][] board = { { 'X', 'X', 'X', 'X' } };
		int x = countBattleships(board);
		System.out.println();
	}

	// runtime 4ms
	public static int countBattleships(char[][] board) {
		int res = 0;
		int height = board.length;
		if (height < 1)
			return 0;
		int width = board[0].length;
		if (width < 1)
			return 0;
		if (board[0][0] == 'X')
			res++;
		for (int i = 1; i < height; i++)
			if (board[i][0] == 'X' && board[i - 1][0] == '.')
				res++;
		for (int j = 1; j < width; j++)
			if (board[0][j] == 'X' && board[0][j - 1] == '.')
				res++;
		for (int i = 1; i < height; i++)
			for (int j = 1; j < width; j++)
				if (board[i][j] == 'X' && board[i - 1][j] == '.' && board[i][j - 1] == '.')
					res++;
		return res;
	}
}
