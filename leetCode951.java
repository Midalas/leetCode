package leetCode;

public class leetCode951 {

	public static void main(String[] args) throws Exception {

		TreeNode root1 = leetCode297.deserialize("1,2,3,4,5,6,#,#,#,7,8,#,#");
		TreeNode root2 = leetCode297.deserialize("1,3,2,#,6,4,5,#,#,#,#,8,7");

		boolean x = flipEquiv(root1, root2);
		System.out.println();
	}

	//runtime 6ms
	public static boolean flipEquiv(TreeNode root1, TreeNode root2) {
		if (null == root1) {
			return null == root2;
		}
		if (null == root2) {
			return null == root1;
		}
		if (getVal(root1, true) == getVal(root2, true)) {
			if (getVal(root1, false) == getVal(root2, false)) {
				return flipEquiv(root1.left, root2.left) && flipEquiv(root1.right, root2.right);
			}
		}
		if (getVal(root1, true) == getVal(root2, false)) {
			if (getVal(root1, false) == getVal(root2, true)) {
				return flipEquiv(root1.left, root2.right) && flipEquiv(root1.right, root2.left);
			}
		}
		return false;
	}

	private static int getVal(TreeNode root, boolean isLeft) {
		if (null == root)
			return -2;
		if (isLeft) {
			return root.left == null ? -1 : root.left.val;
		} else {
			return root.right == null ? -1 : root.right.val;
		}
	}

}
