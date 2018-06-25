package leetCode;

public class leetCode617 {

	public static void main(String[] args) throws Exception {

		TreeNode t1 = leetCode297.deserialize("1,2,3,4,5,6,7");
		TreeNode t2 = leetCode297.deserialize("3,4,5,5,4,#,7");

		TreeNode x = mergeTrees(t1, t2);
		System.out.println(x);
	}

	public static TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
		if (t1 == null)
			return t2;
		if (t2 == null)
			return t1;
		t1.val = t1.val + t2.val;
		t1.left = mergeTrees(t1.left, t2.left);
		t1.right = mergeTrees(t1.right, t2.right);
		return t1;
	}

}
