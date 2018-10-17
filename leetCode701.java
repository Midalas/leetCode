package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Random;
import java.util.Set;
import java.util.Stack;

@SuppressWarnings("unused")
public class leetCode701 {
	public static void main(String[] args) {

		System.out.println();
	}

	//runtime 3ms
	public TreeNode insertIntoBST(TreeNode root, int val) {
		if (root == null)
			return new TreeNode(val);
		if (root.val < val) {
			root.right = insertIntoBST(root.right, val);
		} else if (root.val > val) {
			root.left = insertIntoBST(root.left, val);
		}
		return root;
	}
}
