package leetCode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;

@SuppressWarnings("unused")
public class leetCode378 {
	public static void main(String[] args) throws Exception {

		System.out.println();
	}

	// runtime 61ms
	public static int kthSmallest(int[][] matrix, int k) {
		int height = matrix.length;
		if (height < 1)
			return 0;
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		for (int i = 0; i < height; i++)
			for (int j = 0; j < height; j++)
				queue.add(matrix[i][j]);
		while (k-- > 1 && !queue.isEmpty())
			queue.poll();
		return queue.poll();
	}
}
