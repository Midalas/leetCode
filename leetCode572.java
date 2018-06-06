package leetCode;

public class leetCode572 {

	public static void main(String[] args) throws Exception {

		TreeNode s = new TreeNode(3);
		s.left = new TreeNode(4);
		s.right = new TreeNode(5);
		s.left.left = new TreeNode(1);
		s.left.right = new TreeNode(2);
		// s.left.right.left = new TreeNode(0);

		TreeNode t = new TreeNode(4);
		t.left = new TreeNode(1);
		t.right = new TreeNode(2);

		boolean x = isSubtree(s, t);

		System.out.println(x);

	}

	public static boolean isSubtree(TreeNode s, TreeNode t) {
		if (s == null)
			return false;
		if (s.val == t.val && judge(s, t))
			return true;
		return isSubtree(s.right, t) || isSubtree(s.left, t);

	}

	private static boolean judge(TreeNode t1, TreeNode t2) {
		if (t1 == null && t2 == null) {
			return true;
		} else if (t1 == null && t2 != null || t1 != null && t2 == null || t1.val != t2.val) {
			return false;
		}
		return judge(t1.left, t2.left) && judge(t1.right, t2.right);
	}

}
