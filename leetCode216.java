
package leetCode;

import java.util.ArrayList;
import java.util.List;

public class leetCode216 {

	public static void main(String[] args) throws Exception {

		List<List<Integer>> x = combinationSum3(3, 9);
		System.out.println("");
	}

	// runtime 1ms
	public static List<List<Integer>> combinationSum3(int k, int n) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		List<Integer> temp = new ArrayList<Integer>();
		getResult(res, temp, k, n, 0, 0);
		return res;
	}

	private static void getResult(List<List<Integer>> res, List<Integer> temp, int k, int n, int lastk, int last) {
		int tempk = k - lastk;
		if (tempk + tempk * tempk > n + n || 19 * tempk - tempk * tempk < n + n)
			return;
		if (k == lastk + 1) {
			if (n > last && n <= 9) {
				temp.add(n);
				res.add(new ArrayList<Integer>(temp));
				temp.remove(lastk);
			}
			return;
		} else {
			for (int i = last + 1; i < 10; i++) {
				temp.add(i);
				getResult(res, temp, k, n - i, lastk + 1, i);
				temp.remove(lastk);
			}
		}
	}
}
