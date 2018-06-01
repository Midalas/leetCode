package leetCode;

public class leetCode112 {

	public static void main(String[] args) throws Exception {
		// 5
		// / \
		// 4 8
		// / / \
		// 11 13 4
		// / \ \
		// 7 2 1
		// TreeNode root=new TreeNode(5);
		// root.left=new TreeNode(4);
		// root.right=new TreeNode(8);
		// root.left.left=new TreeNode(11);
		// root.left.left.left=new TreeNode(7);
		// root.left.left.right=new TreeNode(2);
		//
		// root.right.left=new TreeNode(13);
		// root.right.right=new TreeNode(4);
		// root.right.right.right=new TreeNode(1);
		//
		// int sum=22;

		TreeNode root = new TreeNode(-2);
		root.right = new TreeNode(-3);
		int sum = -5;
		boolean x = hasPathSum(root, sum);

		System.out.println(x);
	}

	public static boolean hasPathSum(TreeNode root, int sum) {
		return dfs(root, 0, sum);
	}

	private static boolean dfs(TreeNode root, int now, int sum) {
		if (root == null)
			return false;
		if (now + root.val == sum && root.left == null && root.right == null)	
			return true;
		return dfs(root.left, now + root.val, sum) || dfs(root.right, now + root.val, sum);
	}

}
