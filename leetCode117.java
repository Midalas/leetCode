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
public class leetCode117 {

	public static void main(String[] args) throws Exception {

		TreeLinkNode root = new TreeLinkNode(3);
		root.left = new TreeLinkNode(9);
		root.right = new TreeLinkNode(20);

		root.right.left = new TreeLinkNode(15);
		root.right.right = new TreeLinkNode(7);
		connect(root);
		System.out.println();
	}

	public static void connect(TreeLinkNode root) {
		if (root == null)
			return;
		TreeLinkNode temp = root;
		while (temp != null) {
			TreeLinkNode temp1 = new TreeLinkNode(0);
			TreeLinkNode pre = temp1;
			while (temp != null) {
				if (temp.left != null) {
					pre.next = temp.left;
					pre = pre.next;
				}
				if (temp.right != null) {
					pre.next = temp.right;
					pre = pre.next;
				}
				temp = temp.next;
			}
			temp = temp1.next;
		}
	}
}
