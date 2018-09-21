package leetCode;

import java.util.Stack;

@SuppressWarnings("unused")
public class leetCode395 {
	public static void main(String[] args) throws Exception {
		String s = "ababacb";
		int k = 3;
		int x = longestSubstring(s, k);
		System.out.println();
	}

	//runtime 119ms
	public static int longestSubstring(String s, int k) {
		return dfs(s, 0, s.length(), k);
	}

	private static int dfs(String s, int start, int end, int k) {
		if (start >= end)
			return 0;
		int[] arr=new int[128];
		for (int i = start; i < end; i++)
			arr[s.charAt(i)]++;
		for (int i = start; i < end; i++)
			if (arr[s.charAt(i)] < k)
				return Math.max(dfs(s, start, i, k), dfs(s, i + 1, end, k));
		return end - start;
	}

}
