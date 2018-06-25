package leetCode;

import java.util.ArrayList;
import java.util.List;

public class leetCode653 {

	public static void main(String[] args) throws Exception {

		TreeNode root = leetCode297.deserialize("5,3,6,2,4,#,7");
		findTarget(root, 10);
		System.out.println();
	}

	public static boolean findTarget(TreeNode root, int k) {
		List<Integer> list = new ArrayList<Integer>();
		dfs(list, root);
		int length = list.size();
		int[] array = new int[length];
		for (int i = 0; i < length; i++) {
			array[i] = list.get(i);
		}
		int p = 0;
		while (p < length) {
			for (int i = p + 1; i < length; i++) {
				if (array[p] + array[i] == k)
					return true;
				if (array[p] + array[i] > k)
					break;
			}
			p++;
		}
		return false;
	}
	
	private static void dfs(List<Integer> list, TreeNode root) {
		if (root == null)
			return;
		dfs(list, root.left);
		list.add(root.val);
		dfs(list, root.right);
	}

}
