package leetCode;

public class leetCode114 {

	public static void main(String[] args) throws Exception {
		// 1
		// / \
		// 2 5
		// / \ \
		// 3 4 6
		// / \
		// 7 8


		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(5);
		root.left.left = new TreeNode(3);
		root.left.right = new TreeNode(4);
		root.right.right = new TreeNode(6);
		root.left.right.left = new TreeNode(7);
		root.left.right.right = new TreeNode(8);

		flatten(root);

		System.out.println();
	}

	private static void flatten(TreeNode root) {
		while (root != null) {
			dfs(root);
			root = root.right;
		}
	}

	private static void dfs(TreeNode root) {
		if (root.left != null) {
			TreeNode p = root.left;
			while (p.right != null)
				p = p.right;
			p.right = root.right;
			root.right = root.left;
			root.left = null;
		}
	}

}
