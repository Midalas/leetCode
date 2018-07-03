package leetCode;

import java.util.ArrayList;
import java.util.List;

public class leetCode662 {

	public static void main(String[] args) throws Exception {

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
		//当前层的宽度
		int curWid = index - ans.get(level) + 1;
		//左子树的宽度
		int leftWid = dfs(root.left, level + 1, index * 2);
		//右子树的宽度
		int rightWid = dfs(root.right, level + 1, index * 2 + 1);
		return Math.max(curWid, Math.max(leftWid, rightWid));
	}
}
