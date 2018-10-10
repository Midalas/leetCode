package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Random;
import java.util.Set;
import java.util.Stack;

@SuppressWarnings("unused")
public class leetCode884 {
	public static void main(String[] args) {
		String A = "this apple is sweet";
		String B = "this apple is sour";
		String[] x = uncommonFromSentences(A, B);
		System.out.println();
	}

	// runtime 7ms
	public static String[] uncommonFromSentences(String A, String B) {
		List<String> res = new ArrayList<String>();
		String[] arr1 = A.split(" ");
		String[] arr2 = B.split(" ");
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < arr1.length; i++)
			addString(map, arr1[i]);
		for (int i = 0; i < arr2.length; i++)
			addString(map, arr2[i]);
		for (String key : map.keySet())
			if (map.get(key) == 1)
				res.add(key);
		String[] ans = new String[res.size()];
		for (int i = 0; i < ans.length; i++)
			ans[i] = res.get(i);
		return ans;

	}

	private static void addString(Map<String, Integer> map, String str) {
		if (map.containsKey(str)) {
			map.put(str, map.get(str) + 1);
		} else {
			map.put(str, 1);
		}
	}

}
