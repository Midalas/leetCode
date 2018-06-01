package leetCode;

public class leetCode104 {

	public static void main(String[] args) throws Exception {

		// 3
		// / \
		// 9 20
		// / \
		// 15 7
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(9);
		root.right = new TreeNode(20);

		root.right.left = new TreeNode(15);
		root.right.right = new TreeNode(7);

		maxDepth(root);
		System.out.println();
	}

	public static int maxDepth(TreeNode root) {
		return dfs(root, 0, 0);
	}

	private static int dfs(TreeNode root, int max, int depth) {
		max = depth > max ? depth : max;
		if (root == null)
			return max;
		return Math.max(dfs(root.left, max, depth + 1), dfs(root.right, max, depth + 1));
	}

}
