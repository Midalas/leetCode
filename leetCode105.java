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
public class leetCode105 {

	public static void main(String[] args) throws Exception {
		// 前序遍历 preorder = [3,9,8,20,15,7]
		// 中序遍历 inorder = [9,3,15,20,7]
		// 3
		// / \
		// 9 20
		// / / \
		// 8 15 7
//		int[] preorder = { 3, 9, 8, 20, 15, 7 };
//		int[] inorder = { 8, 9, 3, 15, 20, 7 };
		int[] preorder = {1,4,3,2 };
		int[] inorder = {1,2,3,4};

		buildTree(preorder, inorder);

		System.out.println();
	}

	public static TreeNode buildTree(int[] preorder, int[] inorder) {
		if (preorder.length < 1 || preorder.length != inorder.length)
			return null;
		int head = preorder[0];
		TreeNode root = new TreeNode(head);
		for (int i = 0; i < inorder.length; i++) {
			if (inorder[i] == head) {
				// left
				dfs(root, preorder, 1, i, inorder, 0, i - 1, true);
				// right
				dfs(root, preorder, i + 1, preorder.length - 1, inorder, i + 1, inorder.length - 1, false);
				break;
			}
		}
		return root;
	}

	private static void dfs(TreeNode root, int[] preorder, int p, int q, int[] inorder, int m, int n, boolean left) {
		if (p > q || m > n)
			return;
		int head = preorder[p];
		TreeNode temp = root;	
		if (left) {
			root.left = new TreeNode(head);
			temp = root.left;
		} else {
			root.right = new TreeNode(head);
			temp = root.right;
		}
		if (p == q || m == n)
			return;
		for (int i = 0; i <= n - m; i++) {
			if (inorder[m + i] == head) {
				// left
				dfs(temp, preorder, p + 1, p + i, inorder, m, m + i - 1, true);
				// right
				dfs(temp, preorder, p + i + 1, q, inorder, m + i + 1, n, false);
			}
		}
		return;
	}

}
