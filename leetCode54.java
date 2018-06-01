package leetCode;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unused")

public class leetCode54 {

	public static void main(String[] args) throws Exception {

		System.out.println();
		int[][] matrix = {};
		// int[][] matrix={{ 1, 2, 3 },
		// { 4, 5, 6 },
		// { 7, 8, 9 }};
		// int[][] matrix={ {1, 2, 3, 4},
		// {5, 6, 7, 8},
		// {9,10,11,12}};
		// int[][] matrix = {
		// { 1, 2, 3 },
		// { 4, 5, 6,},
		// { 7, 8, 9 },
		// { 10,11,12 } };
		// int[][] matrix = {
		// { 1, 2, 3,4, 5, 6},
		// { 7, 8, 9,10,11,12},
		// {13,14,15,16,17,18}
		// };
		// int[][] matrix = {
		// { 1, 2, 3,4, 5, 6},
		// { 7, 8, 9,10,11,12}
		// };
		spiralOrder(matrix);
	}

	public static List<Integer> spiralOrder(int[][] matrix) {
		List<Integer> result = new ArrayList<Integer>();
		int height = matrix.length;
		if (height < 1)
			return result;
		int width = matrix[0].length;
		int a = 0;// 最上行
		int b = height - 1;// 最下行
		int c = 0;// 最左行
		int d = width - 1;// 最右行
		int count = 0;
		while (a < b && c < d) {
			for (int i = c; i <= d; i++) {
				result.add(matrix[a][i]);
			}
			a++;
			for (int i = a; i <= b; i++) {
				result.add(matrix[i][d]);
			}
			d--;
			for (int i = d; i >= c; i--) {
				result.add(matrix[b][i]);
			}
			b--;
			for (int i = b; i >= a; i--) {
				result.add(matrix[i][c]);
			}
			c++;
			count++;
		}

		if (width > height && b >= a) {
			for (int i = c; i <= d; i++) {
				result.add(matrix[a][i]);
			}
		} else if (width <= height && d >= c) {
			for (int i = a; i <= b; i++) {
				result.add(matrix[i][c]);
			}
		}

		return result;
	}

}
