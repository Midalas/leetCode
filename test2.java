package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test2 {
	public static void main(String[] args) throws Exception {

		TreeNode root = leetCode297.deserialize("0,#,1,2,5,#,3,#,#,#,4");

		List<Integer> x = distanceK(root, root.right.left, 2);
		System.out.println();
	}

	private static int[] arr = new int[501];
	public static List<Integer> distanceK(TreeNode root, TreeNode target, int K) {
		List<Integer> res = new ArrayList<Integer>();
		Arrays.fill(arr, 1023);
		arr[root.val] = 0;
		dfs(root.left, -1, -1);
		dfs(root.right, 1, 1);
		int aim = arr[target.val];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 1023 && Math.abs(arr[i] - aim) == K) {
				res.add(i);
			}
		}
		return res;
	}

	private static void dfs(TreeNode root, int level, int offset) {
		if (root == null)
			return;
		arr[root.val] = level;
		dfs(root.left, level + offset, offset);
		dfs(root.right, level + offset, offset);
	}

}
