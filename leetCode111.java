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
public class leetCode111 {

	public static void main(String[] args) throws Exception {
//	    3
//	    / \
//	   9  20
//	     /  \
//	    15   7
		TreeNode root=new TreeNode(3);
		root.left=new TreeNode(9);
		root.right=new TreeNode(20);
		root.right.left=new TreeNode(15);
		root.right.right=new TreeNode(7);
		
		
//		TreeNode root=new TreeNode(1);
//		
//		root.left=new TreeNode(2);
//		
		
		int x=minDepth(root);
		System.out.println();
	}
	
	public static int minDepth(TreeNode root) {
		if(root==null)
			return 0;
		return dfsmin(root,Integer.MAX_VALUE,0)+1;
    }
	
	private static int dfsmin(TreeNode root, int min, int depth) {	
		if(root==null)
			return min;
		if(root.left==null&&root.right==null){
			min = depth < min ? depth : min;
			return min;
		}
		return Math.min(dfsmin(root.left, min, depth + 1), dfsmin(root.right, min, depth + 1));
	}


}
