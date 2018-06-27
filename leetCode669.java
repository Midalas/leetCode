package leetCode;

public class leetCode669 {

	public static void main(String[] args) throws Exception {

		// TreeNode root = leetCode297.deserialize("3,0,4,#,2,#,#,1,#");
		// TreeNode x=trimBST(root,1,3);

		TreeNode root = leetCode297.deserialize("1,0,2");
		TreeNode x = trimBST(root, 1, 2);

		// TreeNode root = leetCode297.deserialize("3,1,4,#,2,#,#");
		// TreeNode x = trimBST(root, 1, 2);

		System.out.println();

	}

	public static TreeNode trimBST(TreeNode root, int L, int R) {
		if (root == null)
			return null;
		if (root.val < L)
			return trimBST(root.right, L, R);
		if (root.val > R)
			return trimBST(root.left, L, R);
		root.left = trimBST(root.left, L, R);
		root.right = trimBST(root.right, L, R);
		return root;
	}

}
