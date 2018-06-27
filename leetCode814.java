package leetCode;

public class leetCode814 {

	public static void main(String[] args) throws Exception {

		TreeNode root = leetCode297.deserialize("1,0,1,0,0,0,1");
		pruneTree(root);
		System.out.println();

	}

	public static TreeNode pruneTree(TreeNode root) {
		if (root == null)
			return null;
		root.left = pruneTree(root.left);
		root.right = pruneTree(root.right);
		if (root.left == null && root.right == null && root.val == 0)
			return null;
		return root;
	}

}
