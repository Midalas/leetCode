package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetCode655 {

	public static void main(String[] args) throws Exception {

		TreeNode root = leetCode297.deserialize("1,2,5,3,#,#,#,4,#");
		printTree(root);

		System.out.println();

	}

	public static int height655 = 0;
	//先求高度,再层次遍历
	public static List<List<String>> printTree(TreeNode root) {
		height655 = 1;
		dfs(root, height655);
		int h = height655;
		List<List<String>> result = new ArrayList<List<String>>();
		List<TreeNode> rootList = new ArrayList<TreeNode>();
		rootList.add(root);
		while (h > 0 && !rootList.isEmpty()) {
			String[] array = new String[(int) Math.pow(2, height655) - 1];
			for (int j = 0; j < array.length; j++)
				array[j] = "";
			List<TreeNode> tempList = new ArrayList<TreeNode>();
			for (int i = 0; i < rootList.size(); i++) {
				TreeNode p = rootList.get(i);
				int index = (int) Math.pow(2, h - 1) - 1 + (int) Math.pow(2, h) * i;
				if (p == null) {
					tempList.add(null);
					tempList.add(null);
				} else {
					array[index] = "" + p.val;
					tempList.add(p.left);
					tempList.add(p.right);
				}
			}
			result.add(Arrays.asList(array));
			rootList = tempList;
			h--;
		}
		return result;
	}

	private static void dfs(TreeNode root, int height) {
		if (root == null)
			return;
		if (root.left != null)
			dfs(root.left, height + 1);
		if (root.right != null)
			dfs(root.right, height + 1);
		height655 = height > height655 ? height : height655;
	}
}
