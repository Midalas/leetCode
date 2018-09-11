
package leetCode;

public class leetCode897 {

	public static void main(String[] args) throws Exception {
		TreeNode root = leetCode297.deserialize("5,3,6,2,4,#,8,1,#,#,#,7,9");

		TreeNode x = increasingBST(root);
		System.out.println("");
	}

	// 81ms
	public static TreeNode increasingBST(TreeNode root) {
		TreeNode res = new TreeNode(0);
		dfs(root, res);
		return res.right;
	}

	private static void dfs(TreeNode root, TreeNode res) {
		if (root == null)
			return;
		dfs(root.left, res);
		addNode(res, root.val);
		dfs(root.right, res);
	}

	private static void addNode(TreeNode root, int val) {
		while (null != root.right) {
			root = root.right;
		}
		root.right = new TreeNode(val);
	}
}
