
package leetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class leetCode386 {

	public static void main(String[] args) throws Exception {

		// 给定 n =1 3，返回 [1,10,11,12,13,2,3,4,5,6,7,8,9] 。

		List<Integer> x = lexicalOrder(1000);
		System.out.println("");
	}

	//runtime 294ms
	public static List<Integer> lexicalOrder(int n) {

		List<Integer> res = new ArrayList<Integer>();
		for (int i = 1; i < 10; i++)
			dfs(i, res, n);
		return res;
	}

	private static void dfs(int i, List<Integer> res, int n) {
		if (i > n)
			return;
		res.add(i);
		int temp = i * 10;
		for (int j = 0; j < 10; j++)
			dfs(temp + j, res, n);
	}
}
