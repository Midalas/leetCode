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
public class leetCode883 {
	public static void main(String[] args) {
		int[][] grid = { { 2, 2, 2 }, { 2, 1, 2 }, { 2, 2, 2 } };
		int x = projectionArea(grid);
		System.out.println();
	}

	//runtime 7ms
	public static int projectionArea(int[][] grid) {
		int x = grid.length;
		int y = grid[0].length;
		int countx = 0;
		int county = 0;
		int countz = 0;
		for (int i = 0; i < x; i++) {
			int max = 0;
			for (int j = 0; j < y; j++) {
				if (grid[i][j] != 0)
					countz++;
				max = grid[i][j] > max ? grid[i][j] : max;
			}
			countx += max;
		}
		for (int j = 0; j < y; j++) {
			int max = 0;
			for (int i = 0; i < x; i++)
				max = grid[i][j] > max ? grid[i][j] : max;
			county += max;
		}
		return countx + county + countz;
	}
}
