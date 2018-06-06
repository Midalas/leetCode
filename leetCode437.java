package leetCode;

public class leetCode437 {

	public static void main(String[] args) throws Exception {

		TreeNode root = new TreeNode(10);
		root.left = new TreeNode(5);
		root.right = new TreeNode(-3);
		root.left.left = new TreeNode(3);
		root.left.right = new TreeNode(2);
		root.right.right = new TreeNode(11);
		root.left.left.left = new TreeNode(3);
		root.left.left.right = new TreeNode(-2);
		root.left.right.right = new TreeNode(1);
		int sum = 8;

		// TreeNode root = new TreeNode(1);
		// root.right=new TreeNode(2);
		// root.right.right=new TreeNode(3);
		// root.right.right.right=new TreeNode(4);
		// int sum=3;

		int x = pathSum(root, sum);
		System.out.println(x);

	}

	public static int pathSum(TreeNode root, int sum) {
		int count = 0;
		if (root == null)
			return count;
		if (root.left != null)
			count += pathSum(root.left, sum);
		if (root.right != null)
			count += pathSum(root.right, sum);
		count += dfs(root, sum);
		return count;
	}

	private static int dfs(TreeNode root, int sum) {
		int count = 0;
		if (root == null)
			return count;
		if (root.val == sum)
			count++;
		count += dfs(root.left, sum - root.val);
		count += dfs(root.right, sum - root.val);
		return count;
	}

}
