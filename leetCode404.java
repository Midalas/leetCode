package leetCode;

public class leetCode404 {

	public static void main(String[] args) throws Exception {

		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(9);
		root.right = new TreeNode(20);
		root.right.left = new TreeNode(15);
		root.right.right = new TreeNode(17);

		int x = sumOfLeftLeaves(root);
		System.out.println(x);

	}

	private static int midalas_temp = 0;

	public static int sumOfLeftLeaves(TreeNode root) {
		midalas_temp=0;
		dfs(root);
		return midalas_temp;
	}

	private static void dfs(TreeNode root) {
		if (root == null)
			return;
		if (root.left != null) {
			if (root.left.left == null && root.left.right == null)
				midalas_temp += root.left.val;
			dfs(root.left);
		}
		if (root.right != null)
			dfs(root.right);
	}

}
