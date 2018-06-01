package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

@SuppressWarnings("unused")
public class leetCode90 {

	public static void main(String[] args) throws Exception {
		int[] nums = { 1, 1, 2, 2 };
		subsetsWithDup(nums);
		System.out.println();

	}

	public static List<List<Integer>> subsetsWithDup(int[] nums) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		List<Integer> temp = new ArrayList<Integer>();
		Arrays.sort(nums);
		dfs(nums, result, temp, 0);
		return result;
	}

	private static void dfs(int[] a, List<List<Integer>> result, List<Integer> temp, int p) {
		result.add(new ArrayList<Integer>(temp));
		for (int i = p; i < a.length; i++) {
			if (i == p || a[i] != a[i - 1]) {
				temp.add(a[i]);
				dfs(a, result, temp, i + 1);
				temp.remove(temp.size() - 1);
			}
		}
		return;
	}
}
