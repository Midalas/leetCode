
package leetCode;

public class leetCode687 {

	public static void main(String[] args) throws Exception {
		// 5
		// 5 5
		// 5 5 5 #
		//

		TreeNode root = leetCode297.deserialize("5,5,5,5,5,5,#");
		int x = longestUnivaluePath(root);
		System.out.println();
	}

	// runtime 12ms
	public static int longestLength = 0;

	public static int longestUnivaluePath(TreeNode root) {
		longestLength = 0;
		dfs(root);
		return longestLength;
	}

	private static void dfs(TreeNode root) {
		if (root == null)
			return;
		int left = getMaxLength(root.left, root.val);
		int right = getMaxLength(root.right, root.val);
		if (left != 0 || right != 0)
			longestLength = left + right > longestLength ? left + right : longestLength;
		dfs(root.left);
		dfs(root.right);
	}

	private static int getMaxLength(TreeNode root, int val) {
		if (root == null || root.val != val)
			return 0;
		return 1 + Math.max(getMaxLength(root.left, val), getMaxLength(root.right, val));
	}
}
