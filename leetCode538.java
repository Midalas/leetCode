package leetCode;

public class leetCode538 {

	public static void main(String[] args) throws Exception {
		TreeNode root = leetCode297.deserialize("5,2,13,#,#,11,15");
		convertBST(root);
		System.out.println();
	}


	private static int temp = 0;
	
	public static TreeNode convertBST(TreeNode root) {
		temp=0;
		dfs(root);
		return root;
	}

	private static void dfs(TreeNode cur) {
		if (cur == null) return;		
		dfs(cur.right);
		cur.val += temp;
		temp = cur.val;
		dfs(cur.left);
	}

}
