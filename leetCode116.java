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
public class leetCode116 {

	public static void main(String[] args) throws Exception {

		TreeLinkNode root=new TreeLinkNode(1);
		root.left=new TreeLinkNode(2);
		root.right=new TreeLinkNode(3);
		root.left.left=new TreeLinkNode(4);
		root.left.right=new TreeLinkNode(5);
		root.right.left=new TreeLinkNode(6);
		root.right.right=new TreeLinkNode(7);
		connect(root);
		System.out.println();
	}

	public static void connect(TreeLinkNode root) {		
		if(root==null)
			return;
		while (root.left != null) {
			TreeLinkNode temp=root;
			while(temp!=null){ 			
				temp.left.next=temp.right;
				if(temp.next!=null){
					temp.right.next=temp.next.left;
				}
				temp=temp.next;
			}		
			root = root.left;
		}
	}
}
