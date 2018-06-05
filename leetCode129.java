package leetCode;

public class leetCode129 {

	public static void main(String[] args) throws Exception {
		// [4,9,0,5,1]

		// 4
		// / \
		// 9 0
		// / \
		// 5 1
		TreeNode root = new TreeNode(4);
		root.left = new TreeNode(9);
		root.right = new TreeNode(0);
		root.left.left = new TreeNode(5);
		root.left.right = new TreeNode(1);

		sumNumbers(root);
	}

	public static int sumNumbers(TreeNode root) {
		if (root == null)
			return 0;
		return dfs(root, root.val, 0);
	}

	private static int dfs(TreeNode root, int now, int sum) {
		if (root == null) {
			return sum;
		}
		if (root.left == null && root.right == null) {
			sum += now;
			return sum;
		}
		if (root.left != null) {
			sum = dfs(root.left, now * 10 + root.left.val, sum);
		}
		if (root.right != null) {
			sum = dfs(root.right, now * 10 + root.right.val, sum);
		}

		return sum;
	}

}
