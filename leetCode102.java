package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

@SuppressWarnings("unused")
public class leetCode102 {

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

		levelOrder(root);

		System.out.println();
	}

	public static List<List<Integer>> levelOrder(TreeNode root) {
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
		result.add(temp);
		if (tempNode.isEmpty()) {
			return;
		} else {
			bfs(result, tempNode);
		}
	}

}
