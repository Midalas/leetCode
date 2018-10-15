package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
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
public class leetCode892 {
	public static void main(String[] args) {
		int[][] grid = { { 2, 2, 2 }, { 2, 1, 2 }, { 2, 2, 2 } };

		int x = surfaceArea(grid);
		System.out.println();
	}

	//runtime 13ms
	public static int surfaceArea(int[][] grid) {
		int res = 0;
		int y = grid.length;
		int x = grid[0].length;
		for (int i = 0; i < y; i++) {
			for (int j = 0; j < x; j++) {
				if (grid[i][j] > 0) {
					res += grid[i][j] * 4 + 2;
					if (i > 0 && grid[i - 1][j] > 0) 
						res -= Math.min(grid[i - 1][j], grid[i][j]) << 1;
					if (j > 0 && grid[i][j - 1] > 0) 
						res -= Math.min(grid[i][j - 1], grid[i][j]) << 1;
				}
			}
		}

		return res;
	}
}
