package leetCode;

public class leetCode563 {

	public static void main(String[] args) throws Exception {

		TreeNode root = leetCode297.deserialize("5,3,6,2,4,#,7");
		int x = findTilt(root);
		System.out.println(x);
	}

	private static int sum563 = 0;
	public static int findTilt(TreeNode root) {
		sum563 = 0;
		dfs(root);
		return sum563;
	}

	private static int dfs(TreeNode root) {
		if (root == null)
			return 0;
		int left = dfs(root.left);
		int right = dfs(root.right);
		int newVal = root.val + left + right;
		sum563 += Math.abs(left - right);
		root.val = newVal;
		return newVal;
	}

}
