package leetCode;

import java.util.HashMap;
import java.util.Map;

public class leetCode501 {

	public static void main(String[] args) throws Exception {
		TreeNode root = new TreeNode(1);
		root.right = new TreeNode(2);
		root.right.left = new TreeNode(1);
		root.right.left.right = new TreeNode(2);
		root.right.left.right.left = new TreeNode(1);
		root.right.left.right.left.right = new TreeNode(2);

		int[] x = findMode(root);

		System.out.println(x);
	}

	private static int max = 0;
	private static int count = 0;
	public static int[] findMode(TreeNode root) {
		max = 0;
		count = 0;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		dfs(map, root);
		int[] res = new int[count];
		int i = 0;
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() == max) {
				res[i] = entry.getKey();
				i++;
			}
		}
		return res;
	}

	private static void dfs(Map<Integer, Integer> map, TreeNode root) {
		if (root == null)
			return;
		if (root.left != null)
			dfs(map, root.left);
		if (map.get(root.val) == null) {
			map.put(root.val, 1);
			max = 1 > max ? 1 : max;
			if (max == 1)
				count++;
		} else {
			if (map.get(root.val) + 1 > max) {
				max = map.get(root.val) + 1;
				count = 1;		
			} else if (map.get(root.val) + 1 == max) {
				count++;
			}
			map.replace(root.val, map.get(root.val) + 1);
		}
		if (root.right != null)
			dfs(map, root.right);
	}
}
