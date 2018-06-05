package leetCode;

public class leetCode124 {

	public static void main(String[] args) throws Exception {
		// TreeNode root = new TreeNode(1);
		// root.left = new TreeNode(2);
		// root.right = new TreeNode(3);

		// TreeNode root = new TreeNode(-10);
		// root.left = new TreeNode(9);
		// root.right = new TreeNode(20);
		// root.right.left = new TreeNode(15);
		// root.right.right = new TreeNode(7);

		// TreeNode root = new TreeNode(-2);
		// root.left = new TreeNode(-1);

		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(-2);
		root.right = new TreeNode(-3);
		root.left.left = new TreeNode(1);
		root.left.right = new TreeNode(3);
		root.left.left.left = new TreeNode(-1);
		root.right.left = new TreeNode(-2);

		int x = maxPathSum(root);
		System.out.println(x);

	}

	public static int max = Integer.MIN_VALUE;

	public static int maxPathSum(TreeNode root) {
		if (root == null)
			return 0;
		max=Integer.MIN_VALUE;
		dfs(root);
		return max;
	}

	private static int dfs(TreeNode root) {
		if (root == null)
			return 0;
		int left = dfs(root.left);
		int right = dfs(root.right);
		max = Math.max(Math.max(0, left) + Math.max(0, right) + root.val, max);
		return Math.max(0, Math.max(left, right)) + root.val;
	}

	// private static int midalas_max = Integer.MIN_VALUE;
	//
	// public static int maxPathSum(TreeNode root) {
	// if (root == null)
	// return 0;
	// if (root.left == null && root.right == null)
	// return root.val;
	// midalas_max = Integer.MIN_VALUE;
	// dfs(root);
	// return midalas_max;
	// }
	//
	// private static int dfs(TreeNode root) {
	// if (root == null)
	// return 0;
	// int t1 = root.val + dfs(root.left) + dfs(root.right);
	// int t2 = dfs(root.left) + root.val;
	// int t3 = dfs(root.right) + root.val;
	// int t4 = root.val;
	// int temp=Math.max(Math.max(t2, t3), t4);
	// midalas_max = Math.max(Math.max(temp,t1),midalas_max);
	// return temp;
	// }

}
