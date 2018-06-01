package leetCode;

import java.util.ArrayList;
import java.util.List;


public class leetCode94 {

	public static void main(String[] args) throws Exception {
		TreeNode root=new TreeNode(1);
		root.right=new TreeNode(2);
		root.right.left=new TreeNode(3);
		inorderTraversal(root);
		System.out.println();

	}

	public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result=new ArrayList<Integer>();
        dfs(result,root);
        return result;
    }
	
	private static void dfs(List<Integer> result,TreeNode root){
		if(root==null)
			return;
		dfs(result,root.left);
		result.add(root.val);
		dfs(result,root.right);
	}
}
