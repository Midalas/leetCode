package leetCode;

import java.util.Comparator;
import java.util.PriorityQueue;

public class test2 {
	public static void main(String[] args) throws Exception {
		int[] nums = { 9, 1, 2, 3, 9 };

		largestSumOfAverages(nums, 3);
		System.out.println();
	}

	public static double largestSumOfAverages(int[] A, int K) {
		double res = 0.0;
		double sum = 0.0;
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		for (int i = 0; i < A.length; i++) {
			queue.add(A[i]);
			if (queue.size() > K - 1) {
				sum += queue.poll();
			}
		}
		res = sum / (A.length - K + 1);
		while (!queue.isEmpty()) {
			res += queue.poll();
		}
		return res;
	}

}
