package leetCode;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class leetCode73 {

	public static void main(String[] args) throws Exception {

		System.out.println();
		int[][] matrix = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };
		setZeroes(matrix);
	}

	public static void setZeroes(int[][] matrix) {
		int height = matrix.length;
		if (height < 1) {
			return;
		}
		int width = matrix[0].length;

		Set<Integer> set_height = new HashSet<Integer>();
		Set<Integer> set_width = new HashSet<Integer>();
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				if (matrix[i][j] == 0) {
					set_height.add(i);
					set_width.add(j);
				}
			}
		}
		Iterator<Integer> it_height = set_height.iterator();
		while (it_height.hasNext()) {
			int h = it_height.next();
			for (int i = 0; i < width; i++) {
				matrix[h][i] = 0;
			}
		}
		Iterator<Integer> it_width = set_width.iterator();
		while (it_width.hasNext()) {
			int w = it_width.next();
			for (int i = 0; i < height; i++) {
				matrix[i][w] = 0;
			}
		}
	}
}
