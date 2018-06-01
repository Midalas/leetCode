package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

@SuppressWarnings("unused")
public class leetCode101 {

	public static void main(String[] args) throws Exception {
	
//	     1
//	    / \
//	   2   2
//	  / \ / \
//	 3  4 4  3
		TreeNode root=new TreeNode(1);
		root.left=new TreeNode(2);
		root.right=new TreeNode(2);
		root.left.left=new TreeNode(3);
		root.left.right=new TreeNode(5);
		root.right.left=new TreeNode(4);
		root.right.right=new TreeNode(3);

		isSymmetric(root);
		
		System.out.println();
	}

	
	
	public static boolean isSymmetric(TreeNode root) {
		if(root==null)
			return true;	
        return dfs(root.left,root.right);
    }
	
	private static boolean dfs(TreeNode p,TreeNode q){
		if(p==null||q==null)
			return p==null&&q==null?true:false;
		return p.val==q.val?dfs(p.left,q.right)&&dfs(p.right,q.left):false;
	}
	

	
	
	
	
	
	
	
	
	

}
