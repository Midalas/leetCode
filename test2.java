package leetCode;

import java.util.ArrayList;
import java.util.List;

public class test2 {

	public static void main(String[] args) throws Exception {
//		TreeNode root = new TreeNode(3);
//		root.left = new TreeNode(2);
//		root.left.right = new TreeNode(3);
//		root.left.right.left = new TreeNode(4);
//		root.left.right.left.left = new TreeNode(1);
//		root.left.right.left.right = new TreeNode(6);
//		root.right = new TreeNode(3);
//		root.right.right = new TreeNode(1);
//		root.right.right.right = new TreeNode(5);
//		root.right.right.right.left = new TreeNode(2);
//		root.right.right.right.right = new TreeNode(7);

		
		TreeNode root = new TreeNode(3);
		root.left=new TreeNode(2);
		root.left.right=new TreeNode(3);
		root.right=new TreeNode(3);
		root.right.right=new TreeNode(1);
		int x = rob(root);

		System.out.println(x);

	}

	public static int rob(TreeNode root) {
		if(root==null)
			return 0;
		List<Integer> result = new ArrayList<Integer>();
		dfs_left(root.left, result);
		result.add(root.val);
		dfs_right(root.right, result);
		int curMax = 0;
		int curP = 0;
		for (Integer p : result) {
			int temp = curMax;
			curMax = Math.max(curMax, curP + p);
			curP = temp;
		}
		return curMax;
	}

	private static void dfs_left(TreeNode root, List<Integer> result) {
		if (root == null)
			return;
		if (root.left != null && root.right != null) {
			result.add(root.left.val + root.right.val);
			result.add(root.val);
			return;
		} else if (root.left != null) {
			dfs_left(root.left, result);
		} else if (root.right != null) {
			dfs_left(root.right, result);
		}
		result.add(root.val);
	}

	private static void dfs_right(TreeNode root, List<Integer> result) {
		if (root == null)
			return;
		while (root.left != null || root.right != null) {
			if (root.left != null && root.right != null) {
				result.add(root.val);
				result.add(root.left.val + root.right.val);
				break;
			} else if (root.left != null) {
				result.add(root.val);
				root = root.left;
			} else if (root.right != null) {
				result.add(root.val);
				root = root.right;
			}		
		}
		result.add(root.val);
	}
}
