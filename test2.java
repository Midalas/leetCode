package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class test2 {

	public static void main(String[] args) throws Exception {

		TreeNode root = leetCode297.deserialize("1,1,1,1,1,1,1,#,#,#,1,#,#,#,#,2,2,2,2,2,2,2,#,2,#,#,2,#,2");
		int x = widthOfBinaryTree(root);
		System.out.println();

	}

	private static List<Integer> ans = new ArrayList<>();
	public static int widthOfBinaryTree(TreeNode root) {
		ans = new ArrayList<>();
		return dfs(root, 0, 1);
	}
	private static int dfs(TreeNode root, int level, int index) {
		if (root == null)
			return 0;
		if (ans.size() == level)
			ans.add(index);
		int curWid = index - ans.get(level) + 1;
		int leftWid = dfs(root.left, level + 1, index * 2);
		int rightWid = dfs(root.right, level + 1, index * 2 + 1);
		return Math.max(curWid, Math.max(leftWid, rightWid));
	}

	

	// Time Limit Exceeded
	public static int widthOfBinaryTree_a(TreeNode root) {
		if (root == null)
			return 0;
		List<TreeNode> nodeList = new LinkedList<TreeNode>();
		nodeList.add(root);
		int width = 0;
		int width_now = 0;
		while (!nodeList.isEmpty()) {
			List<TreeNode> tempList = new LinkedList<TreeNode>();
			int start = Integer.MAX_VALUE;
			int end = -1;
			for (int i = 0; i < nodeList.size(); i++) {
				TreeNode p = nodeList.get(i);
				if (p != null) {
					start = i < start ? i : start;
					end = i > end ? i : end;
					tempList.add(p.left);
					tempList.add(p.right);
				} else {
					tempList.add(null);
					tempList.add(null);
				}
			}
			width_now = end - start + 1;
			width = width_now > width ? width_now : width;
			if (width_now < 0)
				break;
			nodeList = tempList;
		}
		return width;
	}

}
