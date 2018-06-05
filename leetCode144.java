package leetCode;

import java.util.ArrayList;
import java.util.List;

public class leetCode144 {

	public static void main(String[] args) throws Exception {
		TreeNode root = new TreeNode(1);
		root.left=new TreeNode(5);
		root.left.left=new TreeNode(9);
		root.left.right=new TreeNode(7);
		root.right = new TreeNode(2);
		root.right.left = new TreeNode(3);

		List<Integer> x = preorderTraversal(root);

		System.out.println(x);

	}

	public static List<Integer> preorderTraversal(TreeNode root) {
		List<Integer> result = new ArrayList<Integer>();
		dfs(root, result);
		return result;
	}

	private static void dfs(TreeNode root, List<Integer> result) {
		if (root == null)
			return;
		result.add(root.val);
		if (root.left != null)
			dfs(root.left, result);
		if (root.right != null)
			dfs(root.right, result);
	}
}
