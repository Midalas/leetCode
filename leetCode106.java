package leetCode;

public class leetCode106 {

	public static void main(String[] args) throws Exception {
		// 中序遍历 inorder = [8,9,3,15,20,7]
		// 后序遍历 postorder = [8,9,15,7,20,3]
		// 3
		// / \
		// 9 20
		// / / \
		// 8 15 7
		int[] inorder = { 8, 9, 3, 15, 20, 7 };
		int[] postorder = { 8, 9, 15, 7, 20, 3 };
		buildTree(inorder, postorder);
		System.out.println();
	}

	public static TreeNode buildTree(int[] inorder, int[] postorder) {
		if (inorder.length < 1 || inorder.length != postorder.length)
			return null;
		int head = postorder[postorder.length - 1];
		TreeNode root = new TreeNode(head);
		for (int i = 0; i < inorder.length; i++) {
			if (inorder[i] == head) {
				// left
				dfs(root, inorder, 0, i - 1, postorder, 0, i - 1, true);
				// right
				dfs(root, inorder, i + 1, inorder.length - 1, postorder, i, postorder.length - 2, false);
				break;
			}
		}
		return root;
	}

	private static void dfs(TreeNode root, int[] inorder, int p, int q, int[] postorder, int m, int n, boolean left) {
		if (p > q || m > n)
			return;
		int head = postorder[n];
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
			if (inorder[p + i] == head) {
				// left
				dfs(temp, inorder, p, p + i - 1, postorder, m, m + i - 1, true);
				// right
				dfs(temp, inorder, p + i + 1, q, postorder, m + i, n - 1, false);
			}
		}
		return;
	}
}
