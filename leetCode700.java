
package leetCode;

import java.util.ArrayList;
import java.util.List;

public class leetCode700 {

	public static void main(String[] args) throws Exception {
		TreeNode root = leetCode297.deserialize("4,2,7,1,3,#,#");
		int val = 2;
		TreeNode x = searchBST(root, val);

		System.out.println();
	}

	// runtime 3ms
	public static TreeNode searchBST(TreeNode root, int val) {
		if (root == null || root.val == val)
			return root;
		if (root.val > val) {
			return searchBST(root.left, val);
		} else {
			return searchBST(root.right, val);
		}
	}
}
