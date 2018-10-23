package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@SuppressWarnings("unused")
public class leetCode547 {
	public static void main(String[] args) throws Exception {
		int[][] M = { { 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0 },
				{ 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0 },
				{ 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1 }, 
				{ 0, 0, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 0, 1, 0 },
				{ 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0 },
				{ 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0 }, 
				{ 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0 },
				{ 1, 0, 0, 1, 0, 0, 0, 0, 1, 1, 1, 0, 0, 1, 0 }, 
				{ 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 1, 0, 0, 0 }, 
				{ 0, 0, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 1 },
				{ 0, 1, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0 },
				{ 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1 } };

		int x = findCircleNum(M);
		System.out.println();

	}

	public static int[] arr;
	public static int res;

	//runtime 15ms
	public static int findCircleNum(int[][] M) {
		res = M.length;
		arr = new int[M.length];
		for (int i = 0; i < M.length; i++) {
			arr[i] = -1;
		}
		for (int i = 0; i < M.length; i++) {
			for (int j = 0; j < M[0].length; j++) {
				if (M[i][j] == 1 && i != j) {
					union(i, j);
				}
			}
		}
		return res;
	}

	public static int find(int x) {
		if (arr[x] < 0) {
			return x;
		} else {
			return arr[x] = find(arr[x]);
		}
	}

	public static void union(int x, int y) {
		int a = find(x);
		int b = find(y);
		if (a != b) {
			arr[a] = b;
			res--;
		}
	}
}
