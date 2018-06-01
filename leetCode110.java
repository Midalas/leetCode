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
public class leetCode110 {

	public static void main(String[] args) throws Exception {
		TreeNode root=new TreeNode(3);
		root.left=new TreeNode(9);
		root.right=new TreeNode(20);
		root.right.left=new TreeNode(15);
		root.right.right=new TreeNode(7);
		
		boolean x=isBalanced(root);
		
		System.out.println();
	}
	
	public static boolean isBalanced(TreeNode root) {
		if(root==null)
			return true;
		if(Math.abs(maxDepth(root.left)-maxDepth(root.right))>1)
			return false;
		return isBalanced(root.left)&&isBalanced(root.right);
    }
	
	public static int maxDepth(TreeNode root) {
		return root==null?0:Math.max(maxDepth(root.left),maxDepth(root.right))+1;
	}


}
