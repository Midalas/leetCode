package leetCode;

import java.util.ArrayList;
import java.util.List;

public class leetCode77 {

	public static void main(String[] args) throws Exception {
		int n = 4;
		int k = 2;

		combine(n, k);
		System.out.println();
	}

	public static List<List<Integer>> combine(int n, int k) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		List<Integer> temp = new ArrayList<Integer>();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = i + 1;
		}
		dfs(a, result, temp, n, k, 0);
		return result;
	}

	private static void dfs(int[] a, List<List<Integer>> result, List<Integer> temp, int n, int k, int p) {
		if (k < 1) {
			result.add(new ArrayList<Integer>(temp));
			return;
		} else {
			for (int i = p + 1; i <= n; i++) {
				List<Integer> temp1 = new ArrayList<Integer>(temp);
				temp1.add(i);
				dfs(a, result, temp1, n, k - 1, i);
			}
		}
	}

}
