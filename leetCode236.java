package leetCode;

public class leetCode236 {

	public static void main(String[] args) throws Exception {

		TreeNode root = leetCode297.deserialize("6,2,8,0,4,7,9,#,#,3,5,#,#,#,#");
		TreeNode p=root.left.left;
		TreeNode q=root.left.right;
		TreeNode x = lowestCommonAncestor(root, p, q);
		System.out.println();

	}

	public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		if (root == p || root == q || root == null)
			return root;
		//找左子树
		TreeNode left = lowestCommonAncestor(root.left, p, q);
		//找右子树
		TreeNode right = lowestCommonAncestor(root.right, p, q);
	
		if (left == null) {
			return right;
		} else if (right == null) {
			return left;
		} else {
			return root;
		}

	}
}
