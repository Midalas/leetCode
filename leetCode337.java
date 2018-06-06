package leetCode;

public class leetCode337 {

	public static void main(String[] args) throws Exception {
		// TreeNode root = new TreeNode(3);
		// root.left = new TreeNode(2);
		// root.left.right = new TreeNode(3);
		// root.left.right.left = new TreeNode(4);
		// root.left.right.left.left = new TreeNode(1);
		// root.left.right.left.right = new TreeNode(6);
		// root.right = new TreeNode(3);
		// root.right.right = new TreeNode(1);
		// root.right.right.right = new TreeNode(5);
		// root.right.right.right.left = new TreeNode(2);
		// root.right.right.right.right = new TreeNode(7);

		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(2);
		root.left.right = new TreeNode(3);
		root.right = new TreeNode(3);
		root.right.right = new TreeNode(1);
		int x = rob(root);

		System.out.println(x);

	}

	//DP 
	public static int rob(TreeNode root) {
	        int[] num = dfs(root);
	        return Math.max(num[0],num[1]);
	    }
	 //res[1]含 res[0]不含
	private static int[] dfs(TreeNode node){
	        if(node==null)
	            return new int[2];
	        int[] left = dfs(node.left);
	        int[] right = dfs(node.right);
	        int [] res = new int[2];
	        res[1] = left[0]+right[0]+node.val;
	        res[0] = Math.max(left[1],left[0])+Math.max(right[1],right[0]);
	        return res;
	}
	
	//从上向下递归
	public static int rob1(TreeNode root) {
		if (root == null)
			return 0;
		int temp = 0;
		if (root.left != null)
			temp += rob(root.left.left) + rob(root.left.right);
		if (root.right != null)
			temp += rob(root.right.left) + rob(root.right.right);
		return Math.max(root.val + temp, rob(root.left) + rob(root.right));
	}

}
