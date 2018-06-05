package leetCode;

import java.util.ArrayList;
import java.util.List;

public class leetCode230 {

	public static void main(String[] args) throws Exception {
		TreeNode root = new TreeNode(5);
		root.left = new TreeNode(3);
		root.left.left = new TreeNode(2);
		root.left.left.left = new TreeNode(1);
		root.left.right = new TreeNode(4);
		root.right = new TreeNode(6);

		int k = 4;
		int x = kthSmallest(root, k);

		System.out.println(x);

	}

	public static int kthSmallest(TreeNode root, int k) {
		List<Integer> result = new ArrayList<Integer>();
		dfs(root, result);
		return result.get(k - 1);
	}

	private static void dfs(TreeNode root, List<Integer> result) {
		if (root == null)
			return;
		if (root.left != null)
			dfs(root.left, result);
		result.add(root.val);
		if (root.right != null)
			dfs(root.right, result);
	}
}
