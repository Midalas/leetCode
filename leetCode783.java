
package leetCode;

public class leetCode783 {

	public static void main(String[] args) throws Exception {
		TreeNode root = leetCode297.deserialize("90,69,#,49,89,#,52,#,#,#,#");

		int x = minDiffInBST(root);

		System.out.println();
	}
	//runtime 3ms
	public static int minDiff = 0;

	public static int minDiffInBST(TreeNode root) {
		minDiff = Integer.MAX_VALUE;
		int[] temp = new int[] { -100 };
		dfs(temp, root);
		return minDiff;
	}

	private static void dfs(int[] now, TreeNode root) {
		if (root == null)
			return;
		dfs(now, root.left);
		minDiff = root.val - now[0] < minDiff ? root.val - now[0] : minDiff;
		now[0] = root.val;
		dfs(now, root.right);
	}

}
