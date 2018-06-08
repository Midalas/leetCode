package leetCode;

public class leetCode543 {

	public static void main(String[] args) throws Exception {
		TreeNode root=leetCode297.deserialize("1,2,3,4,5,#,#");
		int x=diameterOfBinaryTree(root);
		System.out.println(x);
	}

	public static int diameterOfBinaryTree(TreeNode root) {
        if(root==null)
        	return 0;
        return Math.max(dfs(root.left)+dfs(root.right),Math.max(diameterOfBinaryTree(root.left), diameterOfBinaryTree(root.right)));
    }
	private static int dfs(TreeNode root){		
		return root==null?0:Math.max(dfs(root.left),dfs(root.right))+1;
	}
}
