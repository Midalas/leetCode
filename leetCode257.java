package leetCode;

import java.util.ArrayList;
import java.util.List;

public class leetCode257 {

	public static void main(String[] args) throws Exception {

		TreeNode root = leetCode297.deserialize("6,2,8,0,4,7,9,#,#,3,5,#,#,#,#");

		binaryTreePaths(root);

		System.out.println();

	}

	public static List<String> binaryTreePaths(TreeNode root) {
		List<String> result = new ArrayList<String>();
		List<Integer> temp = new ArrayList<Integer>();
		dfs(root, result, temp);
		return result;
	}

	private static void dfs(TreeNode root, List<String> result, List<Integer> temp) {
		if (root == null)
			return;
		if (root.left == null && root.right == null) {
			String str = "";
			for (Integer s : temp)
				str += s + "->";
			str += root.val + "->";
			str = str.substring(0, str.length() - 2);
			result.add(str);
			return;
		}
		if (root.left != null) {
			temp.add(root.val);
			dfs(root.left, result, temp);
			temp.remove(temp.size() - 1);
		}
		if (root.right != null) {
			temp.add(root.val);
			dfs(root.right, result, temp);
			temp.remove(temp.size() - 1);
		}
	}
}
