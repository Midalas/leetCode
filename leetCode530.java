
package leetCode;

import java.util.ArrayList;

public class leetCode530 {

	public static void main(String[] args) throws Exception {
		TreeNode root = null;

		int x = getMinimumDifference(root);
		System.out.println();
	}

	//runtime 13ms
	public static int getMinimumDifference(TreeNode root) {
		int res = Integer.MAX_VALUE;
		ArrayList<Integer> list = new ArrayList<Integer>();
		dfs(list, root);
		for (int i = 1; i < list.size(); i++)
			res = list.get(i) - list.get(i - 1) < res ? list.get(i) - list.get(i - 1) : res;
		return res;
	}

	private static void dfs(ArrayList<Integer> list, TreeNode root) {
		if (root == null)
			return;
		dfs(list, root.left);
		list.add(root.val);
		dfs(list, root.right);
	}

}
