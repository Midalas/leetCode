package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

@SuppressWarnings("unused")
public class leetCode78 {

	public static void main(String[] args) throws Exception {
		int[] nums={1,2,3,4,5};
		System.out.println();

	}

	public static List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		List<Integer> temp = new ArrayList<Integer>();
		dfs(nums, result, temp, 0);
		return result;
	}

	    private static void dfs(int[] a, List<List<Integer>> result, List<Integer> temp, int p) {
		result.add(new ArrayList<Integer>(temp));
		for (int i = p; i < a.length; i++) {
			List<Integer> temp1 = new ArrayList<Integer>(temp);
			temp1.add(a[i]);
			dfs(a, result, temp1, i + 1);
		}
		return;
	}

}
