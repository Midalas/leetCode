package leetCode;

public class leetCode671 {

	public static void main(String[] args) throws Exception {

		TreeNode root = leetCode297.deserialize("2,2,2,4,2,2,2,#,#,#,#,2,5,#,#");
		int x = findSecondMinimumValue(root);
		System.out.println();

	}

	private static int[] a671 = { -1, -1 };
	public static int findSecondMinimumValue(TreeNode root) {
		a671[0] = root.val;
		a671[1] = -1;
		dfs(root);
		return a671[1];
	}

	private static void dfs(TreeNode root){
		if(root==null)
			return;
		if(root.val==a671[0]){
			dfs(root.left);
			dfs(root.right);
		}else if(root.val>a671[0]){
			if(a671[1]==-1||root.val<a671[1])
				a671[1]=root.val;
			return;
		}
	}
}
