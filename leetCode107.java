package leetCode;

import java.util.ArrayList;
import java.util.List;

public class leetCode107 {

	public static void main(String[] args) throws Exception {

		//  3
		// / \
		// 9 20
		//   / \
		//  15  7
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(9);
		root.right = new TreeNode(20);

		root.right.left = new TreeNode(15);
		root.right.right = new TreeNode(7);

		levelOrderBottom(root);

		System.out.println();
	}

	public static List<List<Integer>> levelOrderBottom(TreeNode root) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		List<TreeNode> node = new ArrayList<TreeNode>();
		if(root==null)
			return result;
		node.add(root);
		bfs(result, node);
		return result;
	}

	private static void bfs(List<List<Integer>> result, List<TreeNode> node) {
		List<Integer> temp = new ArrayList<Integer>();
		List<TreeNode> tempNode = new ArrayList<TreeNode>();
		for (TreeNode a : node) {
			temp.add(a.val);
			if (a.left != null)
				tempNode.add(a.left);
			if (a.right != null)
				tempNode.add(a.right);
		}
		result.add(0,temp);
		if (tempNode.isEmpty()) {
			return;
		} else {
			bfs(result, tempNode);
		}
	}

}
