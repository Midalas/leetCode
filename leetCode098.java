
package leetCode;

import java.util.ArrayList;

public class leetCode098 {

	public static void main(String[] args) throws Exception {
		TreeNode root = leetCode297.deserialize("-2147483648");
		boolean x = isValidBST(root);
		System.out.println("");
	}

	//3ms
	public static boolean isValidBST(TreeNode root) {
		long p = Long.MIN_VALUE;
		ArrayList<Integer> list = new ArrayList<Integer>();
		dfs(list, root);
		for (Integer i : list) {
			if ((long)i <= p) {
				return false;
			} else {
				p = i;
			}
		}
		return true;
	}

	private static void dfs(ArrayList<Integer> list, TreeNode root) {
		if (root == null)
			return;
		dfs(list, root.left);
		list.add(root.val);
		dfs(list, root.right);
	}
}
